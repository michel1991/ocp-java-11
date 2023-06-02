
package internationalization.numberFormat;
import java.text.*;
import java.util.Locale;

public class BankNumberFormatCase {

    /**
    * What is the output of the following program?
        A. 7,30 €
        B. $7.30
        C. 7.3
        D. The output cannot be determined without knowing the locale of the system where it will be run.
        E. The code does not compile.
        F. None of the above.

        The program compiles, so option E is incorrect. The implementation uses the en_US locale to parse the currency
        String and uses the default locale to format it. In some locale, it will print $7.30, but in other locales,
        it may print other String values such as 7,30 €. For this reason, option D is correct. For this question,
        you did not need to know any specific currency formats, just that the formatting of the value is locale dependent.
     */
    static class Bank {
        private final Locale locale;
        public Bank(Locale locale) {
            this.locale = locale;
        }
       public void printBalance(String v) throws ParseException {
            var n1 = NumberFormat.getCurrencyInstance(locale);
            var n2 = NumberFormat.getCurrencyInstance();
            System.out.print(n2.format(n1.parse(v)));
        }
    }

    public static void main(String[] ignore) throws Exception {
        new Bank(Locale.US).printBalance("$7.30");
    }
}