package internationalization.en_properties.greenKey;
import java.util.*;
public class LoadResources {

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
        var rb = ResourceBundle.getBundle(
          "internationalization.en_properties.greenKey.Colors",
          new Locale("fr")
        );
        System.out.print(rb.getString("green"));
    }

    public static void main(String... args){
        loadGrrenKey();
    }

   
}