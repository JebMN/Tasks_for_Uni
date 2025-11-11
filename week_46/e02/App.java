    //import libraries
import java.util.Scanner;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        //create a new scanner and date function
    Scanner scanner = new Scanner(System.in);  
    LocalDate today = LocalDate.now();

    System.out.println("Enter a number of dates");
    int days = scanner.nextInt();
    LocalDate otherD = today.plusDays(days);

    System.out.println("In " + days + "days, the date will be " + otherD);

    }
}