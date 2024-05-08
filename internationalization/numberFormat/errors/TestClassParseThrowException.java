package internationalization.numberFormat.errors;
/**
 * What will the following code print when run?
    A. It will always print two equal numbers.
    B. It will always print two unequal numbers.
    
    C. It will not compile.
    Remember that parse() method of DateFormat and NumberFormat throws java.text.ParseException.
    So it must either be declared in the throws clause of the main() method or the call to parse() must be wrapped in a try/catch block.
    
    D. It will throw an exception at runtime.
    E. None of these.

   Note that if you rectify the exception problem, the output will depend on which location in which you run this program.
   For example, if you run it on a machine with US as the Locale, it will print two unequal numbers because the string generated
   by the formatter created using French locale will be 123 456,789.
   This will not be parsed correctly by the second formatter, which is created using the default locale (which is US).
   In fact, it will parse it as 123.
  correct(C)
 */

import java.util.*;
import java.text.*;

 class TestClass
{
    public static void main(String[] args)
    {
        double amount = 123456.789;
        Locale fr = new Locale("fr", "FR");
        NumberFormat formatter = NumberFormat.getInstance(fr);
        String s = formatter.format(amount) ;
        formatter = NumberFormat.getInstance();
        Number amount2 = formatter.parse(s);
        System.out.println( amount + " " + amount2 );
    }
}

public class TestClassParseThrowException {
    
}