package internationalization.en_properties;
import java.util.*;

/**
 * Given the following two properties files, what does the following class output?
    container.properties
    name=generic
    number=2

    container_en.properties
    name=Docker
    type=container

    A. Docker container
    B. generic container
    C. generic null
    D. The output cannot be determined without knowing the locale of the system where it will be run.
    E. An exception is thrown at runtime.
    F. None of the above.

    The method creates a resource bundle using a builder but never sets it.
     Since we don’t know the default locale of the code,
     the answer depends on where it is executed, making option D correct.
 */
public class LoadPod {
    void loadPod() {
        new Locale.Builder()
                .setLanguage("en")
                .setRegion("US").build();
        var rb = ResourceBundle.getBundle("internationalization.en_properties.container");
        String name = rb.getString("name");
        String type = rb.getString("type");
        System.out.print(name + " " + type);
    }
}