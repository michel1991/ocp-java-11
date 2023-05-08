package exceptions.errors;
 import java.io.*; // 2:

/**
   How many lines of the following application do not compile?
    A. None. The code compiles and produces a stack trace at runtime.
    B. One.
    C. Two.
    D. Three.
    E. Four.
    F. Five.
    
    The second catch block in openDrawbridge() is unreachable since FileNotFoundException
    is a subclass of IOException. The catch blocks should
    be ordered with the narrower exception classes before
    the broader ones. For this reason, line 9 does not compile.
    Next, the local variable e is declared twice within the same scope,
    with the declaration on line 12 failing to compile.
    Finally, the openDrawbridge() method declares the checked Exception class,
    but it is not handled in the main() method on line 23.
    Since lines 9, 12, and 23 do not compile, option D is correct.
 */
 class Palace { // 3: 
     public void openDrawbridge() throws Exception { //    4: 
         try { //  5:
             throw new Exception("Problem"); //  6:    
         } catch (IOException e) { //    7:  
             throw new IOException(); //    8:    
         } catch (FileNotFoundException e) { //     9:   
             try { //  10:  
                 throw new IOException(); //   11: 
             } catch (Exception e) { //   12: 
             } finally { //  13:  
                 System.out.println("Almost done"); //   14: 
             } //   15:  
         } finally { //    16:   
             throw new RuntimeException("Unending problem"); //  17:  
         } //  18: 
     } //  19: 
    //20:
   public static void main(String[] moat) // 21: 
       throws IllegalArgumentException { // 22:   
         new Palace().openDrawbridge(); // 23: 
     } //  24: 
 } //   25: 

public class PalaceFindErrors {
    
}