package internationalization;
import java.util.*;

/**
 * Given the two properties files from question 27, what does the following class output?
 *
    A. Docker container
    B. generic container
    C. generic null
    D. The output cannot be determined without knowing the locale of the system where it will be run.
    E. An exception is thrown at runtime.
    F. None of the above.

    This code sets the default locale to English and then tries to get a resource bundle for container.
    It finds the resource bundle container_en.properties as the most specific match.
    Both keys are found in this file, so option A is the answer.

 */
public class LoadContainer {
    void loadContainer() {
        Locale.setDefault(new Locale("en"));
        var rb = ResourceBundle.getBundle("container");
        String name = rb.getString("name");
        String type = rb.getString("type");
        System.out.print(name + " " + type);
    }
}