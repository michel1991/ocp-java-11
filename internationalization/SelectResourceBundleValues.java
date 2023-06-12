package internationalization;
import java.util.*;


public class SelectResourceBundleValues {
    
 

    /**
     * Assume that all of the files mentioned in the answer choices exist and define the same keys.
        Which one will be used to find the key in line 8?
        A. Dolphins.properties
        B. Dolphins_US.properties
        C. Dolphins_en.properties
        D. Whales.properties
        E. Whales_en_US.properties
        F. The code does not compile.

      Java will first look for the most specific matches it can find,
      starting with Dolphins_en_ US.properties.
      Since that is not an answer choice,
      it drops the country and looks for Dolphins_en.properties, making option C correct.
      Option B is incorrect because a country without a language is not a valid locale.

     */
    static void thirdExample(){
        Locale.setDefault(new Locale("en", "US")); // 6:
        var b = ResourceBundle.getBundle("Dolphins"); //   7:
        System.out.println(b.getString("name")); //  8:

    }

    /**
       Assume that all of the files mentioned in the answer choices exist and define the same keys.
       Which one will be used to find the key in line 8?

        A. Dolphins.properties
        B. Dolphins_US.properties
        C. Dolphins_fr.properties
        D. Whales.properties
        E. Whales_en_US.properties
        F. The code does not compile.

        Java will first look for the most specific match it can find,
        starting with Dolphins_en_US.properties.
        Since it is not found, it drops the country and looks for Dolphins_en.properties.
        Since no match is found, Java drops the language and goes on to Dolphin.properties.
        For these reasons, option A is the correct answer.
        Option B is incorrect because a locale requires a language code.
     */
    static void fiveExemple(){
        Locale.setDefault(new Locale("en", "US")); // 6:
        var b = ResourceBundle.getBundle("Dolphins"); // 7:
        System.out.println(b.getString("name")); //   8:
    }

  public static void main(String... args){
        System.out.println();
        //secondExample();
  }
}