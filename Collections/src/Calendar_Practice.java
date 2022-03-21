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

    }
}
