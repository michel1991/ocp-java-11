package loadingPropertiesWithResourceBundles;
import java.util.*;
import java.text.*;

class FormattingMessages{
   static void example(){
      Locale.setDefault(new Locale("en", "US"));
      Locale us = new Locale("en", "US");
      ResourceBundle rb = ResourceBundle.getBundle("loadingPropertiesWithResourceBundles.Zoo",  us);
      String format = rb.getString("helloByName");
      System.out.print(MessageFormat.format(format, "Tammy", "Henry"));
     

   }

   public static void main(String[] args){
     example();
   }

}
