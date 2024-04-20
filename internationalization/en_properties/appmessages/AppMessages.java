package internationalization.en_properties.appmessages;
import java.util.*;

/**
  Consider the following piece of code, which is run in an environment where the default locale is English - US
     Locale.setDefault(new Locale("fr", "CA")); //Set default to French Canada
        Locale l = Locale.getDefault();
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
       B.  bonjour
       C.  An exception at run time.
       D.  No message will be printed.
       
     While retrieving a message bundle, you are passing a locale explicitly (fr CA).
     Therefore, appmessages_fr_CA.properties will be loaded. This file contains "bonjour" for "greetings", which is what is printed.
    
    Observe that the setting of default locale makes no difference in this case because the new default
    locale and the locale that you are passing are same and a resource bundle is available for that locale.
    
    However, if you do ResourceBundle.getBundle("appmessages", new Locale("es", "ES"));
    and if there is no appmessages_es_ES.properties file, the role of default locale becomes crucial.
    In this case, appmessages_fr_CA.properties will be loaded instead of appmessages_en_US.properties
    because you've changed the default locale and when a resource bundle is not found for a given locale,
    the default locale is used to load the resource bundle.
    
    Remember that when a resource bundle is not found for a given locale, the default locale is used to load the resource bundle.
     Every effort is made to load a resource bundle if one is not found and there are several fall back options
     (for example, in absence of appmessages_fr_CA.properties, it will look for appmessages_fr.properties).
     As a last resort, it will try to load a resource bundle with no locale information i.e. appresources.properties in this case.
     (An exception is thrown when even this resource bundle is not found.)
    
    
    You need to understand this aspect for the purpose of the exam.
    Please go through http://docs.oracle.com/javase/7/docs/api/java/util/ResourceBundle.html#getBundle(java.lang.String,%20java.util.Locale,%20java.lang.ClassLoader)
    for further details.
    
 */
public class AppMessages {
     public static void main(String... args){
         Locale.setDefault(new Locale("fr", "CA")); //Set default to French Canada
        Locale l = Locale.getDefault();
        ResourceBundle rb = ResourceBundle.getBundle("internationalization.en_properties.appmessages.appmessages", l);
        String msg = rb.getString("greetings");
        System.out.println(msg);
     }
}