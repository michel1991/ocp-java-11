package internationalization;
import java.util.*;


public class LoadCorrectDolphins {
    
    /**
    *  Suppose that we have the following three properties files and code. Which bundles are used on lines 8 and 9, respectively?
    *   Dolphins.properties
        name=The Dolphin
        age=0

        Dolphins_en.properties
        name=Dolly
        age=4

        Dolphins_fr.properties
        name=Dolly

        A. Dolphins.properties and Dolphins.properties
        B. Dolphins.properties and Dolphins_en.properties
        C. Dolphins_en.properties and Dolphins_en.properties
        D. Dolphins_fr.properties and Dolphins.properties
        E. Dolphins_fr.properties and Dolphins_en.properties
        F. The code does not compile.
        G. None of the above.

        Java will use Dolphins_fr.properties as the matching resource bundle on line 7 because it is an exact match on the language of the requested locale.
        Line 8 finds a matching key in this file. Line 9 does not find a match in that file; therefore, it has to look higher up in the hierarchy.
        Once a bundle is chosen, only resources in that hierarchy are allowed.
        It cannot use the default locale anymore, but it can use the default resource bundle specified by Dolphins.properties.
     */
    static void secondExample(){
        System.out.println("begin Second example");
        var fr = new Locale("fr"); //  5:
        Locale.setDefault(new Locale("en", "US")); //    6:
        var b = ResourceBundle.getBundle("internationalization.Dolphins", fr); //  7:
        b.getString("name"); //  8:
        b.getString("age"); //  9:
        System.out.println(" name : " +   b.getString("name") + " age : " +  b.getString("age"));
        System.out.println("end Second example");
    }

    /**
     * Assume that all of the files mentioned in the answer choices exist and define the same keys. Which one will be used to find the key in line 8?
        A. Dolphins.properties
        B. Dolphins_US.properties
        C. Dolphins_en.properties
        D. Whales.properties
        E. Whales_en_US.properties
        F. The code does not compile.

      Java will first look for the most specific matches it can find, starting with Dolphins_en_ US.properties.
      Since that is not an answer choice, it drops the country and looks for Dolphins_en.properties, making option C correct.
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

        Java will first look for the most specific match it can find, starting with Dolphins_en_US.properties.
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