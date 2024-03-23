package interfaces.accessStaticMethod.errors;
/**
 * What will the following code print when compiled and run?
   A.
    Boiling...
    Vaporized!
    shutting down
   
   B. Compilation failure at //1.
    Since Java 9, an interface is allowed to have private (but not protected) static as well as instance methods.
    Fields of an interface are still always implicitly public, static, and final.
   
   C. Compilation failure at //2.

   
   D. Compilation failure at //4.

   E. If code at //4 is changed to Vaporizer.shutdown();, it will print
    Boiling...
    Vaporized!
    shutting down
    
   F. Definition of interface Vaporizer will cause compilation to fail.
    Definition of interface Vaporizer is fine.
    
  Remember that static method of an interface can only be accessed by using the name of that interface. i.e.
  Boiler.shutdown() in this case. This is unlike a static method of a class, which can be accessed using
  a subclass name or a variable name as well.

  Correct(D)

   
   * 
 */

interface Boiler{
    public void boil();
    private static void log(String msg){ //1
        System.out.println(msg);
    }
    public static void shutdown(){
        log("shutting down");
    }
}
interface Vaporizer extends Boiler{  
    public default void vaporize(){
        boil();
        System.out.println("Vaporized!");
    }
}

public class Reactor implements Vaporizer{
    public void boil() {
        System.out.println("Boiling...");
    }

    public static void main(String[] args) {
        Vaporizer v =  new Reactor(); //2
        v.vaporize(); //3
        v.shutdown(); //4
    }
}