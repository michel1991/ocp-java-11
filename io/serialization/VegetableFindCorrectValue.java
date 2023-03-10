package io.serialization;
import java.io.*;


/**
 *  What is the output of the following program? Assume the file paths referenced in the class exist and are able to be written to and read from.
    A. 1,Red
    B. 2,Green
    C. 2,null
    D. 3,Purple
    E. 4,null
    F. null,null
    G. None of the above

     The size variable is properly serialized with a value of 4.
     Upon deserialization, none of the class elements that assign a value to an instance variable are run,
     leading to size being deserialized as 4.
     Since the name variable is marked transient, this value is deserialized as null.
     For these reasons, option E is correct.

 */
class Vegetable implements Serializable {
    private Integer size = 1;
    private transient String name = "Red";
    { size = 3; name = "Purple"; }
    public Vegetable() { this.size = 2; name = "Green"; }
    public static void main(String[] love) throws Throwable {
        try (var o = new ObjectOutputStream(
                new FileOutputStream("healthy.txt"))) {
            final var v = new Vegetable();
            v.size = 4;
            o.writeObject(v);
        }

        try (var o = new ObjectInputStream(
                new FileInputStream("healthy.txt"))) {
            var v = (Vegetable) o.readObject();
            System.out.print(v.size + "," + v.name);
        } } }


public class VegetableFindCorrectValue {
    public static void main(String[] love) throws Throwable {
        Vegetable.main(love);
    }
}