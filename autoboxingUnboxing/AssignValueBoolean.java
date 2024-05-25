package autoboxingUnboxing;
import java.io.*;

/**
   Which of the following statements are acceptable?
   
   A.
     Object o = new java.io.File("a.txt");
       ---------------
        (Assume that java.io.File is a valid class with a constructor that takes a String.)
        This is valid because every object in Java is an Object.
   B.
      Boolean bool = false;
        bool is a variable of type Boolean and not of a primitive type boolean however
        this is still valid because Java performs auto-boxing (and unboxing) for primitives and their wrapper
        types which allows false to be automatically be boxed into a Boolean false object.
        
   C. char ch = 10;
        Because 10 can fit into a char.
      
   D.
       Thread t = new Runnable();
       ---------------
        (Assume that Runnable is a valid interface.)
        Since Runnable is an interface, it cannot be instantiated like this. But you can do :
        Runnable r = new Runnable(){
        public void run(){ }
        };
   E.
       Runnable r = new Thread();
        (Assume that Thread is a class that implements Runnable interface)
        Since Thread implements Runnable, this is a valid assignment.
        
       -------------
       Correct(a, B, C, E)
 */
public class AssignValueBoolean {
    public static void main(String[] path) {
        Object o = new java.io.File("a.txt");
        Boolean bool = false;
        char ch = 10;
        Runnable r = new Thread();
    }
}