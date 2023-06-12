package internationalization.en_properties.dolphin.two;
import java.util.*;

public class ChoiceBundleUsing {
    /**
    *
       Suppose that we have the following property files and code. Which bundle is used on lines 8 and 9, respectively?
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

        Java will use Dolphins_fr.properties as the matching resource bundle
        on line 7 because it is an exact match on the language of the requested locale.
        Line 8 finds a matching key in this file.
        Line 9 does not find a match in that file;
        therefore, it has to look higher up in the hierarchy.
        Once a bundle is chosen, only resources in that hierarchy are allowed.
        It cannot use the default locale anymore,
        but it can use the default resource bundle specified by Dolphins.properties.
    */
    public static void main(String... args){
        System.out.println("begin first example");
        var fr = new Locale("fr"); // 5
        Locale.setDefault(new Locale("en", "US")); // 6
        var b = ResourceBundle.getBundle("internationalization.en_properties.dolphin.two.Dolphins", fr);  // 7
        b.getString("name");  // 8
        b.getString("age");   // 9
        System.out.println(" name : " +   b.getString("name") + " age : " +  b.getString("age"));
        System.out.println("end first example");
    }
}