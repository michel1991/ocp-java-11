package io.serialization.runtime;
import java.io.*;

/**
  Let’s say we want to write an instance of Cereal to disk,
   having a name value of CornLoops and sugar value of 5.
   What is the value of name and sugar after this object
   has been read from disk using the ObjectInputStream’s readObject() method?

   The Bowl class does not implement the Serializable interface; therefore,
   attempting to write the instance to disk, or calling readObject() using ObjectInputStream,
   will result in a NotSerializableException at runtime.
   Remember, all instance members of a class must be serializable or marked transient
   for the class to properly implement the Serializable interface and be used with Java serialization.
    For this reason, option F is the correct answer.
    If the Bowl class did implement Serializable,
    then the value of name and sugar would be CornLoops and 0, respectively,
    since none of the constructors, initializers,
    or setters methods are used on deserialization, making option B the correct answer.
 */
class Bowl {
    boolean spoon = true;
    // Getters/Setters Omitted

    public boolean getSoon(){
        return spoon;
    }
}
public class Cereal implements Serializable {
    private String name = "CocoaCookies";
    private transient int sugar = 10;
    private Bowl bowl;
    public Cereal() {
        super();
        this.name = "CaptainPebbles";
        this.bowl = new Bowl();
        sugar = 2;
    }
    { name = "SugarPops"; }
    // Getters/Setters Omitted
}