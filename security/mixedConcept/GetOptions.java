package security.mixedConcept;

/**
 *  Consider the following method exposed by a utility class:
   It has been decided to give appropriate permission in the security file for this code. Identify correct statements.
   
   A. It violates secure coding guidelines for invoking privileged actions.
    As per Guideline 9-3 / ACCESS-3: "Safely invoke java.security.AccessController.doPrivileged",
    the given code should retrieve a system property using a hardcoded value instead of passing user input directly to the OS.
    In the given code, the user can potentially wreck the application by requesting illformated or mischievious property name.
    Since the code is privileged, the call may cause unwanted impact directly on the OS.
    
    B. It violates secure coding guidelines for exposing static methods.
    
    C. It violates secure coding guidelines for validating inputs.
        Ideally, it should validate whether the property name for which the value is requested is valid or not.
    
    It violates secure coding guidelines for protecting confidential information.
    
    Correct(A, C)


 */
public class GetOptions {
    public static String getOptions(final String propName) {
        return AccessController.doPrivileged(
                new PrivilegedAction<String>() {
                    public String run() {
                        return System.getProperty(propName);
                    }
                }
        );
    }
}