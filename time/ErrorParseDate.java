package time;
import java.time.*;
import java.time.format.*;

class  ErrorParseDate{
  static void localDateParse(){
    LocalDate date = LocalDate.parse("2020-04-30",  DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    System.out.println(date.getYear() + " " + date.getMonth() + " "+ date.getDayOfMonth());
  }

  public static void main(String... args){
     localDateParse();
  }
}
