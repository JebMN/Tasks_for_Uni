    //import libs
import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            //take start input from user
        System.out.print("Enter start date (YYYY-MM-DD): ");
        LocalDate begining = LocalDate.parse(scanner.nextLine());
            //take end input from user 
        System.out.print("Enter end date (YYYY-MM-DD): ");
        LocalDate end = LocalDate.parse(scanner.nextLine());


        if (end.isBefore(begining)) {
            System.out.println("End date must be after start date!");
            return;
        }
        int workingDays = 0;
             //for loop for counting all the days 
        for (LocalDate date = begining; !date.isAfter(end); date = date.plusDays(1)) {
            DayOfWeek day = date.getDayOfWeek();
            if (day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY) {
                workingDays++;
            }
        }
        System.out.println("Total working days: " + workingDays);
    }
}