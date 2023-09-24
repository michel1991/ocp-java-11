package exceptions.errors.manyRule;
/**
 * Given the following class, how many lines contain compilation errors?
    A. One
    B. Two
    C. Three
    D. Four
    E. None. The code compiles as is.
    
    The code does not compile, so option E is incorrect.
    A variable declared before the start of a try-with-resources statement
    may be used if it is final or effectively final.
    Since s is modified on line 13, it is not either,
    therefore line 10 does not compile. Line 12 also does not compile.
    In a multi-catch expression, the two classes cannot be subtypes of each other.
    Other than lines 10 and 12, the rest of the code compiles, making option B correct.
 */
 import java.io.*; // 1: 
 class StungException extends Exception {} // 2: 
 class Suit implements Closeable { // 3: 
     public void close() throws IOException {} //   4: 
 } //    5: 
class BeeCatcher { // 6: 
     public static void main(String[] b) throws IOException { //   7:  
         var s = new Suit(); //  8:  
         var t = new Suit(); //    9:    
         try (s; t) { //    10: 
             throw new StungException(); //     11:  
         } catch (StungException | Exception e) { //     12:  
             s = null; //  13:  
         } finally { //     14:  
         } //  15:  
     } //  16:
 } //  17:

public class BeeCatcherFindErrors {
    
}