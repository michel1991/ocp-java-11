package lambda.errors;

/**
 * Which lambda can implement this functional interface?
   A. () -> System.out.println()
   B. n -> System.out.println(n)
   C. () -> true
   D. n -> true
   E. None of the above
   
   Serval is not a valid interface let alone a functional interface.
   The cat() method specifies an implementation,
   but does not have one of the modifiers
   that allows a body: default, private, or static. For this reason,
   option E is correct.
   If cat() was made an abstract method,
   then Serval would be a valid functional interface with n -> true being a valid lambda that matches it.

 */
public interface Serval {
    static void printName(String name) {}
    boolean cat(String name) { return true; }
}


public class ServalConcreateMethodOnInterface {
  
}