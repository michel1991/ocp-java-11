package io.serialization;
import java.io.*;
import static io.PathUtility.*;
import io.PathUtility;
import java.nio.file.*;

/**
 What will the following program print when compiled and run?

     A. It will not compile.
     B. It will throw an exception at run time.

     C.
       10 21
      10 21

     D.
        10 21
        10 20

    E.
        10 21
        0 20

   F.
        10 21
        0 21
      Remember that transient fields and static fields are never serialized. Constructor, instance blocks,
       and field initialization of the class being deserialized are also not invoked. So, when boo is deserialized, the value of ti is set to 0.

        The class Boo is loaded as soon as the code refers to the class (here, it happens at Boo boo = new Boo(); ),
        and so the static int si is initialized to the value given in the class code i.e.
        20 and then it is incremented to 21 because of boo.si++;. This part has nothing to do with serialization.
        So when you deserialize an instance of Boo, Boo.si is not affected and is not reset to 20.

        Therefore, if you run the program again with just the deserialization part, you will see that si is 20 and not 21.

   -----------------
        Correct(F)
 */
class Boo implements Serializable {
    transient int ti = 10;
    static int si = 20;
}

class TestClass // public 
{
    public static void main(String[] args) throws Exception
    {
     
        Boo boo = new Boo();
        boo.si++;
        System.out.println(boo.ti+" "+boo.si);
        var builder = PathUtility.getResourcePathIO();
        var file = Path.of(
                builder.toString(),
                "serialization",
                "testClassBoo",
                "c",
                "temp",
                "boo.ser"
        ).toString();
        
        //var fos = new FileOutputStream("c:\\temp\\boo.ser");
        var fos = new FileOutputStream(file);
        var os = new ObjectOutputStream(fos);
        os.writeObject(boo);
        os.close();
        
       // var fis = new FileInputStream("c:\\temp\\boo.ser");
        var fis = new FileInputStream(file);
        var is = new ObjectInputStream(fis);
        boo = (Boo) is.readObject();
        is.close();            
        System.out.println(boo.ti+" "+boo.si);
    }
}

public class TestClassBoo {
    public static void main(String[] args) throws Exception
    {
        TestClass.main(args);
    }
}