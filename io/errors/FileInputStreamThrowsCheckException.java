package io.errors;
import java.io.*;

/**
*  Assume birds.dat exists, is accessible, and contains data for a Bird object. What is the result of executing the following code? (Choose all that apply.)
    A. It compiles and prints 0 at runtime.
    B. It compiles and prints null at runtime.
    C. It compiles and prints a number at runtime.
    D. The code will not compile because of lines 9–11.
    E. The code will not compile because of line 12.
    F. It compiles but throws an exception at runtime.

    Line 10 includes an unhandled checked IOException,
    while line 11 includes an unhandled checked FileNotFoundException,
    making option D correct.
    Line 12 does not compile because is.readObject() must be cast to a Bird object to be assigned to b.
    It also does not compile because it includes two unhandled checked exceptions,
    IOException and ClassNotFoundException, making option E correct.
    If a cast operation were added on line 13 and the main()
    method were updated on line 8 to declare the various checked exceptions,
    then the code would compile but throw an exception
    at runtime since Bird does not implement Serializable.
    Finally, if the class did implement Serializable,
    then the program would print null at runtime,
    as that is the default value for the transient field age.
    For more information, see Chapter 8.
 */
class Bird { // 2:
    private String name; // 3:
    private transient Integer age; // 4:
    //5:

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

    public static void readTheObject(){ // 8:
        try(var is = new ObjectInputStream( // 9:
                new BufferedInputStream( // 10:
                        new FileInputStream("birds.dat")))) { // 11:
            Bird b = is.readObject();    //12
            System.out.println(b.age); // 13
        }
    }
}

public class FileInputStreamThrowsCheckException {

    public static void main(String[] args) {
        Bird.readTheObject();
    }
}