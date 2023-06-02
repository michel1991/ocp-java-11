package internationalization.numberFormat;
import java.util.stream.*;
import java.text.*;
import java.util.*;
import static java.util.Locale.Category;

public class FormatNumbers {

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
            In this sample, the default locale is set to US,
            while the default locale format is set to GERMANY.
            Neither is used for formatting the value,
            as getCurrencyInstance() is called with UK as the locale.
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