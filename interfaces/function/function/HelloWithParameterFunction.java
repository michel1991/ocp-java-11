package interfaces.function.function;
import java.util.function.*;

public class HelloWithParameterFunction {
    /**
     Which of the following lambda expressions can be used to implement a Function<Integer, String> ?
     A. (a)-> 2*a
             2*a will generate an int but we need a String.
             
     B. (a, s)-> a+" "+s
         There should be only one argument.
         
     C.(s) ->"hello "+s+"!"
        Don't be fooled by the argument name. s will still be of type Integer.
        
     D. (a, s, r)-> a+" "+s
            There should be only one argument.
            
     E. (a)-> System.out.println("done")
            The expression in the lambda body must return a String.
      
    -------------------------------------      
      public interface Function<T,R> : Represents a function that accepts one argument and produces a result.

        This is a functional interface whose functional method is apply(Object).
        
        Function<Integer, String> means that the type of the input argument is Integer and the type of return value is String.
        
        If you have a method that expects this function, for example: void myMethod(Function<Integer, String> f){   ... }
        
        it can be invoked like this:
        
        myMethod( i -> "create some string here" );
        
     Correct(C)

     */
    public static void main(String... args){
        Function<Integer, String> f = (s) ->"hello "+s+"!";
        f.apply(1991);
    }
}