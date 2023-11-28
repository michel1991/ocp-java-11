package nestedClass.manyRules;
/**
 * Which of these statements concerning nested classes and interfaces are true?
 *  A. An instance of a static nested class has an inherent outer instance.
        Since static nested class is a static class, it does not have an instance of the outer class associated with it.
    B. A static nested class can contain non-static member variables.
        It is like any other normal class.
    C. A static nested interface can contain static member variables.
        Static nested interface is similar to top level interface.
    D. A static nested interface has an inherent outer instance associated with it.
        A static nested interface is a static interface and so does not have an associated outer instance.
    C. For each instance of the outer class, there can exist many instances of a non-static inner class.
    
    
       (correct B, C, D)
       Note: follow order of comment to understand
    
 */

/**
      Note the difference between an inner class and a static nested class.
      Inner class means a NON STATIC class defined inside a class. Remember:

        1. A nested class is any class whose declaration occurs within the body of another class or interface.
        2. A top level class is a class that is not a nested class.
        3. An inner class is a nested class that is not explicitly or implicitly declared static.
        4. A class defined inside an interface is implicitly static.

        For example (below),
     */
 class A  // outer class (remove public modifier:  public class A )
    {

        //B is a static nested class. It can be used in other places like this: 
        //A.B b = new A.B(); //Observe that no outer instance is created.
static public class B 
       {
       }

    //C is an inner class. It can only be used like this: 
    //A.C c = new A().new C(); 
    //Observe that an Outer instance is needed to create C.
class C 
       {
       }
    }

 // One can define a class as a static member of any top-level class. Now consider the following contents of a file named I1.java:
  interface I1 // (remove modifier public  public interface I1)
    {
        public void mA();
        public interface InnerI1
        {
            int k = 10;
            public void innerA();
        }
    }

/*Here, interface InnerI1 is implicitly STATIC and so is called as static nested interface.
  'k' is a static (& final) member of this interface. If you do 'javap' on I1 it prints:
Compiled from I1.java

    public interface I1
    // ACC_SUPER bit NOT set 
    {
        public abstract void mA();
        public static interface I1. InnerI1
        // ACC_SUPER bit NOT set 
        {
            public static final int k;
            public abstract void innerA();
        }
    }
*/

// This interface can be referred to in other places like:

class MyClass implements I1.InnerI1
    {
        //...
        public void innerA(){
            
        }
    }
// This is similar to referring a top level class.
public class A_I1 {
    
}