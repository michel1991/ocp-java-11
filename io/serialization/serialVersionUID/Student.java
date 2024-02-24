package io.serialization.serialVersionUID;
import java.io.*;
import static io.PathUtility.*;

/**
 * Consider the following class:
 */
public class Student implements  Serializable{
    public static final long serialVersionUID = 1;
    public String name;
    public String grade;
    public String toString(){ return "["+name+", "+grade+"]"; }
}

/**
 * n object of this class was created as follows and was serialized to a file c:\temp\bob.ser:
 */
class ObjectWasCreatedAsFollows{
    static void main(String... args){
        Student s = new Student();
        s.name = "bob";
        s.grade = "10";
    }
}


/**
 * After some time the Student class was changed as follows:
 * The correct class is Student  we also public modifier
 */
 class StudentX implements Serializable{
    public static final long serialVersionUID = 1;
    public String id="S111";
    public String name;
    public String grade;
    public int age=15;
    public String toString(){ return "["+id+", "+name+", "+grade+", "+age+"]"; }
}

/**
 * Now, the serialized file is read back as follows:
 */
class NowTheSerializedFileIs{
    static void main(String... args) throws Exception{
     String fullPath = getResourcePath()
              .append(getFileSeparator())
               .append("c:\\temp\\bob.ser").toString()
     ;
     FileInputStream fis = new FileInputStream(fullPath); // "c:\\temp\\bob.ser"
        ObjectInputStream is = new ObjectInputStream(fis);
        var s = (Student) is.readObject(); //correct
        is.close();            
        System.out.println("Loaded "+s);
    }
}

/**
 * What will it print?
    A. It will throw an exception while deserializing the file.
    B. Loaded [null, bob, 10, 0]
        Since the serialVersionUID of the serialized class and the new class are same,
        the file will be deserialized without any issue. The new fields will be
        initialized to their Java defaults (because constructors and initializers
        are not invoked during deserialization). So the values for id and and age will remain null and 0 respectively.
    C. Loaded [S111, bob, 10, 15]
    D. It will have unpredicable values for id and age.
    
    (B is correct)
    
    1. When a file is deserialized into an object, the class's constructor and instance initializers are not called.
      So the fields for which no value is available in the serialized file, are initialized to their default values
      (i.e. number fields to 0, boolean to false, and references to null).
      Note that the fields of a non-serializable super class are initialized by the instance
      initializers and the no-args constructor of that super class.

    2. serialVersionUID denotes the version number of the class.
      If you don't specify serialVersionUID for a class that implements Serializable,
       Java compiler automatically adds this field. It computes a value based on the attributes of the class
       such as the fields and interfaces, and assigns that value to serialVersionUID.
       
      It is used during deserialization to verify that the sender and receiver of a serialized object
      have loaded classes for that object that are compatible with respect to serialization.
      If the receiver has loaded a class for the object that has a different serialVersionUID
      than that of the corresponding sender's class, then deserialization will result in an InvalidClassException.
    
    3. If the serialVersionUID for the serialized object and the actual class is same
      then the deserialization completes successfully but any additional fields that are not present
      in the serialized file are initialized to their default value (as per point 1. above).  Any fields that are missi

 */
