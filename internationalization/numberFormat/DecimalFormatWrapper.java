package internationalization.numberFormat;
import java.util.stream.*;
import java.text.*;
import java.util.*;
import java.util.function.*;

public class DecimalFormatWrapper {
    /**
     QUESTION:  For what value of pattern will the following print <005.21> <008.49> <1,234.0>?
      A. ##.#
      B. 0,000.0#
      C. #,###.0
      D. #,###,000.0#
       E. The code does not compile regardless of what is placed in the blank.

     When working with a custom number formatter, the 0 symbol displays the digit as 0,
     even if it’s not present, while the # symbol omits the digit from
     the start or end of the String if it is not present.
     Based on the requested output, a String that displays
     at least three digits before the decimal (including a comma)
     and at least one after the decimal is required.
     It should display a second digit after the decimal if one is available.
     For this reason, option D is the correct answer.
     In case you are curious, option
     A displays at most only one value to the right of the decimal, printing <5.2> <8.5> <1234>.
     Option B is close to the correct answer but always displays four digits to the left of the decimal,
     printing <0,005.21> <0,008.49> <1,234.0>.
     Finally, option C is missing the zeros padded to the left of the decimal
     and optional two values to the right of the decimal, printing <5.2> <8.5> <1,234.0>.
     */
   static void formatDoubleWithStream(){
        String pattern = "#,###,000.0#";
        var message = DoubleStream.of(5.21, 8.49, 1234)
                .mapToObj(v -> new DecimalFormat(pattern).format(v))
                .collect(Collectors.joining("> <"));
        System.out.println("<"+message+">");
    }

    /**
     *  For what values of pattern will the following print <02.1><06.9><10,00>? (Choose two.)
        A. ##,00.##
        B. ##,00.#
        C. 0,00.#
        D. #,00.#
        E. 0,00.0
        F. #,##.#

        Options B and D correctly print the same string value in the specified format.
        Option A is incorrect because ˂06.92˃ is printed instead of <06.9>.
        Options C and E are incorrect, because (among other things) commas are
        printed as part of both of the first two values.
        Option F is incorrect because <2.1><6.9> is printed instead of <02.1><06.9>
     */
    static void choicePattern(){
        // String pattern = "_______________";
        String pattern = " ##,00.#"; // #,00.#
        var message = DoubleStream.of(2.1, 6.923, 1000)
                .mapToObj(v -> new DecimalFormat(pattern).format(v))
                 .collect(Collectors.joining("><"));
              System.out.print("<" + message + ">");
    }
}