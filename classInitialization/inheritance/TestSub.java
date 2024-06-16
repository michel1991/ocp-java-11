package classInitialization.inheritance;
/**
     Consider the following code:
    
    class Super { static String ID = "QBANK"; }
    
    class Sub extends Super{
       static { System.out.print("In Sub"); }
    }
    public class Test{
       public static void main(String[] args){
          System.out.println(Sub.ID);
       }
    }
    What will be the output when class Test is run?
    
   A. It will print In Sub and QBANK.
   B. It will print QBANK.
   C. Depends on the implementation of JVM.
   D. It will not even compile.
   E. None of the above.
   
   --------------
   As per Section 12.4.1 given here: https://docs.oracle.com/javase/specs/jls/se11/html/jls-12.html#jls-12.4.1

   A class or interface type T will be initialized immediately before the first occurrence of any one of the following:
   
   T is a class and an instance of T is created.
   
   A static method declared by T is invoked.
   
   A static field declared by T is assigned.
   
   A static field declared by T is used and the field is not a constant variable (4.12.4).
   
   When a class is initialized, its superclasses are initialized (if they have not been previously initialized),
   as well as any superinterfaces (8.1.5) that declare any default methods (9.4.3) (if they have not been previously initialized).
   Initialization of an interface does not, of itself, cause initialization of any of its superinterfaces.
   
   A reference to a static field (8.3.1.1) causes initialization of only the class or interface that actually declares it,
   even though it might be referred to through the name of a subclass, a subinterface, or a class that implements an interface.
   
   Invocation of certain reflective methods in class Class and in package java.lang.reflect also causes class or interface initialization.
   
   A class or interface will not be initialized under any other circumstance.
   
   Correct(B)

 */
class Super { static String ID = "QBANK"; }

class Sub extends Super{
   static { System.out.print("In Sub"); }
}
class Test{ // public 
   public static void main(String[] args){
      System.out.println(Sub.ID);
   }
}

public class TestSub {
    public static void main(String[] args){
        Test.main(args);
     }
}