    //import scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
            //Create new scanner
        Scanner scanner = new Scanner(System.in);
            //tell user to press enter
        System.out.println("Press Enter to start timing...");
        scanner.nextLine();
        long startT = System.currentTimeMillis();

            //tell user to press enter to stop programme
        System.out.println("Press Enter to stop timing...");
        scanner.nextLine();
        long endT = System.currentTimeMillis();

            // calculate start time minus end time 
        long elapsedMillis = endT - startT;
        long elapsedSeconds = elapsedMillis / 1000;

            // print results
        System.out.println("Elapsed time: " + elapsedSeconds + " seconds");
    }
}