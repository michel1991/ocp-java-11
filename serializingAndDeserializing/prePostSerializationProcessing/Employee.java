package serializingAndDeserializing.prePostSerializationProcessing;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

/**
  Supposons que notre application de gestion des employés du zoo rencontre un problème
   de duplication des enregistrements créés pour chaque employé.
   Ils décident de conserver en mémoire une liste de tous les employés
   et de ne créer des utilisateurs que si nécessaire.
   De plus, il est garanti que le nom de chaque employé est unique.
   Peu probable dans la pratique, nous le savons, mais c'est un zoo spécial !

 */
class Employee implements Serializable{
    private String name;
    private String ssn;
    private int age;

    private static Map<String,Employee> pool = new ConcurrentHashMap<>();

    private static final ObjectStreamField[] serialPersistentFields =     {
            new ObjectStreamField("name", String.class),
            new ObjectStreamField("ssn", String.class)
    };

    private Employee() {

    }



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

    public synchronized static Employee getEmployee(String name) {
        if(pool.get(name)==null) {
            var e = new Employee();
            e.name = name;
            pool.put(name, e);
        }
        return pool.get(name);
    }


}