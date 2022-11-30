package io.errors;
import java.io.*;

/*
  * Line 10 includes an unhandled checked IOException, while line 11
  * includes an unhandled checked FileNotFoundException, making option D correct.
  * Line 12 does not compile because is.readObject() must be cast to a Bird object
  * to be assigned to b.It also does not compile because it includes two unhandled checked exceptions,
  * IOException and ClassNotFoundException, making option E correct.
  * If a cast operation were added on line 13 and the main() method were updated on line 8
  * to declare the various checked exceptions, then the code would compile but
  * throw an exception at runtime since Bird does not implement Serializable.
  * Finally, if the class did implement Serializable, then the program would print null at runtime,
  * as that is the default value for the transient field age. For more information, see Chapter 8.
*/
public class NoImplementSerializableAndNoHandleException {
    private String name;
     private transient Integer age;
     // Getters/setters omitted
     public String getName(){
        return name;
     }
    public String setName(String theName){
         return name = theName;
     }

     public static void main(String[] args) {
         String projectDir = System.getProperty("user.dir");

         try(var is = new ObjectInputStream(
                 new BufferedInputStream(
                         new FileInputStream("data-error-no-implement-serializable-and-no-handle-exception.txt")))
         ) {
             NoImplementSerializableAndNoHandleException b =  is.readObject();
            System.out.println(b.age);
         }
     }
}