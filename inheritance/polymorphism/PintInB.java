package inheritance.tricky.polymorphism;
/**
   Given:
   
   What will be printed when the above code is compiled and run?
   
   A.
        in i
        in a
        in b
        
   B.
        I
        A
        in b
        
   C.
        in a
        in a
        in b

   D.
        in a
        in b
        in b
        
   E.
        in b
        in b
        in b
    
    There is only one object created in this code and the class of that object is B.
    Therefore, B's toString will be called no matter what reference you use. Therefore, it is print "in b" for all the cases.
    
   --------------------------------
   If you answered this question incorrectly, you need to understand the concept of polymorphism.
   We suggest you to go through any book to understand it thoroughly because there are several questions in the exam on similar pattern.

    In a nutshell, polymorphism means that it is always the class of the object (and not the class
    of the reference variable that a variable points to) that determines which method will be called at run time.
    The concept of polymorphism doesn't apply to private methods or static methods because these methods are never inherited.
    
    Correct(E)

 */
interface I { }

class A implements I{
    public String toString(){ return "in a"; }
}

class B extends A{
    public String toString(){ return "in b"; }
}


 class TestClass { // public

    public static void main(String[] args) {
        B b = new B();
        A a = b;
        I i = a;
        
        System.out.println(i);
        System.out.println((B)a);
        System.out.println(b);
        
    }
}

public class PintInB {
    public static void main(String[] args) {
        TestClass.main(args);
    }
}