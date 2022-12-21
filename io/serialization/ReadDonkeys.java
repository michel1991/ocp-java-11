package io.serialization;
import java.io.*;
import java.util.*;

class Donkey implements Serializable{

}

public class ReadDonkeys {
    /**
     * What is true of the following code?
     *  A. It is properly written.
        B. It does not terminate due to an infinite loop.
        C. It has a resource leak.
        D. It does not compile.
        E. The readDonkey() method throws an exception at runtime.
        F. None of the above.

        The code does compile and run without exception, making options D and E incorrect.
        This code reads from a file but does not have a try statement. This is a resource leak, making option C the answer.
     */
    public static List<Donkey> readDonkeys(String dataFile)
   throws Exception {

        var donkeys = new ArrayList<Donkey>();
        var in = new ObjectInputStream(
                new FileInputStream(dataFile));

        try {
            while (true) {
                Donkey object = (Donkey) in.readObject();
                if (object instanceof Donkey)
                    donkeys.add(object);
            }
        } catch (EOFException e) { }
        return donkeys;
    }

    public static void main(String... args){

    }

}