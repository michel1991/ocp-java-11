package internationalization.numberFormat.decimalFormat;
import java.util.stream.*;
import java.text.*;
import java.util.*;
import java.util.function.*;

public class ExampleTwo {
    /**
     *  For what values of pattern will the following print <02.1><06.9><10,00>? (Choose two.)
        A. ##,00.##
        B. ##,00.#
        C. 0,00.#
        D. #,00.#
        E. 0,00.0
        F. #,##.#

        Options B and D correctly print the same string value in the specified format.
        Option A is incorrect because <06.92> is printed instead of <06.9>.
        Options C and E are incorrect, because (among other things) commas are
        printed as part of both of the first two values.
        Option F is incorrect because <2.1><6.9> is printed instead of <02.1><06.9>
     */
    static void choicePattern(){
        // String pattern = "_______________";
        String pattern = "##,00.#"; // #,00.#
        System.out.println("For what values of pattern will the following print <02.1><06.9><10,00>?");
        var message = DoubleStream.of(2.1, 6.923, 1000)
                .mapToObj(v -> new DecimalFormat(pattern).format(v))
                 .collect(Collectors.joining("><"));
        System.out.print("<" + message + ">");
        System.out.println("For what values of pattern will the following print <02.1><06.9><10,00>?");
    }

    public static void main(String... args){
        choicePattern();
    }
}