package internationalization;
import java.util.*;


public class LoadCorrectDolphins {

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

        Java will use Dolphins_fr.properties as the matching resource bundle on line 7 because it is an exact match on the language of the requested locale.
        Line 8 finds a matching key in this file. Line 9 does not find a match in that file; therefore, it has to look higher up in the hierarchy.
        Once a bundle is chosen, only resources in that hierarchy are allowed.
        It cannot use the default locale anymore, but it can use the default resource bundle specified by Dolphins.properties.
    */

    static void firstExample(){
        System.out.println("begin first example");
        var fr = new Locale("fr"); // 5
        Locale.setDefault(new Locale("en", "US")); // 6
        var b = ResourceBundle.getBundle("internationalization.Dolphins", fr);  // 7
        b.getString("name");  // 8
        b.getString("age");   // 9
        System.out.println(" name : " +   b.getString("name") + " age : " +  b.getString("age"));
        System.out.println("end first example");
    }

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

  public static void main(String... args){
        firstExample();
        System.out.println();
        secondExample();
  }
}