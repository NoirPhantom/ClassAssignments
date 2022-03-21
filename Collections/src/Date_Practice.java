import java.util.*;

public class Date_Practice {
        public static void main(String[] args) {

                // Creating day with parameters
                Date d1 = new Date(2000, 11, 21);
                Date d2 = new Date();
                Date d3 = new Date(2010, 1, 3);

                // Return true if d3 is after d1 or false
                boolean a = d3.after(d1);
                System.out.println("Date d3 comes after " +
                                "date d2: " + a);

                // Returning true if d3 is before d2 or false
                boolean b = d3.before(d2);
                System.out.println("Date d3 comes before " +
                                "date d2: " + b);

                // Comparing if
                int c = d1.compareTo(d2);
                System.out.println(c);

                // Returning the amount of milliseconds between the specific date to the date
                // being specified
                System.out.println("Miliseconds from Jan 1 " +
                                "1970 to date d1 is " + d1.getTime());

                // Returning time and date before changing and after change
                System.out.println("Before setting: " + d2);
                d2.setTime(204587433443L);
                System.out.println("After setting: " + d2);

        }

}
