import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter a date in the format <YYYY-MM-DD>: ");
        String inDate = scanner.nextLine();

        LocalDate date = LocalDate.parse(inDate);

        String formattedDate = date.format(formatter);

        System.out.println("Formatted Date : " + formattedDate);
    }
}