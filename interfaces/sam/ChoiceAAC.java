package interfaces.sam;
/**
 * Which of the following interface definitions can be implemented using Lambda expressions?
   
    A. A
        It is not a valid funtional interface because it has no abstract method.
    B. AA
         Although there is no @FunctionalInterface annotation on this interface,
         it has exactly one abstract method and is, therefore, a valid functional interface.
    C. AAA
         It has two abstract methods.
    D. B
        It has no abstract method.
   E.  BB
        It has no abstract method.
   F. C
         It has one abstract method.
         
    Correct A, F)
    
    To take advantage of lambda expressions, an interface must be a "functional" interface,
    which basically means that the interface must have exactly one abstract method.
    A lambda expression essentially provides the implementation for that abstract method.

    Remember that methods of the java.lang.Object class do not count towards the number of abstract methods of an interface.
    So, for example, the following is still a valid functional interface:

     @FunctionalInterface
    public interface FI{
       int m1(); //valid abstract method
       boolean equals(Object o); //valid declaration
    //but it does not count towards the number of abstract methods
    
       String toString(); //valid declaration
    //but it does not count towards the number of abstract methods
    }



    It does not matter whether the abstract method is declared in this interface or a super interface.
    There is no constraint on the parameter types or on the return type. The interface may have other private,
    default, or static methods as well but those are not relevant. All that is required is that it must have exactly one abstract method.
    
    It is not necessary to apply the @FunctionalInterface annotation to a functional interface
    but it is recommended to do so because doing so enables IDEs and compilers to generate error message
    if the interface does not satisfy the requirements of functional interface.

 */

@FunctionalInterface
interface A{
    static void m1(){};
}

interface AA extends A{
    void m2();
    private void mp(){ }
}

interface AAA extends AA{
    void m3();
}

interface B {
    default void m1(){  }
}
interface BB extends B {
    static void m2(){ };
}
interface C extends BB{
    void m3();
}

public class ChoiceAAC{
    
}