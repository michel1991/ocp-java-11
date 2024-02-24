package io.serialization.fields;
import java.io.*;
import static io.PathUtility.*;

/**
* Fill in the blank to make this code compile and serialize only one field.

    A. Serializable
    B. Serialized
    C. serialFields
    D. serialPersistentFields
    E. transient
    F. None of the above

   When implementing serialization, there are two main ways for omitting an instance variable.
   Option E is tricky because transient is one of those ways.
   However, it is incorrect because it must be used on
   the instance variable to be omitted.
   Option D is correct because it is the other way.
   * The serialPersistentFields array lists the fields available to writeObject() and readObject().
 */
public class AnimalCheckupSerialPersistenFields {
    private String name;
    private int age;

    // ________________ for line 8
    private static final ObjectStreamField[] serialPersistentFields =
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

    public static void main(String... args) throws Exception{
           final String fileName = "AnimalCheckupSerialPersistenFields.txt";
            String fullPath = getResourcePath()
              .append(getFileSeparator())
               .append(fileName).toString();

            var objectWriter = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(fullPath)
                    ));
            var theObject = new AnimalCheckupSerialPersistenFields();
            theObject.writeObject(objectWriter);

            var objectReader = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(fullPath)
                    ));
            theObject.readObject(objectReader);
    }
}