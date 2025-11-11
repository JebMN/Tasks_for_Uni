    //Import date and time libraries
import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
            //Make functions 
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
            //Print out results
        System.out.println("Current Date : " + today);
        System.out.println("Current Time : " + time);
        System.out.println("Current Time-Date" + today + " " + time);
    }
}