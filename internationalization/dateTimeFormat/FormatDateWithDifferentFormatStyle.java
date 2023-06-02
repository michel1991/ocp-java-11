package internationalization.dateTimeFormat;
import java.time.format.*;
import java.time.*;

public class FormatDateWithDifferentFormatStyle {
 static void formatWithShortStyle(){
     LocalDateTime ldt = LocalDateTime.of(2020, 5, 10, 11, 22, 33);
     var f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
     System.out.println("Short Format " + ldt.format(f));
  }

    static void formatWithMediumStyle(){
     LocalDateTime ldt = LocalDateTime.of(2020, 5, 10, 11, 22, 33);
      var f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
      System.out.println("MEDIUM Format " + ldt.format(f));
  }

    static void formatWithLongStyleOnlyWithZonedId(){
      var f = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
      ZonedDateTime zoned = ZonedDateTime.now();

      System.out.println("Long Format " + zoned.format(f));
   }

    static void formatWithFullStyleOnlyWithZonedId(){
     ZonedDateTime zoned = ZonedDateTime.now();
     var f = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
     System.out.println("Long Format " + zoned.format(f));
   }

    public static void main(String... args){
     formatWithShortStyle();
     formatWithMediumStyle();
     formatWithLongStyleOnlyWithZonedId();
     formatWithFullStyleOnlyWithZonedId();
   }

}