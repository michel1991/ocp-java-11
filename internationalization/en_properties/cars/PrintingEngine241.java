package internationalization.en_properties.cars;
import java.util.*;
public class PrintingEngine241 {
    
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
        var rb = ResourceBundle.getBundle("internationalization.en_properties.cars.Cars",
                                          new Locale("de", "DE"));
        var r1 = rb.getString("engine");
        var r2 = rb.getString("horses");
        var r3 = rb.getString("country");
        System.out.print(r1+ " " + r2 + " " + r3);
    }
    
    
    public static void main(String... args){
        loadCars();
    }
    
}