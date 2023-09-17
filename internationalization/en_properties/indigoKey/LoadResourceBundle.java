package internationalization.en_properties.indigoKey;
import java.util.*;
public class LoadResourceBundle {
    /**
       Assuming the key indigo is in all five of the files referenced in the options,
       which file will the following code use for the resource bundle?

        A. Colors_default.properties
        B. Colors_en_US.properties
        C. Colors_CH.properties
        D. Colors_en.properties
        E. Colors_es.properties
        F. None of the above

        Java starts out by looking for a properties file with the requested locale,
        which in this case is the fr_CH language and country.
        It doesn’t find Colors_fr_CH.properties,
        so it moves onto the locale with just a language code fr.
        It also does not find Colors_fr.properties.
        It then moves on to the default locale it_CH checking Colors_it_CH.properties,
        but there is still no match. It drops the country code and checks it for Colors_it.properties,
        but still doesn’t find a match. Lastly, it checks for a Colors.properties
        file but since that’s not an option, it fails.
        The result is a MissingResourceException is thrown at runtime, making option F correct.
     */
    static void loadWithIndigoKey(){
        Locale loc = new Locale("fr", "CH");
        Locale.setDefault(new Locale("it", "CH"));
        ResourceBundle rb = ResourceBundle.getBundle(
          "internationalization.en_properties.indigoKey.Colors",
         loc
        );
        rb.getString("Indigo");

    }
    
    public static void main(String... argd){
        loadWithIndigoKey();
    }
}