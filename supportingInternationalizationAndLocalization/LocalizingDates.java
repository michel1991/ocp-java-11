package supportingInternationalizationAndLocalization;
import java.util.*;
import java.time.*;
import java.time.format.*;
import static java.time.format.FormatStyle.SHORT;
class LocalizingDates{
    public static void print(DateTimeFormatter dtf, LocalDateTime dateTime, Locale locale){
      System.out.println(dtf.format(dateTime) + ", " + dtf.withLocale(locale).format(dateTime) ); 
   }

   public static void main(String[] args){
       Locale.setDefault(new Locale("en", "US"));
       var italy = new Locale("it", "IT");
       var dt = LocalDateTime.of(2020, Month.OCTOBER, 20, 15, 12, 34);
       print(DateTimeFormatter.ofLocalizedDate(SHORT), dt, italy);
       print(DateTimeFormatter.ofLocalizedTime(SHORT), dt, italy);
       print(DateTimeFormatter.ofLocalizedDateTime(SHORT, SHORT), dt, italy);
   }
}
