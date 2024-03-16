
package internationalization.locale;
import java.util.*;

public class SetDefaultWithCategory {
    /**
      You want to change the default locale for formatting numbers, currency,
       and percentages. Which of the following statements will achieve that?
     */
    public static void main(String... args){
        /**
            A.
               Locale.setDefault(Locale.EN_US);
               EN_US is not a valid Locale.
               
             B.  Locale.setDefault("en_US");
             C. Locale.setDefault("en", "US");    
         */
        
        /**
         * D
         */
        Locale.setDefault(Locale.Category.FORMAT, Locale.US);
        
        /**
         * E. Locale.setDefault(Locale.Category.FORMAT, "en_US");

         */
        
        /**
         * F
         */
        Locale.setDefault(Locale.US);
        
        /**
         * The default locale for the current instance of the JVM can be changed using the following two static methods of the Locale class:

            static void setDefault(Locale newLocale): Sets the default locale for this instance of the Java Virtual Machine.
            
            static void setDefault(Locale.Category category, Locale newLocale):
            Sets the default locale for the specified Category for this instance of the Java Virtual Machine.
            
            Locale.Category is an enum for locale categories with two values - DISPLAY and FORMAT.
            These locale categories are used to get/set the default locale for the specific functionality represented by the category.
            
            Since the question does not mention that default Locale has to be set "only" for FORMAT category, either of the methods can be used.
         */
        
    }
}