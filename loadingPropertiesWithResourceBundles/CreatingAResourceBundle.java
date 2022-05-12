package loadingPropertiesWithResourceBundles;
import java.util.*;

class CreatingAResourceBundle{
   public static void printWelcomeMessage(Locale locale){
      var rb = ResourceBundle.getBundle("loadingPropertiesWithResourceBundles.Zoo", locale);
      System.out.println(rb.getString("hello") + ", "+ rb.getString("open"));
  }

  static void loopThroughtAllProperties(){
    var us = new Locale("en", "US");
     ResourceBundle rb = ResourceBundle.getBundle("loadingPropertiesWithResourceBundles.Zoo", us);
     rb.keySet().stream()
                .map(k -> k + ": "+ rb.getString(k))
                .forEach(System.out::println)
    ;
  }

   public static void main(String[] args){
    var us = new Locale("en", "US");
    var france = new Locale("fr", "FR");
    printWelcomeMessage(us);
    printWelcomeMessage(france);
    System.out.println();
    System.out.println("loop throuh all keys from file Zoo_en propertie file");
    loopThroughtAllProperties();
   }
}
