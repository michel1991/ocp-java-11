package internationalization.en_properties;
import java.util.*;
public class LoadResources {
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
       Line 8 finds a matching key in this file. Line 9 does not find a match in that file; therefore, it has to look higher up in the hierarchy.
       For more information, see Chapter 5.
     */
    static void load(){
        Locale fr = new Locale("fr"); //   5:
        Locale.setDefault(new Locale("en", "US")); //   6:
        var b = ResourceBundle.getBundle("internationalization.en_properties.Dolphins", fr); //  7:
        b.getString("name"); //  8:
        b.getString("age"); //  9:

        System.out.println(" name : " +   b.getString("name") + " age : " +  b.getString("age"));
    }

    /**
     Given the following four properties files, what does this code print?
       Image is images/cars.jpg

        A. null null null
        B. engine 241 US
        C. moteur 45 US
        D. engine 241 earth
        E. moteur 241 earth
        F. An exception is thrown at runtime.


        The getBundle() does not find Cars_de_DE.properties or Cars_de.properties,
        so it moves on to the default locale. Since Cars_en.properties is available,
        it will use this file, falling back to Cars.properties
        if any values are not available.
        Therefore, it selects engine and horses from the first file,
        and country from the second file, printing engine 241 earth and making option D correct.

     */
    static void loadCars(){
        Locale.setDefault(new Locale("en"));
        var rb = ResourceBundle.getBundle("internationalization.en_properties.Cars",
                                          new Locale("de", "DE"));
        var r1 = rb.getString("engine");
        var r2 = rb.getString("horses");
        var r3 = rb.getString("country");
        System.out.print(r1+ " " + r2 + " " + r3);
    }

    public static void main(String... args){
        load();
    }
}