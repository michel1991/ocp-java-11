package concurrency.runnableCallable;
import java.util.concurrent.*;
import java.util.concurrent.*;

/**
  Given:

  What can be inserted in the above code?
    A. Runnable r = ()->System.out.println("Hello");
    B. Runnable r = { System.out.println("Hello");}
    C. Runnable r = () -> System.out::println();
    D. Runnable r = (a)->System.out.println(a);
    E. Runnable r = -> System.out.println();
    F. Runnable r = ()-> { someMethod(); };
    G. Runnable r = ()-> someMethod();
    
    ------------------------
    Runnable is a valid functional interface because it has exactly one abstract method - public void run().
    Since this method does not take any parameter, the parameter list part of the lambda expression must be ().
     Further, since it does not return anything, the body part cannot contain an explicit return <value>;
      statement but it can invoke a method that returns a value as shown in the last two options. This value will be ignored.
      
    Correct(A, F, G)

 */
class TestClass{ // public

    static int someMethod(){ return 100; }

    static class MyWorker{
        Runnable r;
        public MyWorker(Runnable r){
            this.r = r;
        }
    }
    public static void main(String[] args) {
        //INSERT CODE HERE
        Runnable r = ()->System.out.println("Hello");
        MyWorker w = new MyWorker(r);
        Runnable rResponseF = ()-> { someMethod(); };
        Runnable rResponseG = ()-> someMethod();


    }
}

public class SomeMethod {
    public static void main(String[] args) {
        TestClass.main(args);
    }
}