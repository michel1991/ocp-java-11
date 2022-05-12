package loadingPropertiesWithResourceBundles;
import java.util.*;

class SelectingResourceBundleValues{
   static void example(){
      Locale.setDefault(new Locale("en", "US"));
      Locale locale = new Locale("en", "CA");
      ResourceBundle rb = ResourceBundle.getBundle("loadingPropertiesWithResourceBundles.Zoo", locale);
      System.out.print(rb.getString("hello"));
      System.out.print(". ");
      System.out.print(rb.getString("name"));
      System.out.print(" ");
      System.out.print(rb.getString("open"));
      System.out.print(" ");
      System.out.print(rb.getString("visitors"));
   }

   public static void main(String[] args){
     example();
   }

}
