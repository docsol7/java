import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarDemo {

    public static void main(String[]args){


        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dt = new SimpleDateFormat();
        System.out.println(dt.format(cal.getTime()));
        System.out.println(cal.getMinimalDaysInFirstWeek());
        System.out.println(cal.getTimeZone());
        System.out.print(cal.getFirstDayOfWeek());
        System.out.print(cal.get(Calendar.AM_PM));
        System.out.print(cal.get(Calendar.HOUR_OF_DAY));
        System.out.print(cal.get(Calendar.SUNDAY));



    }
}
