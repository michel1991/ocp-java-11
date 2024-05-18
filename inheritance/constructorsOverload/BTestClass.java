package inheritance.constructorsOverload;

/**
 * What will the following program print when run?
    A. It will print "good bye".
    B. It will print "hello world".
    C. It will print "good bye world".
    D. It will print "good bye" followed by "hello world".
    E. It will print "hello world" followed by "good bye".
    --------------------------------------------------------
   
    new B("good bye"); will call class B's one args constructor which in turn calls super(s, " world");
    (i.e. class A's two args constructor) which in turn calls this(s1 + s2);
    (i.e. class A's one arg constructor with parameter "good bye world") which prints it.
    
     Correct(C)

 */

// Filename: TestClass.java
 class TestClass{ // public
    public static void main(String args[] ){ A b = new B("good bye");  }
}
class A{
    A() { this("hello", " world");  }
    A(String s) { System.out.println(s); }
    A(String s1, String s2){ this(s1 + s2); }
}
class B extends A{
    B(){ super("good bye"); };
    B(String s){ super(s, " world"); }
    B(String s1, String s2){ this(s1 + s2 + " ! "); }
}

public class BTestClass{
    public static void main(String args[] ){
        TestClass.main(args);
    }
}