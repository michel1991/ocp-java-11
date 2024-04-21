package security.mixedConcept;
import java.io.*;

/**
 * Consider the following method exposed by a class of a third party library:
 *
   This method is used by several classes in your application to store user information in files.
   Identify correct statements about this approach.
   
   A. It is prone to denial of service attack.
    Serializing untrusted objects is dangerous because when you serialize an object, all the associated objects i.e.
    the complete object graph is serialized. This can take a huge amount of space. Malicious code can take advantage
    of this and mess with the application
    
    B. This method violates secure coding guidelines for storing sensitive data.
        Generally, user information is considered sensitive data and should not be serialized.
        However, this class/method does not violate this guideline because it is just a utility method.
        Guideline 8-1 / SERIAL-1: Avoid serialization for security-sensitive classes,
        prohibits making classes that contain sensitive data from being Serializable.
        
    C. Serialization Filtering should be used to validate classes before they are serialized.
    Although this is a correct statement, it is not applicable here because the technique
     of seialization filtering is used while deserializaion. It the code given in this questions, only serialization is being done.
    
    Guideline 8-6 / SERIAL-6: Filter untrusted serial data
    Serialization Filtering is a new feature introduced in JDK 9 to improve both security and robustness
    when using Object Serialization. Security guidelines consistently require that input from external sources
    be validated before use; serialization filtering provides a mechanism to validate classes before they are deserialized.
    Filters can be configured that apply to every use of object deserialization without modifying the application.
    
    Correct(A, C)
 */
public class StoreObjectToFile {
    
    static void validateOutputFile(final String fn){
        
    }
    
    static void validatePermissions(){
        
    }
    public static void storeObjectToFile(final String fn, final Serializable obj)
                            throws Exception {
        validateOutputFile(fn);
        validatePermissions();
        try(var oos = new ObjectOutputStream(new FileOutputStream(fn)) ){
            oos.writeObject(obj);
        }
    }
    
}