package io.errors;
import java.io.*;

/**
* Line 10 includes an unhandled checked IOException, while line 11 includes an unhandled checked FileNotFoundException, making option D correct.
* Line 12 does not compile because is.readObject() must be cast to a Bird object to be assigned to b.
* It also does not compile because it includes two unhandled checked exceptions, IOException and ClassNotFoundException, making option E correct.
* If a cast operation were added on line 13 and the main() method were updated on line 8 to declare the various checked exceptions,
* then the code would compile but throw an exception at runtime since Bird does not implement Serializable.
* Finally, if the class did implement Serializable, then the program would print null at runtime, as that is the default value for the transient field age.
*  For more information, see Chapter 8.
 */
class Bird {
    private String name;
    private transient Integer age;

    public String getName(){
        return name;
    }

    public  void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public  void setAge(Integer age){
        this.age = age;
    }

    public static void readTheObject(){
        try(var is = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("birds.dat")))) {
            Bird b = (Bird)is.readObject();
            System.out.println(b.age);
        }
    }
}

public class FileInputStreamThrowsCheckException {

    public static void main(String[] args) {
        Bird.readTheObject();
    }
}