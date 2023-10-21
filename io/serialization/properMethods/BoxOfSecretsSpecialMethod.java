package io.serialization.properMethods;
import java.io.*;

/**
 * Fill in the blanks with the proper method names to deserialize an object. (Choose two.)
    A. writeObject in the first blank
    B. writeResolve in the first blank
    C. readObject in the first blank
    D. writeReplace in the second blank
    E. readResolve in the second blank
    F. readReplace in the second blank
    
    The write methods are used as part of serialization,
    not deserialization, making options A, B, and D incorrect.
    Option C and E are correct because
    they use the correct method parameters
    and return types for readObject() and readResolve().
    The method names used in options B and F,
    writeResolve() and readReplace() respectively,
    are not actually serialization or deserialization methods.
 */
class BoxOfSecrets {
    private void readObject(ObjectInputStream in) // ____________
         throws IOException {
        // IMPLEMENTATION OMITTED
    }

    public Object readResolve() throws ObjectStreamException  { // ____________
        // IMPLEMENTATION OMITTED
        return null;
    }
}

public class BoxOfSecretsSpecialMethod {
    
}