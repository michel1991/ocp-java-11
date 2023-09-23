package internationalization.dateTimeFormat.format;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class UseParseBeforeFormat {
    /**
     * What is the output of the following code snippet?
        A. 2022-00-21
        B. 2022-00-22
        C. 2022-01-21
        D. 2022-01-22
        E. The code does not compile.
        F. An exception is thrown at runtime.

        The code compiles and runs without issue.
        The data is in a valid date format,
        so the text is parsed as January 21, 2022.
        Date values are indexed from 1, not 0,
        making option C the correct output.
        Note that a date formatter is able
        to format a date/time value, as the time element can be discarded.

     */
    static void formatWithDate(){
        var d = LocalDateTime.parse("2022-01-21T12:00:00",DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.print(d.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }

    public static void main(String... args){
        formatWithDate();
    }
}