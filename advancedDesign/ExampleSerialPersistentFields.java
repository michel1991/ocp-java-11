package advancedDesign;
import java.io.*;

/**
* When implementing serialization, there are two main ways for omitting an instance variable.
* Option E is tricky because transient is one of those ways.
* However, it is incorrect because it must be used on the instance variable to be omitted.
* Option D is correct because it is the other way.
* The serialPersistentFields array lists the fields available to writeObject() and readObject().
 */
class AnimalCheckup {
    private String name;
    private int age;

    private static final ObjectStreamField[]  serialPersistentFields =
    { new ObjectStreamField("name", String.class)};

    private void writeObject(ObjectOutputStream stream)
    throws Exception {

        ObjectOutputStream.PutField fields = stream.putFields();
        fields.put("name", name);
        stream.writeFields();
    }
    private void readObject(ObjectInputStream stream)
    throws Exception {

        ObjectInputStream.GetField fields = stream.readFields();
        name = (String) fields.get("name", null);
    }
}

public class ExampleSerialPersistentFields{
    public static void main(String... args){

    }
}