package supportingInternationalizationAndLocalization;
import java.util.*;
import java.text.*;

class ParsingNumbers{

   static void basicParseNumber() throws ParseException{
      String s = "40.45";
      var en = NumberFormat.getInstance(Locale.US);
      System.out.println("US : " + en.parse(s));
      var fr  = NumberFormat.getInstance(Locale.FRANCE);
      System.out.println("FRANCE : " + fr.parse(s));
   }

   static void parsingCurrency() throws ParseException {
      
      String income = "$92,807.99"; //$92,807.99
      var cf = NumberFormat.getCurrencyInstance(Locale.US);
      double value = (Double) cf.parse(income);
      System.out.println("from " + income + " to " +  value);
   }

   public static void main(String[] args) throws ParseException{
     System.out.println("Basic Parsing Below");
     basicParseNumber();
     System.out.println();
     
     System.out.println("Parsing Currency Below");
     parsingCurrency();
     System.out.println();
   }
}
