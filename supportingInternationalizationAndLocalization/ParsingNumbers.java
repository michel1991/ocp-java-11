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

   public static void main(String[] args) throws ParseException{
     System.out.println("Basic Parsing");
     basicParseNumber();
     System.out.println();

   }
}
