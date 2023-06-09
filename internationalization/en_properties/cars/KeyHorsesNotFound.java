package internationalization.en_properties.cars;
import java.util.*;
public class KeyHorsesNotFound {
    /**
     * Given the four properties files , what does this code print?
        A. France null engine
        B. France 241 moteur
        C. France 45 moteur
        D. France 241 engine
        E. France 45 engine
        F. An exception is thrown at runtime.
        
        The getBundle() method matches Cars_fr_FR.properties.
        It will then fallback to Cars_fr.properties (which does not exist) and Cars.properties
        if the value is not available. For this reason,
        the first and third values would beFrance and moteur.
        While the second value horsesis in the default locale,
         it is not available if the requested locale has been found.
         As a result, the code throws a MissingResourceException, making option F the answer.

     */
    public static void main(String... args){
        Locale.setDefault(new Locale("en", "US"));
        var rb = ResourceBundle.getBundle("internationalization.en_properties.cars.Cars",
                                          new Locale("fr", "FR"));
        var s1 = rb.getString("country");
        var s2 = rb.getString("horses");
        var s3 = rb.getString("engine");
        System.out.print(s1+ " " + s2 + " " + s3);
    } 
}