package internationalization.dateTimeFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatters {
    /**
     *  What is the output of the following code snippet?
        A. 2022-03 2022-01
        B. 2022-01 2022-03
        C. 2022-02 2022-00
        D. yyyy-MM yyyy-MM
        E. The code does not compile.
        F. An exception is thrown at runtime.

      The date/time pattern uses single quotes to escape the date/time values,
       meaning the output is yyyy-MM for all valid inputs. For this reason, option D is correct.
       If the single quotes were removed, then 2022-03 2022-01 would be the correct output

     */
  static void quotte(){
      var x = LocalDate.of(2022, 3, 1);
      var y = LocalDateTime.of(2022, 1, 1, 2, 55);
      var f = DateTimeFormatter.ofPattern("'yyyy-MM'");
      System.out.print(f.format(x) + " " + f.format(y));
  }
    
    /**
     * What is the output of the following code snippet?
        A. 2022-00-21
        B. 2022-00-22
        C. 2022-01-21
        D. 2022-01-22
        E. The code does not compile.
        F. An exception is thrown at runtime.

        The code compiles and runs without issue. The data is in a valid date format,
        so the text is parsed as January 21, 2022. Date values are indexed from 1, not 0,
        making option C the correct output.
        Note that a date formatter is able to format a date/time value, as the time element can be discarded.

     */
    static void formatWithDate(){
        var d = LocalDateTime.parse("2022-01-21T12:00:00",DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.print(d.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }

    public static void main(String... args){
        quotte();
    }
}