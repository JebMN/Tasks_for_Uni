    //import libraries
import java.util.Scanner;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        //create a new scanner 
    Scanner scanner = new Scanner(System.in);  
            //Take first set of inputs 
      System.out.print("Enter first time (HH:MM): ");
        String Input1 = scanner.nextLine();
        LocalTime time1 = LocalTime.parse(Input1);
            //Take second set of inputs 
        System.out.print("Enter second time (HH:MM): ");
        String Input2 = scanner.nextLine();
        LocalTime time2 = LocalTime.parse(Input2);
        
        int mins1 = time1.getHour() * 60 + time1.getMinute();
        int mins2 = time2.getHour() * 60 + time2.getMinute();
            //Convert and get the hour and minute difference
        int diff = Math.abs(mins2 - mins1);
        int hours = diff / 60;
        int minutes = diff % 60;
        System.out.println("Time difference: " + hours + " hours and " + minutes + " minutes");
    }
}