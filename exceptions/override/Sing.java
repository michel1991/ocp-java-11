package exceptions.override;
import java.io.*;

/**
 *  Which classes when inserted into the blank do not allow this code to compile? (Choose two.)
    A. FileNotFoundException
    B. NumberFormatException
    C. Exception
    D. Error
    E. Throwable
    F. RuntimeException
    
   An overriding method cannot declare any new or broader checked exceptions as the overridden method.
   Option A is permitted because FileNotFoundException is a narrower exception than IOException.
   Options B, D, and F are permitted because new unchecked exceptions are allowed.
   Note that IOException is not required to be declared at all in the overriding method.
   Options C and E are incorrect because they are broader checked exceptions than IOException.
   Even if you didn’t know Throwable was checked,
  you should have been able to solve this by process of elimination.
 */
class Music {
    void make() throws IOException {
        throw new UnsupportedOperationException();
    }
}
public class Sing extends Music {
    public void make() throws  Error { // throws ______________
        System.out.println("do-re-mi-fa-so-la-ti-do");
    }
    
    public static void main(String... args){
        new Sing().make();
    }
}
