package io.serialization.properMethods;
import java.io.*;

/**
 *  Fill in the blanks with the proper method names to serialize an object. (Choose two.)
    A. readResolve in the first blank
    B. writeReplacein the first blank
    C. writeObjectin the first blank
    D. writeObjectin the second blank
    E. readObjectin the second blank
    F. writeReplacein the second blank

   The read methods are used as part of deserialization, not serialization, making options A and E incorrect.
   Option B and D are correct because they use the correct method parameters
   and return types for writeReplace() and writeObject().
 */
class DeliSandwich implements Serializable {
    public Object  writeReplace() throws ObjectStreamException { // ____________()
        // IMPLEMENTATION OMITTED
        return null;
    }

    private void  writeObject(ObjectOutputStream out) // ___________
throws IOException {
        // IMPLEMENTATION OMITTED
    }
}


public interface DeliSandwichChoiceMethod {

}