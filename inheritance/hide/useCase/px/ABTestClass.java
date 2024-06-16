
package inheritance.hide.useCase.px;
import inheritance.hide.useCase.p1.*;
import inheritance.hide.useCase.p2.*;

/**
 Given:
In file A.java:

    package p1;
    import java.util.*;
    public class A {  
      public String name = "A";
      protected A(){ }
    }
    
    In file B.java:
    
    package p2;
    import p1.*;
    public class B extends A{
      public String name = "B";
      public B(){ super(); }
    }
    
    In file TestClass.java:
    
    import p1.*;
    import p2.*;
    
    public class TestClass
    {
      public static void main(String[] args) {
         A a = new B();
         System.out.println(a.name);
      }
    }
    
    
    What will be the result of compiling and executing Testclass?
    
    A. Compilation failure for class B
    B.  A
        1. A subclass is free to hide a member field of its super class.
        So, it is ok for class B to define a field named name with any accessibitly.
        Note that only methods can be overridden. Fields can only be "hidden".
        
        2. Class A is public and so, TestClass can access it.
        The fact that A's constructor is protected is not important here because we are not instantiating A in TestClass.
        We are instantiating B, and it is valid because B's constructor is public. Since, B is-a A, A a = new B(); is valid.
        The name field in A is public and so, it can be accessed in TestClass. Therefore, a.name is valid in TestClass.
        
        3. Access to a field depends on the declared type of the variable.
        Since the type of the variable a is A, a.name refers to the name field of class A. Therefore, "A" will be printed.
       
   C. B
   D.  Compilation failure for class TestClass
   
   Correct(B)

     
 */
public class ABTestClass {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.name);
     }
}