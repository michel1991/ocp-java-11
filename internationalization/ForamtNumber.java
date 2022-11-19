package internationalization;
import java.util.stream.*;
import java.text.*;

public class ForamtNumber {
    /**
    * QUESTION:  For what value of pattern will the following print <005.21> <008.49> <1,234.0>?
    * A. ##.#
    * B. 0,000.0#
    * C. #,###.0
    * D. #,###,000.0#
    * E. The code does not compile regardless of what is placed in the blank.
    *
    * When working with a custom number formatter, the 0 symbol displays the digit as 0, even if it’s not present, while the # symbol omits the digit from the start or end of the String if it is not present.
    * Based on the requested output, a String that displays at least three digits before the decimal (including a comma) and at least one after the decimal is required.
    * It should display a second digit after the decimal if one is available. For this reason, option D is the correct answer.
    * In case you are curious, option A displays at most only one value to the right of the decimal, printing <5.2> <8.5> <1234>.
    * Option B is close to the correct answer but always displays four digits to the left of the decimal, printing <0,005.21> <0,008.49> <1,234.0>.
    * Finally, option C is missing the zeros padded to the left of the decimal and optional two values to the right of the decimal, printing <5.2> <8.5> <1,234.0>.
     */
   static void formatDoubleWithStream(){
       String pattern = "#,###,000.0#";
       var message = DoubleStream.of(5.21, 8.49, 1234)
                .mapToObj(v -> new DecimalFormat(pattern).format(v))
                .collect(Collectors.joining("> <"));
                       System.out.println("<"+message+">");
   }

    public static void main(String... args){
        formatDoubleWithStream();
    }
}