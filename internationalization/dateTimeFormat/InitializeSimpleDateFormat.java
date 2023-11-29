package internationalization.dateTimeFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.*;

/**
 * How will you initialize a SimpleDateFormat object so that the following code will print the full name of the month of the given date?
    System.out.println(sdf.format(new Date()));
 */
public class InitializeSimpleDateFormat {
    public static void main(String... args){
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM", Locale.FRANCE);
        /**
             A. SimpleDateFormat sdf = new SimpleDateFormat("MMMM", Locale.FRANCE);
               Upper case M is for Month. For example, for February and December, the following will be printed:
    
                M => 2, 12
                MM => 02, 12
                MMM => févr., déc.
                MMMM => février, décembre
            
            B. SimpleDateFormat sdf = new SimpleDateFormat("M*", Locale.FRANCE);
                M* will print the month number (i.e. 2 for Feb and 12 for Dec), followed by *. For example, 2* or 12*.
            C. SimpleDateFormat sdf = new SimpleDateFormat("mmmm", Locale.FRANCE);
                Lower case m is for minutes. So mmmm will print the current minute,
                where the first two digits will always be zero. For example, 0032 or 0002.
            D. SimpleDateFormat sdf = new SimpleDateFormat("mmm", Locale.FRANCE);
            E. SimpleDateFormat sdf = new SimpleDateFormat("MM", Locale.FRANCE);
            
            
            For the purpose of the exam, you need to know the basic codes for printing out a date.
            The important ones are m, M, d, D, e, y, s, S, h, H, and z.
            You should check the complete details of these patterns here:
            https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html
            The important point to understand is how the length of the pattern determines the output of text and numbers.

            Text: The text style is determined based on the number of pattern letters used.
            Less than 4 pattern letters will use the short form. Exactly 4 pattern letters will
            use the full form. Exactly 5 pattern letters will use the narrow form.
            Pattern letters 'L', 'c', and 'q' specify the stand-alone form of the text styles.

            Number: If the count of letters is one, then the value is output
            using the minimum number of digits and without padding. Otherwise,
            the count of digits is used as the width of the output field, with the value zero-padded as necessary.
            The following pattern letters have constraints on the count of letters.
            Only one letter of 'c' and 'F' can be specified. Up to two letters of 'd', 'H', 'h', 'K', 'k', 'm', and 's'
            can be specified. Up to three letters of 'D' can be specified.

            Number/Text: If the count of pattern letters is 3 or greater,
            use the Text rules above. Otherwise use the Number rules above.
            
            Correct(A)
            
         */
    }
}