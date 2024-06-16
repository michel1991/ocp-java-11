package internationalization.numberFormat;
import java.util.*;
import java.text.*;

/**
 Consider the following code:

    import java.util.*;
    import java.text.*;
    
    public class TestClass
    {
        public static void main(String[] args) throws Exception
        {
            double amount = 53000.35;
            
            Locale jp = new Locale("jp", "JP");
            
            //1 create formatter here.
            
            System.out.println(   formatter.format(amount)  );
        }
    }
    
    How will you create formatter using a factory at //1 so that the output is in Japanese Currency format?
    
    A. NumberFormat formatter =  NumberFormat.getCurrencyFormatter(jp);
    
    B.
       NumberFormat formatter =  new DecimalFormat(jp);
       -----
        1. DecimalFormat has no constructor that takes a Locale.
        2. Creating an object using new as done in this option means you are not using a factory.
        Remember, using a factory to get an object, usually means calling getInstance() or getXXXInstance()
        method on a Factory class such as NumberFormat or DateFormat.
        
    C.
       Format formatter =  NumberFormat.getCurrencyInstance(jp);
        ----
        This is valid because java.text.NumberFormat extends from java.text.Format .
        The return type of the method getCurrencyInstance() is NumberFormat.

    D.
       NumberFormat formatter =  DecimalFormat.getCurrencyInstance(jp);
       ------
        getCurrencyInstance is actually defined in NumberFormat. However, since DecimalFormat extends NumberFormat, this is valid.
        
        To format a number in currency format, you should use getCurrencyInstance() instead of getInstance() or getNumberInstance().
        
        This will print : JPY 53,000
        
    E.
      NumberFormat formatter =  NumberFormat.getInstance(jp);
      ---
        getInstance(Locale ) is a valid factory method in NumberFormat class but it will not not format the given number as per the currency.

    F.
        NumberFormat formatter =  new DecimalFormat("#.00");
        While it is a valid way to create a DecimalFormat object, it is not valid for two reasons:
        1. We need a currency formatter and not just a simple numeric formatter.
        2. This is not using a factory to create the formatter object.
    
    -----   
    To obtain a NumberFormat for a specific locale, including the default locale, call one of NumberFormat's factory methods, such as getInstance().
    In general, do not call the DecimalFormat constructors directly, since the NumberFormat factory methods
    may return subclasses other than DecimalFormat. If you need to customize the format object, do something like this:

    NumberFormat f = NumberFormat.getInstance(loc);
    if (f instanceof DecimalFormat) {
         ((DecimalFormat) f).setDecimalSeparatorAlwaysShown(true);
    }
    
    Correct(C, D)
 */
public class Amount {
    
    public static void main(String[] args) throws Exception
    {
        double amount = 53000.35;
        
        Locale jp = new Locale("jp", "JP");
        
        //1 create formatter here.
        Format formatter =  NumberFormat.getCurrencyInstance(jp);
        
        System.out.println(   formatter.format(amount)  );
    }
}