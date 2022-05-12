package loadingPropertiesWithResourceBundles;
import java.util.*;

class CreatingAResourceBundle{
   public static void printWelcomeMessage(Locale locale){
      var rb = ResourceBundle.getBundle("loadingPropertiesWithResourceBundles.Zoo", locale);
      System.out.println(rb.getString("hello") + ", "+ rb.getString("open"));
  }

   public static void main(String[] args){
    var us = new Locale("en", "US");
    var france = new Locale("fr", "FR");
    printWelcomeMessage(us);
    printWelcomeMessage(france);
   }
}
