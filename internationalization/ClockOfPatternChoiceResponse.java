package internationalization;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Which of the following, when inserted in the blank, prints It's 4 hours past midnight, and 05 minutes?
   A. "It\'s h hours past midnight, and m minutes"
    B. "'It's 'h' hours past midnight, and 'mm' minutes'"
    C. '"It""s "h" hours past midnight, and "mm" minutes"'
    D. "'It\'s 'h' hours past midnight, and 'mm' minutes'"
    E. '"It""s "h" hours past midnight, and "m" minutes"'
    F. None of the above

    Options C and E do not compile, as a String is escaped with double quotes (") in Java.
    Options A and B compile but produce a runtime exception, as the nonsymbol data is not escaped with single quotes (').
    Option D is almost correct, but a single quote must be escaped with two single quotes.
    If the backslash (\) were changed to a single quote, then it would be the correct answer.

 */
class Clock {
    private void printCurrentTime(LocalTime time) {
        var f = DateTimeFormatter.ofPattern("'It''s 'h' hours past midnight, and 'mm' minutes'"); //  var f = DateTimeFormatter.ofPattern(_________________);
        System.out.print(f.format(time));
    }
    public static void main(String[] unused) {
        new Clock().printCurrentTime(LocalTime.of(4, 5));
    }
}
public class ClockOfPatternChoiceResponse {
    public static void main(String[] unused) {
        Clock.main(unused);
    }
}