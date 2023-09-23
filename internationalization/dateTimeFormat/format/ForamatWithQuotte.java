package internationalization.dateTimeFormat.format;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ForamatWithQuotte {
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
    
    public static void main(String... args){
        quotte();
    }
}