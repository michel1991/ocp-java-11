package interfaces.tricky.referenceMethods;
import java.util.function.*;
import java.util.*;
/**
   Given:
    Which of the following code snippets will print Processing 10?
    
    A.
       Supplier<MyProcessor> supp = MyProcessor::new;
        MyProcessor mp = supp.get();
        mp.process();
        
    B.
        Supplier<MyProcessor> supp = MyProcessor::new(10);
        MyProcessor mp = supp.get();
        mp.process();
        
    C.
        Supplier<MyProcessor> supp = MyProcessor(10)::new;
        MyProcessor mp = supp.get();
        mp.process();
        
    D.
       Function<Integer, MyProcessor> f = MyProcessor::new;
        MyProcessor mp = f.apply(10);
        mp.process();
    Here, you are using a constructor reference of the constructor that takes an argument.
    The argument is actually passed during the call to f.apply method, which is also when the constructor is invoked.
    
    E.
        MyProcessor mp = MyProcessor::new(10);
        mp.process();
        This will not compile because MyProcessor is not a functional interface and so you cannot "implement" it using a method or constructor reference.
        Further, the syntax for constructor reference is invalid.
        
    -----------------
      An important point to understand with method or constructor references is that you can never pass arguments while referring
      to a constructor or a method. Remember that such references are mere references. They are not actual invocations.
       Basically, when you do Supplier<MyProcessor> s = MyProcessor:new; you are telling the compiler to get you
       the constructor reference of the constructor that does not take any argument.
       This is because Supplier's functional method does not take any argument.
       On the other hand, when you do Function<Integer, MyProcessor> f =  MyProcessor::new; you are telling
       the compiler to get you the constructor reference of the constructor that takes one Integer argument.
       The compiler figures this out because the functional method of Function interface requires one argument and you have parameterized it to Integer.
       So the compiler looks for a constructor that takes an Integer (or int) argument and gives you that constructor's reference.
       The constructor or the method is not invoked at this time and therefore, no argument is needed at this time.
    
    Arguments are required only when you actually invoke the constructor or a method.
    Therefore, code such as MyProcessor::new(10); doesn't make sense. You cannot pass arguments while taking a reference.
    You pass arguments when you use the reference to invoke it as done in option 4: MyProcessor mp = f.apply(10);
    This works because f is already defined to use a constructor reference that takes a parameter. 10 is passed to that constructo
   Correct(A, D)
 */
class MyProcessor{
    int value;
    public MyProcessor(){ value = 10; }
    public MyProcessor(int value){
        this.value = value;
    }
    public void process(){
        System.out.println("Processing "+value);
    }
    
    static void responseA(){
        Supplier<MyProcessor> supp = MyProcessor::new;
        MyProcessor mp = supp.get();
        mp.process();
    }
    
    static void responseD(){
        Function<Integer, MyProcessor> f = MyProcessor::new;
        MyProcessor mp = f.apply(10);
        mp.process();
    }
    
    public static void main(String...args){
        responseA();
        responseD();
    }
}