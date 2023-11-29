### Which of the following options can be a part of a correct inner
### class declaration or a combined declaration and instance initialization ?

* A. private class C { }
* B. new SimpleInterface() {
        //valid code
    }
* C. new ComplexInterface(x) {
        //valid code
    }
    You cannot pass parameters when you implement an interface by an anonymous class.
* D. private final abstract class C { }
    A final class can never be abstract.
* E. new ComplexClass() implements SimpleInterface { }
    'implements' part comes only in class definition not in instantiation.
(Correct A, B)

### Which variables of the encapsulating class can an inner class access,
### if the inner class is defined in an instance method of the encapsulating class?

* A. All static variables
* B. All final instance variables
* C. All instance variables
* D. All automatic variables.
* E. All final and effectively final automatic variables

Consider the following code:

``` java
public class TestClass
{
    static int si = 10;   int ii = 20;
    public  void inner()
    {
        var ai = 30; //automatic variable
        ai = 31;//ai is not effectively final anymore.

        final var fai = 40; //automatic final variable. 
        //Yes, a final local variable may use var declaration!

        class Inner
        {
            public Inner()  {  System.out.println(si+"  "+ii+"   "+fai);  }
        }
        new Inner();
    }
    public static void main(String[] args){  new TestClass().inner();  }
}
``` 
As method inner is an instance method (i.e. non-static method), si, ii,
and fai are accessible in class Inner. Note that ai is not accessible because
it is not effectively final. If the line ai = 31; did not exist, ai would have been accessible.
If method inner() were a static method, ii would have been inaccessible.
Prior to java 8, only final local variables were accessible to the inner class but in Java 8,
even effectively final local variables of the method are accessible to the inner defined in that method as well.
Correct(A, B, C, E)

