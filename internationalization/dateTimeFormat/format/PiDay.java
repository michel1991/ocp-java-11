package internationalization.dateTimeFormat.format;
import java.time.*;
import java.time.format.*;

/**
 * What is the result of the following?
    A. 3.011459
    B. 3.1401MM
    C. 59.011459
    D. 59.1401MM
    E. The code does not compile.
    F. The code compiles but throws an exception at runtime.
    
    The code compiles and runs without issue. The m symbol represents minute,
    so 59 is the first value printed, followed by a period.
    The next symbols ddhh represent day and hour in 2-digit formats,
    so 1401 is printed. Finally, 'MM' represents
    an escaped string using single quotes, so it is printed just as MM.
    For these reasons, option D is correct.

 */
public class PiDay {
    public static void main(String[] args) {
        LocalDateTime pi = LocalDateTime.of(2017, 3, 14, 1, 59);
        DateTimeFormatter formatter = DateTimeFormatter
         .ofPattern("m.ddhh'MM'");
        System.out.print(formatter.format(pi));
    }
}