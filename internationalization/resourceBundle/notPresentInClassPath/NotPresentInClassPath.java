package internationalization.resourceBundle.notPresentInClassPath;
import java.util.*;

/**
 Consider the following code:

        Locale.setDefault(new Locale("es", "ES"));
        ResourceBundle rb = ResourceBundle.getBundle("appmessages");
        String msg = rb.getString("greetings");
        System.out.println(msg);
    
    You have created a valid resource bundle file named appmessages_es_ES.properties that contains 'greetings' property.
    However, when you run the above code, you get an exception saying,
    "java.util.MissingResourceException:
        Can't find bundle for base name appmessages, locale es_ES".
    
    What could be the reason?
    
    A. appmessages_es_ES.properties is not present in PATH.

      
    B. appmessages_es_ES.properties is not present in CLASSPATH.

    C. appmessages_es_ES.properties is not specified using -D option on command line.
    
    D. appmessages_es_ES.properties is not present in JAVA_HOME.

     --------------------
     In order for a program to load a resource bundle, the resource bundle properties file must be in the CLASSPATH.

        The JVM attempts to find a "resource" with this name using ClassLoader.getResource.
        (Note that a "resource" in the sense of getResource has nothing to do with
        the contents of a resource bundle, it is just a container of data, such as a file.)
        If it finds a "resource", it attempts to create a new PropertyResourceBundle instance from its contents.
        If successful, this instance becomes the result resource bundle.
      Correct(B)
 */
public class NotPresentInClassPath {
    public static void main(String... args){
        Locale.setDefault(new Locale("es", "ES"));
        ResourceBundle rb = ResourceBundle.getBundle("internationalization.resourceBundle.notPresentInClassPath.appmessages");
        String msg = rb.getString("greetings");
        System.out.println(msg);
    }
}