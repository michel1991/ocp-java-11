package io;
import java.io.*;
import java.nio.file.*;

/**
* The code compiles and runs without issue, so options F and G are incorrect.
* The key here is that while Eagle is serializable, its parent class, Bird, is not. Therefore, none of the members of Bird will be serialized.
* Even if you didn’t know that, you should know what happens on deserialization.
* During deserialization, Java calls the constructor of the first nonserializable parent.
* In this case, the Bird constructor is called, with name being set to Matt, making option B correct.
* Note that none of the constructors or instance initializers in Eagle is executed as part of deserialization.
 */
import java.io.Serializable;

class Bird {
    protected transient String name;
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public Bird() {
        this.name = "Matt";
    }
}
class Eagle extends Bird implements Serializable {
    { this.name = "Olivia"; }
    public Eagle() {
        this.name = "Bridget";
    }
    public static void main(String[] args) {
        var e = new Eagle();
        e.name = "Adeline";
    }
}

public class DeserializationWithInheritanceCallFirstParent {
    static final String FILE_NAME = "eagle.txt";

    static Path getFullPathName(){
        String rootPath = System.getProperty("user.dir");
        Path path = Path.of(rootPath, "io", FILE_NAME);
        return path;
    }

    static void deletePreviousFile(Path path) throws IOException{
        Files.deleteIfExists(path);
    }

    static void serialize( Eagle eagle) throws IOException{
        Path path = getFullPathName();
        deletePreviousFile(path);
        try(var out = new ObjectOutputStream(
                    new BufferedOutputStream(
                        new FileOutputStream(path.toFile())
                    )
                );
        ){
          out.writeObject(eagle);
        }
    }

    static void deserialize() throws IOException, ClassNotFoundException{
        Path path = getFullPathName();
        try(var oi = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(path.toFile())
                )
        );
        ){
          Eagle  eagle = (Eagle) oi.readObject();
          if(eagle instanceof Eagle){
              System.out.println("deserialization name is " + eagle.name + " we expected  " + new Bird().name);
          }
        }
    }

    public static void main(String... args) throws IOException, ClassNotFoundException{
        var e = new Eagle();
        e.name = "Adeline";
        serialize(e);
        deserialize();
   }
}