package internationalization.en_properties.turquoiseKey;
import java.util.*;

public class LoadResourceKeyTurquoise {
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
        ResourceBundle rb = ResourceBundle.getBundle("internationalization.en_properties.turquoiseKey.Colors", loc);
        rb.getString("turquoise");
    }
 
  public static void main(String... argd){

    }
}