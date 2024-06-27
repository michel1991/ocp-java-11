package lambda.lambdaAndReference;
import java.util.function.*;
import java.util.function.*;
import java.util.*;

/**
 Given:
    class MyProcessor{
        public void process(){
            System.out.println("Processing ");
        }
    }
    public class TestClass {
        
        public static void main(String[] args) {
            process(()->new MyProcessor()); //1 REPLACE THIS LINE OF CODE
        }
    
        public static void process(Supplier<MyProcessor> s){
            s.get().process();
        }
    }
    
    Which of the following options correctly replaces the line marked //1 with code that uses method reference?
    
    A. TestClass.process(MyProcessor::new);
        This is the correct syntax for referring to a constructor.
    B. TestClass.process(new::MyProcessor);
    C. TestClass.process(MyProcessor::new());
    D. TestClass.process(new::MyProcessor());
    E. TestClass.process(MyProcessor()::new);
    
    ---------------------
    Observe that the TestClass's static method process takes Supplier<MyProcessor> as an argument.
    The lambda expression //()->new MyProcessor()// creates a Supplier with the implementation
    of its functional method named get that just returns a new MyProcessor object. If it makes it easier to understand,
    you can think of this lambda expression in terms of an anonymous class like this:
        new Supplier(){
           public MyProcessor get(){
               return new MyProcessor(); //the body of a lambda expression becomes
        //the body of the functional method of the functional interface.

           }
        }

        The expression new MyProcessor() in the lambda expression can be replaced by MyProcessor::new.
    Correct(A)
    

 */

class MyProcessor{
    public void process(){
        System.out.println("Processing ");
    }
}
 class TestClass {
    
    public static void main(String[] args) {
        // process(()->new MyProcessor()); //1 REPLACE THIS LINE OF CODE
        TestClass.process(MyProcessor::new);
    }

    public static void process(Supplier<MyProcessor> s){
        s.get().process();
    }
}

public class MyProcessorTestClass {
    public static void main(String[] args) {
        TestClass.main(args);
    }
}