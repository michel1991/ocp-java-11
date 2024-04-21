
package interfaces.sameMethods;

/**
 * What will be the output of compiling and running the following program:
    A. It will print Hello.
    B. There is no way to access any VALUE in TestClass.
    
    C. The code will work fine only if VALUE is removed from one of the interfaces.
        It works even now.
    
    D.  It will not compile.
    E. None of the above.
    
    Correct(A)
    
    Inheriting ambiguous fields due to implementing multiple interfaces does not cause any problem
    (except in the case of default methods) but referring to such fields in an ambiguous way will cause a compile time error.
    So you cannot call : System.out.println(VALUE) as it will be ambiguous.
        as there is no ambiguity in referring the field:
    TestClass tc = new TestClass();
    System.out.println(( ( I1) tc).VALUE);
    So, any of the VALUE fields can be accessed by casting.

 */
class TestClass implements I1, I2{
    public void m1() { System.out.println("Hello"); }
    public static void main(String[] args){
        TestClass tc = new TestClass();
        ( (I1) tc).m1();
    }
}
interface I1{
    int VALUE = 1;
    void m1();
}
interface I2{
    int VALUE = 2;
    void m1();
}

public class PrintHello {
    public static void main(String[] args){
        TestClass.main(args);
    }
}