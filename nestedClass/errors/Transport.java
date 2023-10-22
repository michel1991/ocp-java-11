package nestedClass.errors;
import java.util.*;

/**
  How many lines of the main method fail to compile?
    A. None
    B. One
    C. Two
    D. Three
    E. Four
    F. Five
    
    You are allowed to use null with instanceof; it just prints false.
    The bus variable is both a Vehicle and a Bus, so lines 18 and 19 print true.
    Then it gets interesting. We know that bus is not an ArrayList or Collection.
    However, the compiler only knows that bus is not an ArrayList because
    ArrayList is a concrete class. Line 20 does not compile.
    The compiler can’t definitively state that bus is not a Collection.
    Some future program could create a subclass of Bus that does implement Collection,
    so this line compiles. Therefore, only line 20 fails to compile, and option B is correct.
 */
public class Transport { // 10:
  static interface Vehicle {} //   11: 
  static class Bus implements Vehicle {} //  12:  
  // 13:
    public static void main(String[] args) { // 14:
    Bus bus = new Bus(); //   15: 
   // 16:
    System.out.println(null instanceof Bus); //   17: 
    System.out.println(bus instanceof Vehicle); //    18:  
    System.out.println(bus instanceof Bus); //     19: 
    System.out.println(bus instanceof ArrayList); //  20:   
    System.out.println(bus instanceof Collection); //     21: 
  } } //   22:
