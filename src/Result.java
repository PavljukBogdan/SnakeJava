
import java.text.ParseException;
import java.time.LocalDate;


public class Result {


        public static String findDay(int month, int day, int year) throws ParseException {
            LocalDate date = LocalDate.of(year,month,day);
            return date.getDayOfWeek().toString().toUpperCase();

        }
}


/*TimeZone timeZone = TimeZone.getDefault();
            Calendar calendar = new GregorianCalendar(timeZone);
            calendar.set(year,day,month);
            String dayName = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH);
           return dayName.toUpperCase();



           import java.time.LocalDate;

public static String getDay(String day, String month, String year) {
    int d = Integer.valueOf(day);
    int m = Integer.valueOf(month);
    int y = Integer.valueOf(year);
    LocalDate date = LocalDate.of(y, m, d);
    return date.getDayOfWeek().toString();
}*/
