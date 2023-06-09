package internationalization.en_properties.dolphin;
import java.util.*;
public class LookHigherUpHierachy {
    /**
    * Suppose that we have the following property files and code. Which bundle is used on lines 8 and 9, respectively?
        Dolphins.properties
        name=The Dolphin
        age=0

        Dolphins_de.properties
        name=Dolly
        age=4

        Dolphins_en.properties
        name=Dolly

        A. Dolphins.properties and Dolphins.properties are used.
        B. Dolphins.properties and Dolphins_en.properties are used.
        C. Dolphins_en.properties and Dolphins.properties are used.
        D. Dolphins_en.properties and Dolphins_en.properties are used.
        E. Dolphins_de.properties and Dolphins_en.properties are used.
        F. The code does not compile.

       Java will use Dolphins_en.properties as the matching resource bundle on line 7.
       Since there is no match for French, the default locale is used.
       Line 8 finds a matching key in this file.
       Line 9 does not find a match in that file; therefore, it has to look higher up in the hierarchy.
       For more information, see Chapter 5.
     */
    static void load(){
        Locale fr = new Locale("fr"); //   5:
        Locale.setDefault(new Locale("en", "US")); //   6:
        var b = ResourceBundle.getBundle("internationalization.en_properties.dolphin.Dolphins", fr); //  7:
        b.getString("name"); //  8:
        b.getString("age"); //  9:

        System.out.println(" name : " +   b.getString("name") + " age : " +  b.getString("age"));
    }
    
    public static void main(String... args){
        load();
    }
}