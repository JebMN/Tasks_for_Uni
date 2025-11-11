// import the libs
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class App {
    public static void main(String[] args) {
            //create new scanner
        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();

            // first prompt
        System.out.print("Enter your birthdate <YYYY-MM-DD>: ");
        String input = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(input);
            // calculate difference
        Period age = Period.between(birthDate, today);
            // output result
        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " 
        + age.getDays() + " days old.");
    }
}