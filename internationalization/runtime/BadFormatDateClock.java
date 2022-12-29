package internationalization.runtime;
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
}