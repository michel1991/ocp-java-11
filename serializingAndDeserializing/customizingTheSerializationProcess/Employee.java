package serializingAndDeserializing.customizingTheSerializationProcess;
import java.io.*;

class Employee implements Serializable{
    private String name;
    private String ssn;
    private int age;

    private static final ObjectStreamField[] serialPersistentFields =     {
            new ObjectStreamField("name", String.class),
            new ObjectStreamField("ssn", String.class)
    };

    public String getName(){
       return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSsn(){
        return ssn;
    }

    public void setSsn(String ssn){
        this.ssn = ssn;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    private static String encrypt(String input) {
        // Implementation omitted
        return input;
    }

    private static String decrypt(String input) {
        // Implementation omitted
        return input;
      }

    private void writeObject(ObjectOutputStream s) throws Exception {
        ObjectOutputStream.PutField fields = s.putFields();
        fields.put("name", name);
        fields.put("ssn", encrypt(ssn));
        s.writeFields();
    }

    private void readObject(ObjectInputStream s) throws Exception {
        ObjectInputStream.GetField fields = s.readFields();
        this.name = (String)fields.get("name", null);
        this.ssn = decrypt((String)fields.get("ssn", null));
    }


}