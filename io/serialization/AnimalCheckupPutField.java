package io.serialization;
import java.io.*;

/**
*  Which can fill in the blank to make this code compile?
*   A. PutField
    B. PutItem
    C. PutObject
    D. UpdateField
    E. UpdateItem
    F. UpdateObject

    The PutField class is used with the writeObject() method, making option A correct. There is also a GetField class used with the readObject() method.
 */
class AnimalCheckup {
    private String name;
    private int age;

    private static final ObjectStreamField[]
    serialPersistentFields =
    { new ObjectStreamField("name", String.class)};

    private void writeObject(ObjectOutputStream stream)
    throws Exception {

        ObjectOutputStream.PutField fields = stream.putFields(); // ______
        fields.put("name", name);
        stream.writeFields();
    }
    // readObject method omitted
}

public class AnimalCheckupPutField {
    public static void main(String... args){

    }
}