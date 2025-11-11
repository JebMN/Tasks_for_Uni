    //Import libs
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Duration;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            // Ask user for event date and time
        System.out.print("Enter the event date and time (YYYY-MM-DDTHH:MM): ");
        String input = scanner.nextLine();
        LocalDateTime eventDT = LocalDateTime.parse(input);
        LocalDateTime now = LocalDateTime.now();
        Duration diff = Duration.between(now, eventDT);
            //Calculate total time left
        long totalMinutes = diff.toMinutes();
        long days = totalMinutes / (24 * 60);
        long hours = (totalMinutes % (24 * 60)) / 60;
        long minutes = totalMinutes % 60;

        System.out.println("Time until the event: " + days + " days, " 
        + hours + " hours, and " + minutes + " minutes");
    }
}