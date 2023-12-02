package nestedClass.accessMembers;
/**
   Which variables declared in the encapsulating class or in the method,
   can an inner class access if the inner class is defined in a static method of encapsulating class?

    A. All static variables
    B. All final instance variables
    C. All instance variables
    D. All automatic variables.
    E. All final or effectively final static or automatic variables
        An effectively final variable means even though it is not declared final,
        it is never assigned a value again throughout
        the code after being assigned a value at the time of declaration.
    Correct (A, E)
 */

// Consider the following code:

class TestClass
    {
        static int si = 10;   int ii = 20;
        public static void inner()
   {
       int ai = 30; //automatic variable
       ai = 31; //ai is not effectively final anymore.
       final int fai = 40; //automatic final variable
       class Inner
          {
              public Inner()  {   System.out.println(si+"    "+fai);      }
          }
       new Inner();
   }
    public static void main(String[] args)   {     TestClass.inner();       }
    }
/*
    Since method inner() is a static method, only si and fai are accessible in class Inner.
    Note that ai and ii are not accessible. If method inner() were a non - static method, ii would have been accessible.
    If the line ai = 31; did not exist, ai would have been accessible.
*/
public class InnerClassInStaticMethod {
    
}