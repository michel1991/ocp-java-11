package io.serialization.fields;
import java.io.*;

/**
 * Which can fill in the blank to make this code compile?
    A. GetObject
    B. ReadField
    C. FetchItem
    D. ReadItem
    E. GetField
    F. None of the above

   The GetFieldclass is used with the readObject() method, making option E correct.
   There is also a PutField class used with the writeObject()
   method that you should be familiar with for the exam.
 */
public class PonyGetField   implements Serializable {
    private static final ObjectStreamField[] serialPersistentFields = { new ObjectStreamField("name",String.class) };
    private String name;
    private Integer age;

    private void readObject(ObjectInputStream s) throws Exception {
        ObjectInputStream.GetField fields = s.readFields(); // __________
        this.name = (String) fields.get("name", null);
    }

}