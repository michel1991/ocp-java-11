package internationalization.en_properties;
import java.util.*;
public class LoadResources {
    

    

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
            *  The result is a MissingResourceException is thrown at runtime, making option F correct.
     */
    static void loadWithIndigoKey(){
        Locale loc = new Locale("fr", "CH");
        Locale.setDefault(new Locale("it", "CH"));
        ResourceBundle rb = ResourceBundle.getBundle("Colors", loc);
        rb.getString("Indigo");

    }


        /**
           Assuming the key turquoise is in all five of the files referenced in the options,
           which file will the following code use for the resource bundle?
            A. Colors_en.properties
            B. Colors_CN.properties
            C. Colors.properties
            D. Colors_default.properties
            E. Colors_en_CN.properties
            F. None of the above

            Java starts out by looking for a properties file with the requested locale,
           which in this case is the zh_CN language and country.
           It doesn’t find it, so it moves onto the locale with just a language code zh, which it also does not find.
            It then moves on to the default locale en_US, but there is still no match.
           It drops the country code and does find a match with en, making option A correct
         */
    static void loadWithTurquoiseKey(){
        Locale loc = new Locale("zh", "CN");
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle rb = ResourceBundle.getBundle("Colors", loc);
        rb.getString("turquoise");
    }

    /**
        Assuming the key green is in all five of
        the files referenced in the options,
        which file will the following code use for the resource bundle?

        A. Colors_default.properties
        B. Colors.properties
        C. Colors_en.properties
        D. Colors_US.properties
        E. Colors_en_US.properties
        F. None of the above

        Java starts out by looking for a properties file with the requested locale,
         which in this case is the fr language.
         It doesn’t find it, so it moves onto the default localeen_US,
         which it does find, making option E correct.
     */
    static void loadGrrenKey(){
        Locale.setDefault(new Locale("en", "US"));
        var rb = ResourceBundle.getBundle("Colors", new Locale("fr"));
        System.out.print(rb.getString("green"));
    }

   
}