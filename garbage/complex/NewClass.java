package garbage.complex;

/**
   Which is the earliest line in the following code after which the object created
   on line // 1 can be garbage collected, assuming no compiler optimizations are done?
   
   A.. Line 1
   B. Line 2
   C. Line 3
   D. Line 4
   E. Line 5
      --
     Observe that at line //3, the variable obj is being passed to the doSomething method.
     In this method, this reference is assigned to the instance variable o.
     The variable o keeps pointing to the same object until line //6 is executed, which passes a new reference ( null ) to the doSomething method.
     In this method the instance variable o is set to null.
     Therefore, at this point there is no variable is left pointing to the original object created at //1.
     
  F. Line 6
     ---
    Before this line the object is being pointed to by at least one variable.
   
   ---------------------------
   The official exam objectives now explicitly mention Garbage collection.  All you need to know is:

   1. An object can be made eligible for garbage collection by making sure there are no references pointing to that object.
   2. You cannot directly invoke the garbage collector. You can suggest the JVM to perform garbage collection by calling System.gc();
   3. Note that objects pointed to by static variables of a class are not collected even when all objects
   of that class are collected because those variables belong to the class (and not to the instance of the class).
   They are GCed only when the class itself is unloaded by the class loader.
   
    Correct(F)
   

 */
public class NewClass{
    private Object o;
    void doSomething(Object s){  o = s;   }
 
    public static void main(String args[]){
       Object obj = new Object(); // 1
       NewClass tc = new NewClass(); //2
       tc.doSomething(obj); //3
       obj = new Object();    //4
       obj = null;    //5
       tc.doSomething(obj); //6
    }
 }