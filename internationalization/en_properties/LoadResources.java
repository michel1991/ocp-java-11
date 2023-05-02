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

    /**
       Assuming the key indigo is in all five of the files referenced in the options,
       which file will the following code use for the resource bundle?

            A. Colors_default.properties
            B. Colors_en_US.properties
            C. Colors_CH.properties
            D. Colors_en.properties
            E. Colors_es.properties
            F. None of the above

            Java starts out by looking for a properties file with the requested locale,
            which in this case is the fr_CH language and country.
            It doesn’t find Colors_fr_CH.properties,
            so it moves onto the locale with just a language code fr.
            It also does not find Colors_fr.properties.
            It then moves on to the default locale it_CH checking Colors_it_CH.properties,
            but there is still no match. It drops the country code and checks it for Colors_it.properties,
            but still doesn’t find a match. Lastly, it checks for a Colors.properties
            file but since that’s not an option, it fails.
            *  The result is a MissingResourceException is thrown at runtime, making option F correct.
     */
    static void loadWithIndigoKey(){
        Locale loc = new Locale("fr", "CH");
        Locale.setDefault(new Locale("it", "CH"));
        ResourceBundle rb = ResourceBundle.getBundle("Colors", loc);
        rb.getString("Indigo");

    }


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
        ResourceBundle rb = ResourceBundle.getBundle("Colors", loc);
        rb.getString("turquoise");
    }

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
        var rb = ResourceBundle.getBundle("Colors", new Locale("fr"));
        System.out.print(rb.getString("green"));
    }

    public static void main(String... args){
        load();
    }
}