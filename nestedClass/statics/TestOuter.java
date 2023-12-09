package nestedClass.statics;
// package mypack

/**
 *  Consider the following code:
 
    A. An instance of the nested class can be created from any class using: new TestOuter.TestInner().
    (Assuming appropriate imports).
    
        Because both TestOuter as well as TestInner are public.
   B. An instance of the nested class can be created only from classes of package mypack.
   C. An instance of the nested class can be created from a class of package mypack using: new TestInner().
    (Assuming appropriate imports).
        Any class can statically import TestClass.TestInner like this:
        import static mypack.TestOuter.TestInner;
        and then create an instance of TestInner like this:
        TestOuter.TestInner ti = new TestInner();
    D. It will not compile.
    E. TestInner.sayIt(); can be inserted in main.
        TestInner is static but its method sayIt is not. So, you need to do new TestInner().sayIt(); in main to invoke sayIt.
   Correct(A, C)

 */
public class TestOuter {
    public static class TestInner
       {
           public void sayIt(){ System.out.println("hello"); }
       }
    public static void main(String[] args){
        //call here
    }
}