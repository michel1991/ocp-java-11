package internationalization.en_properties;
import java.util.*;

public class BrushLoadResource {
    
    /**
     * Given the following three property files, what does the following method output?
        A. morado null
        B. violette generic
        C. morado lujoso
        D. violette null
        E. The code does not compile.
        F. An exception is thrown at runtime.
        
        Java starts out by looking for a properties file with the requested locale.
        In this case, the requested locale is the fr language, which it finds with toothbrush_fr.properties.
        For this reason, the default locale of es_MX is ignored,
        and the first value for color printed is violette.
        Next, it looks for a value for type property.
        Since it doesn’t find it in the first properties file,
        it checks the default toothbrush.properties,
        where it does find it, and prints generic. For these reasons, option B is correct.
     */
    void brush() {
        Locale.setDefault(new Locale.Builder()
      .setLanguage("es")
      .setRegion("MX").build());
        var rb = ResourceBundle.getBundle("internationalization.en_properties.files.toothbrush",
                                          new Locale("fr"));
        var a = rb.getString("color");
        var b = rb.getString("type");
        System.out.print(a + " " + b);
    }
    
    public static void main(String... args){
        new BrushLoadResource().brush();
    }
}