
import java.time.*;
import java.time.format.DateTimeFormatter;
//import java.time.temporal.ChronoUnit;
import java.util.*;

public class Calendar_Practice {
    public static void main(String[] args) {

        // creating calendar object
        Calendar calendar = Calendar.getInstance();

        // Demonstrating get methods from the calendar class
        System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));
        System.out.println("Current HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));

        // Returning the amount of days in a week
        int max = calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum number of days in a week: " + max);

        // Returning the amount of weeks in a year
        max = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Maximum number of weeks in a year: " + max);

        LocalDate obj1 = LocalDate.now();
        System.out.println("Today's date year, month, and day: " + obj1);
        LocalDate obj2 = LocalDate.of(2017, 4, 20);
        System.out.println(obj2);

        LocalDate date = LocalDate.of(2022, 12, 17);
        System.out.println(date);

        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);

        LocalTime sooner = LocalTime.of(17, 00);
        LocalTime later = LocalTime.of(19, 00);
        Duration duration = Duration.between(sooner, later);
        System.out.println(duration.toHours());

        LocalDateTime Obj = LocalDateTime.now();
        System.out.println("Before formatting: " + Obj);
        DateTimeFormatter formated = DateTimeFormatter.ofPattern("dd-MM-yyyy MM:hh:ss");
        String afterFormated = Obj.format(formated);
        System.out.println("After formatting: " + afterFormated);

    }
}
