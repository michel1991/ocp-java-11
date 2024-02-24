package stream.map.errors;
import java.util.*;
import java.util.stream.*;

/**
 * What can be inserted in the code below so that it will print 1 2 3?
 */
class MyProcessor{
    Integer value;
    public MyProcessor(Integer value){
        this.value = value;
    }
    public void process(){
        System.out.println(value+" ");
    }
}

/**
    A. ls.stream()
        .map(x->MyProcessor::new(x))
        .forEach(MyProcessor::process);
            You cannot pass arguments to a constructor or method while referring
            to method/constructor reference. If the constructor or the method requires an argument,
            it is passed when the constructor or the method is actually invoked.
            For example, you can do this:
        names.stream()
        .map(x->{
        
           //referring to MyProcessor's constructor that takes one Integer argument.
           Function<Integer, MyProcessor> f = MyProcessor::new;
        
           return f.apply(x); //passing the actual Integer argument.
        }).forEach(MyProcessor::process);
        
       B. ls.stream()
        .map(MyProcessor::new)
        .forEach(MyProcessor::process);
        
            Here, map method does have an implicit Integer object in the context,
            which is in fact the current element of the list. This element will
            be passed as an argument to the MyProcessor constructor.
            Similarly, forEach has a MyProcessor object in the context while invoking
            the process method. Since process is an instance method of MyProcessor,
            the MyProcessor instance that is available in the context will be used to invoke the process method
            
          C. s.stream()
               .forEach((x)->process( MyProcessor::new ));
            This is syntactically illegal and will not compile.
            
          D. ls.stream()
               .forEach(x->MyProcessor::new);
               
        This is syntactically illegal and will not compile. You could do this though:
        ls.stream().forEach(x->{
                    new MyProcessor(x).process();
                        });
         
    An important point to understand with method or constructor references is that you can never pass arguments
    while referring to a constructor or a method. Remember that such references are mere references.
    They are not actual invocations. For example, when you do Supplier<MyProcessor> s = MyProcessor::new;
    you are telling the compiler to get you the constructor reference of the constructor that does not take any argument.
    This is because Supplier's functional method does not take any argument. Of course,
    this won't compile because MyProcessor does not have such a constructor.

    On the other hand, when you do Function<Integer, MyProcessor> f =  MyProcessor::new; you are
    telling the compiler to get you the constructor reference of the constructor that takes one Integer argument.
    The compiler figures this out because the functional method of Function interface requires
    one argument and you have parameterized it to Integer. So the compiler looks for a constructor
    that takes an Integer (or int) argument and gives you that constructor's reference.
    The constructor or the method is not invoked at this time and therefore, no argument is needed at this time.

    Arguments are required only when you actually invoke the constructor or a method. Therefore, code such as MyProcessor::new(10);
    doesn't make sense. You cannot pass arguments while taking a reference.
    You pass arguments when you use the reference to invoke it as done in option 4: MyProcessor mp = f.apply(10);
    This works because f is already defined to use a constructor reference that takes a parameter. 10 is passed to that constructor.
      
           Correct(B)
 */
public class TestClassMyProcessor { // correct  TestClass

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3);

        // INSERT CODE HERE
        ls.stream()
        .map(MyProcessor::new)
        .forEach(MyProcessor::process);
    }
}