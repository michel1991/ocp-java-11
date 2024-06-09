package internationalization.resourceBundle.okLabelCancelLabel;
import java.util.*;

/**
   What will the following code fragment print when compiled and run?

    Locale myloc = new Locale.Builder().setLanguage("en").setRegion("UK").build(); //L1
    ResourceBundle msgs = ResourceBundle.getBundle("mymsgs", myloc);
    
    Enumeration<String> en = msgs.getKeys();
    while(en.hasMoreElements()){
        String key = en.nextElement();
        String val = msgs.getString(key);
        System.out.println(key+" : "+val);
    }
    
    Assume that only the following two properties files (contents of the file is shown below the name of the file) are accessible to the code.
    
    1. mymsgs.properties
    okLabel=OK
    cancelLabel=Cancel   
    
    2. mymsgs_en_UK.properties
    okLabel=YES
    noLabel=NO
    
    A. It will not compile due to line L1.
            There is no problem with the statement at L1. It illustrates the correct way to use a Builder object to create a Locale.
            
    B. It will not print anything.

    C.
        okLabel=OK
        cancelLabel=Cancel

    D.
        okLabel=YES
        noLabel=NO

    E.
        noLabel : NO
        okLabel : YES
        cancelLabel : Cancel
        
        ----
        mymsgs.properties is the base file for this resource bundle.
        Since the language and region specific file is also present (_en_UK),
        it will also be loaded and the values in this file will be superimposed on the values of the base file.

        Remember that if there were another properties file named mymsgs_en.properties also present,
        then the values of this file would be superimposed on the values mymsgs.properties and then values of mymsgs_en_UK.properties
        would be superimposed on the resulting union.
        
        Thus, effectively, the values for a key will be looked up in this
         order: mymsgs_en_UK.properties>mymsgs_en.properties > mymsgs.properties.
         If a key is not found in a higher priority bundle (also called as the child bundle), the lower priority or the child bundle will be checked.
        
    F.
        noLabel : NO
        okLabel : OK
        cancelLabel : Cancel
        
        You need to know how a ResourceBundle is prepared for a particular locale when multiple properties files are available.
        The following JavaDoc API decription contains all you need to know:
        https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ResourceBundle.html#getBundle(java.lang.String,java.util.Locale,java.lang.ClassLoader)

        You may try executing the given code and see how the values are loaded.
        Keep the properties files in the base folder of your classpath.
         For example, if your classpath contains c:\javatest\classes, then keep the properties files in c:\javatest\classes.
                
     -----
      Correct(E)


 */
public class LoadResource {
    public static void main(String... args){
        Locale myloc = new Locale.Builder().setLanguage("en").setRegion("UK").build(); //L1
        ResourceBundle msgs = ResourceBundle.getBundle("internationalization.resourceBundle.okLabelCancelLabel.mymsgs", myloc);
        
        Enumeration<String> en = msgs.getKeys();
        while(en.hasMoreElements()){
            String key = en.nextElement();
            String val = msgs.getString(key);
            System.out.println(key+" : "+val);
        }
    }
}