package inheritance.override.howToFix;
import java.io.*;

/**
  How can you fix the following code to make it compile:
  Assume that changes suggested in a option are to be applied independently of changes suggested in other options.
 
   A. Change doStuff in Amazing to throw only IllegalArgumentException.
    IllegalArgumentException extends from RuntimeException. So you don't have to worry about it at least at compile time.
    You may or may not declare it in the throws clause. The caller doesn't have to catch it anyway.
    The overriding method in the subclass is free to not throw any checked exception at all even
     if the overridden method throws a checked exception. No exception is a valid subset of exceptions thrown by the overridden method.
     
   B. Change doStuff in Great to throw FileNotFoundException and IllegalArgumentException.
   C. Change doStuff in Amazing to throw only IOException.
   D. Change doStuff in Great to throw only IOException instead of FileNotFoundException.
   E. eplace g.doStuff() to ((Amazing) g).doStuff().

    The rule is that an overriding method cannot throw an exception that is a super class of the exception thrown by the overridden method.
    
    Now, FileNotFoundException is a subclass of IOException. Therefore,
    Amazing's doStuff() cannot throw IOException if the base class's doStuff throws only FileNotFoundException.
    
    Think of it this way:
    
    FileNotFoundException fne = new IOException();
    // Will this work? No, because an IOException is NOT a FileNotFoundException.
    
    IOException ioe = new FileNotFoundException();
    // Will this work? Yes, because a FileNotFoundException is an IOException.
    
    Therefore, overriding method must not throw an exception that cannot be assigned
    to a variable whose class is the class of the overridden method's exception.

 */
class Great {
        public void doStuff() throws FileNotFoundException{
        }    
}

class Amazing extends Great {
    public void doStuff() throws IOException, IllegalArgumentException{
    }    
}


public class AmazingTestClass {
    public static void main(String[] args) throws IOException{
        Great g = new Amazing();
        g.doStuff();
    }
}