    //Import libraries
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
            // make to show the format yyyy-MM-dd'T'HH:mm
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");

            // show different time zones
        ZonedDateTime newYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));
        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

            //Output results
        System.out.println("New York: " + newYork.format(formatter));
        System.out.println("London: " + london.format(formatter));
        System.out.println("Tokyo: " + tokyo.format(formatter));
    }
}