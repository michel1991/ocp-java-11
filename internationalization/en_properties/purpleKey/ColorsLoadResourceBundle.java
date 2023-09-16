package internationalization.en_properties.purpleKey;
import java.util.*;

public class ColorsLoadResourceBundle {
    /**
     * Assuming the key purple is in all five of the files referenced in the options, which file will the following code use for the resource bundle?
        A. Colors_en_US.properties
        B. Colors_en.properties
        C. Colors_US.properties
        D. Colors_fr.properties
        E. Colors.properties
        F. None of the above

        Java starts out by looking for a properties file with the requested locale,
        which in this case is the en language.
        It finds it right away, making option B correct.
     */
  static void loadBundle(){
      Locale.setDefault(new Locale("en", "US"));
      var rb = ResourceBundle.getBundle("internationalization.en_properties.purpleKey.Colors", new Locale("en"));
      System.out.print(rb.getString("purple"));

  }
}