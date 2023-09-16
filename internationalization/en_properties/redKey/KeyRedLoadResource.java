package internationalization.en_properties.redKey;
import java.util.*;

public class KeyRedLoadResource {
    /**
      Assuming the key red is in all five of the files referenced in the options,
       which file will the following code use for the resource bundle?

        A. Colors.properties
        B. Colors_en_US.properties
        C. Colors_US.properties
        D. Colors_ES.properties
        E. Colors_ca.properties
        F. None of the above

        Java starts out by looking for a properties file with the requested locale,
        which in this case is the ca_ES language and country. It doesn’t find it,
        so it moves onto the locale with just a language code ca,
        which it does find, making option E correct.
     */
  static void load(){
      Locale.setDefault(new Locale("en", "US"));
      var rb = ResourceBundle.getBundle("internationalization.en_properties.redKey.Colors",
                                        new Locale("ca","ES"));
      System.out.print(rb.getString("red"));
  }
}