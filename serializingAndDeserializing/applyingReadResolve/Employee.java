package serializingAndDeserializing.applyingReadResolve;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

/**
   Maintenant, que faire si nous voulons écrire
   un enregistrement d'employé sur le disque[to write an Employee
   record to disk] mais que nous ne faisons pas totalement
   confiance à l'instance que nous détenons ?
   Par exemple, nous voulons toujours écrire la version de l'objet dans le pool plutôt que cette instance.
   Par construction, il ne devrait y avoir qu'une seule version de cet objet en mémoire, mais pour cet exemple,
   supposons que nous ne sommes pas sûrs à 100 % de cela.
   La méthode writeReplace() est exécutée avant(before) writeObject()
   et nous permet de remplacer l'objet sérialisé.

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

    public synchronized Object resolve() throws ObjectStreamException{
        var existingEmployee = pool.get(name);
        if(pool.get(name) == null) {
            // New employee not in memory
            pool.put(name, this);
            return this;
        } else {
            // Existing user already in memory
            existingEmployee.name = this.name;
            existingEmployee.ssn = this.ssn;
            return existingEmployee;
        }
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