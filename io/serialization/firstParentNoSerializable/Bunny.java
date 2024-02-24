package io.serialization.firstParentNoSerializable;
import java.io.*;
import static io.PathUtility.*;

/**
 Assume the implementations saveToFile() and readFromFile() exist and properly serialize/deserialize a Bunny object.
  What does the following program print?

    A. Patti
    B. Elysia
    C. Olivia
    D. Sophia
    E. null
    F. The code does not compile.
    G. The value may not be known until runtime.

  The code compiles and runs without issue, making options F and G incorrect.
  The name variable is transient, so it will not be saved to disk on serialization.
  On deserialization, the JVM will call the no-arg constructor of the first nonserializable
  parent class it can find in the class hierarchy.
  In this case, the nonserializable Mammal constructor
  will run and assign the value of name to Elysia, making option B correct.

 */
class Mammal {
    protected transient String name = "Patti";
    public Mammal() { this.name = "Elysia"; }
}

class Bunny extends Mammal implements Serializable {
    { this.name = "Olivia"; }
    public Bunny() { this.name = "Sophia"; }

    static void saveToFile(Bunny b, String fileName){
        String fullPath = getResourcePath()
              .append(getFileSeparator())
               .append(fileName).toString();
          try(
                  var objectWriter = new ObjectOutputStream(
                      new BufferedOutputStream(
                              new FileOutputStream(fullPath)
              ))
          ){
              objectWriter.writeObject(b);

          }catch(IOException ex){
              throw new RuntimeException(ex);
          }
    }
    static Bunny readFromFile( String fileName){
        String fullPath = getResourcePath()
              .append(getFileSeparator())
               .append(fileName).toString();
        try(
                var objectReader = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream(fullPath)
                        ))
          ){
            var result = objectReader.readObject();
            if(result instanceof Bunny)
               return (Bunny)objectReader.readObject();

        }catch(IOException|ClassNotFoundException ex){
            throw new RuntimeException(ex);
        }
      return null;
    }
    public static void main(String[] unused) {
        var b = new Bunny();
        saveToFile(b,"bunny.dat");
        b = readFromFile("bunny.dat");
        System.out.print(b.name);
    }
}
