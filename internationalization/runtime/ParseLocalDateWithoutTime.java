package internationalization.runtime;
import java.util.*;
import java.time.*;
import java.time.format.*;

public class ParseLocalDateWithoutTime {
    /**
     *  What is the output of the following code?
        A. 2020 APRIL 2
        B. 2020 APRIL 30
        C. 2020 MAY 2
        D. The code does not compile.
        E. A runtime exception is thrown.

        A LocalDate does not have a time element. Therefore,
        a Date/Time formatter is not appropriate. The code compiles but throws an exception at runtime.
        If ISO_LOCAL_DATE was used, then the code would compile and option B would be the correct answer.

     */
  static void parse(){
      LocalDate date = LocalDate.parse("2020-04-30",DateTimeFormatter.ISO_LOCAL_DATE_TIME);
      System.out.println(date.getYear() + " " + date.getMonth() + " "+ date.getDayOfMonth());
  }
}