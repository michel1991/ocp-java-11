package security.guidelines.serialization;
import java.io.*;

/**
 * Given:
 
 Which options can be used to secure serialization of the objects of the above class?

    Note: This is a vague question because it is not clear exactly what is expected when it says "secure serialization of the objects".
     Does it mean the useridpwd must not be stored in the serialized data, does it mean UserCredential object must not be serialized,
     or does it mean the useridpwd field must not be tampered with or something else.
    
    We have seen similar question on the exam.
    You should go through Oracle's secure coding guideline article before answering
    this question: https://www.oracle.com/java/technologies/javase/seccodeguide.html

    A. Make useridpwd field transient.
        Since transient fields are not serialized, if you make sensitive fields transient, they will not be exposed int he generated serialized stream.
    B. Add serialPersistentFields array field in the class.
    C. Implement only writeReplace method to replace the instance with a serial proxy and not readResolve.
    D. Implement only readResolve method to replace the instance with a serial proxy and not writeReplace.
    E. Implement writeObject and use ObjectOutputStream.putField selectively
         In this approach, you avoid putting in the value of sensitive fields in the serialized stream.
    F. Do not implement the Externalizable interface
    Implementing the Externalizable interface is one of the ways to protect sensitive information.
    
    --------------- explanation---------------------
    
    Approaches for handling sensitive fields in serializable classes are:
    
    1. Declare sensitive fields transient
    2. Define the serialPersistentFields array field appropriately
    3. Implement writeObject and use ObjectOutputStream.putField selectively
    4. Implement writeReplace to replace the instance with a serial proxy
    5. Implement the Externalizable interface
    Correct(A, B, C, E)

 */
public class UserCredential implements Serializable{
    private String useridpwd;
    public UserCredential(String useridpwd){
        this.useridpwd = useridpwd;
    }
}