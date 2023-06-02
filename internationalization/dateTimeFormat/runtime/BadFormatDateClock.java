package internationalization.dateTimeFormat.runtime;
import java.util.*;
import java.time.*;
import java.time.format.*;


public class BadFormatDateClock {
    /**
        Which of the following can be inserted into the blank to allow the code to compile
        and run without throwing an exception? (Choose all that apply.)

        A. ZonedDateTime
        B. LocalDate
        C. LocalDateTime
        D. LocalTime
        E. The code does not compile regardless of what is placed in the blank.
        F. None of the above

       The code compiles, but the first line produces a runtime exception regardless of what is inserted into the blank.
       When creating a custom formatter, any nonsymbol code must be properly escaped using pairs of single quotes (‘).
       In this case, it fails because o is not a symbol. Even if you didn’t know o wasn’t a symbol,
       the code contains an unmatched single quote. If the properly escaped value of "hh' o''clock'" was used,
       then the correct answers would be ZonedDateTime, LocalDateTime, and LocalTime.
       Option B would not be correct because LocalDate values do not have an hour part.
     *
     */
   static void formats(){
       var f = DateTimeFormatter.ofPattern("hh o'clock");
       // System.out.println(f.format_(________________.now())); // ________________
        System.out.println(f.format(LocalDateTime.now())); // ________________
   }

    /**
     * Fill in the blank with the option that allows the code snippet to compile and print a message without throwing an exception at runtime.
        A. f.formatDate(x)
        B. f.formatDate(y)
        C. f.format(x)
        D. f.format(y)
        E. The code does not compile regardless of what is placed in the blank.
        F. None of the above.

        Options A and B are incorrect because formatDate() is not a valid method name in DateTimeFormatter.
        Option E is incorrect because the code compiles if either option C or D is used.
        Both options C and D will produce an exception at runtime, though, as the date pattern is invalid.
         In particular, the apostrophe in o'clock should be escaped.
         Option C is also incorrect because there is no hour value h for a LocalDate.
         If the pattern string was corrected with o''clock, then option D would be correct and print March at 5 o'clock at runtime.

     */
    static void secondExample(){
        var x = LocalDate.of(2022, 3, 1);
        var y = LocalDateTime.of(2022, 3, 1, 5, 55);
        var f = DateTimeFormatter.ofPattern("MMMM' at 'h' o'clock'");
        System.out.print("_______________"); // "_______________"

    }

    /**
     * What is the output of the following code snippet?
        A. 2022APRIL1
        B. 2022MAY0
        C. 2022MAY1
        D. 2022APRIL0
        E. The code does not compile.
        F. An exception is thrown at runtime.

        The parse() method properly reads the date as April 1, 2022.
        The format() tries to use a date/time formatter on a date,
        which produces an exception at runtime since the time element is missing.
        For this reason, option F is correct.

     */
    static void formatWithoutDateTimeInDate(){
        var d = LocalDate.parse("2022-04-01",DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.print(d.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }

    public static void main(String... args){
        
    }
}