package internationalization;
import java.util.stream.*;
import java.text.*;
import java.util.*;
import static java.util.Locale.Category;

public class FormatNumbers {
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
       For currency, the US uses the $ symbol, the UK uses the £ symbol, and Germany uses the € symbol.
        Given this information, what is the expected output of the following code snippet?

            A. $1.10
            B. 1,10€
            C. £1.10
            D. The code does not compile.
            E. An exception is thrown at runtime.
            F. The output cannot be determined without knowing the locale of the system where it will be run.

            The code compiles, so option D is incorrect.
            In this sample, the default locale is set to US, while the default locale format is set to GERMANY.
            Neither is used for formatting the value, as getCurrencyInstance() is called with UK as the locale.
            For this reason, the £ symbol is used, making option C correct.
     */
    static void formatToUK(){
        Locale.setDefault(Locale.US);
        Locale.setDefault(Category.FORMAT, Locale.GERMANY);
        System.out.print(NumberFormat.getCurrencyInstance(Locale.UK).format(1.1));

    }

    /**
       For currency, the US uses the $ symbol, the UK uses the £ symbol, and Germany uses the € symbol.
       Given this information, what is the expected output of the following code snippet?

        A. $6.95
        B. 6,95€
        C. £6.95
        D. The code does not compile.
        E. An exception is thrown at runtime.
        F. The output cannot be determined without knowing the locale of the system where it will be run.

        The code compiles, so option D is incorrect.
        While three distinct locale values are set, the one that is used for formatting text is Category.FORMAT.
        For this reason, the GERMANY locale is used to formatting the data with the € symbol, making option B correct.
       *
     */
    static void formatToGermany(){
        Locale.setDefault(Locale.US);
        Locale.setDefault(Category.FORMAT, Locale.GERMANY);
        Locale.setDefault(Category.DISPLAY, Locale.UK);
        System.out.print(NumberFormat.getCurrencyInstance()
                .format(6.95));

    }

    public static void main(String... args){
        formatDoubleWithStream();
    }
}