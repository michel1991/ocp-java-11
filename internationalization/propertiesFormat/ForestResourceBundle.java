package internationalization.propertiesFormat;
import java.util.*;
import java.text.*;

public class ForestResourceBundle {
    
    /**
     * Assuming the Forest.properties file is the only resource file available, what is the output of calling the hike() method?
        Forest.properties
        trees=evergreen {0}
        animals=squirrels
        
        A. trees
        B. trees pretty
        C. trees {0}
        D. trees null
        E. The code does not compile.
        F. An exception is thrown at runtime.
        
        The code compiles, so option E is incorrect.
        Java starts out by looking for a properties file with the requested locale,
        which in this case is the fr language. It doesn’t find Forest_fr.properties,
        so it moves onto the default localeen. It also doesn’t find Forest_en.properties.
        It settles on Forest.properties without throwing an exception, so option F is incorrect.
        The first argument to MessageFormat.format() should be a pattern String value.
         Since trees is sent, the output of the formatting string is trees,
         making option A correct. If rb.getString("trees")
         was passed instead of just trees, then the output would be evergreenpretty.

     */
    static void hike() {
        Locale.setDefault(new Locale.Builder()
            .setLanguage("en").build());
        var rb = ResourceBundle
                .getBundle("internationalization.propertiesFormat.Forest", new Locale("fr"));
        System.out.print(MessageFormat.format("trees","pretty"));
    }
    public static void main(String... args){
        hike();
    }
}