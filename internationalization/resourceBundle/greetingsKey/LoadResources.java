package internationalization.resourceBundle.greetingsKey;
import java.util.*;

public class LoadResources {
    
    /**
        Consider the following piece of code, which is run in an environment where the default locale is English - US:
    
            Locale.setDefault(new Locale("fr", "CA")); //Set default to French Canada
            Locale l = new Locale("jp", "JP");
            ResourceBundle rb = ResourceBundle.getBundle("appmessages", l);
            String msg = rb.getString("greetings");
            System.out.println(msg);
        
        You have created two resource bundles for appmessages, with the following contents:
        
        #In English US resource bundle file
        greetings=Hello
        
        #In French CA resource bundle file
        greetings=bonjour
        
        What will be the output?
        
        A. Hello
        B. bonjour
        C. An exception at run time.
        D. No message will be printed.

       -----------------
        While retrieving a message bundle, you are passing a locale explicitly (jp JP).
        Therefore, it will first try to load appmessages_jp_JP.properties.
        Since this file is not present, it will look for a resource bundle for default locale.
        Since you are changing the default locale to "fr", "CA", it will look for appmessages_fr_CA.properties, which is present.
        This file contains "bonjour" for "greetings", which is what is printed.

        Observe that when a resource bundle is not found for a given locale, the default locale is used to load the resource bundle.
         Every effort is made to load a resource bundle if one is not found and there are several fall back options.
         As a last resort, it will try to load a resource bundle with no locale information i.e. appmessages.properties in this case.
         An exception is thrown when even this resource bundle is not found.
        
        You need to understand this aspect for the purpose of the exam.
        Please go through http://docs.oracle.com/javase/8/docs/api/java/util/ResourceBundle.html#getBundle(java.lang.String,%20java.util.Locale,%20java.lang.ClassLoader)
        for further details.
        Correct(B)
     */
    public static void main(String... args){
        Locale.setDefault(new Locale("fr", "CA")); //Set default to French Canada
        Locale l = new Locale("jp", "JP");
        ResourceBundle rb = ResourceBundle.getBundle("internationalization.resourceBundle.greetingsKey.appmessages", l);
        String msg = rb.getString("greetings");
        System.out.println(msg);
    }
}