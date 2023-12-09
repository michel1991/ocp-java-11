package interfaces.function;
import java.util.function.*;

/**
 * Which of the following expressions can be used to implement a Function<Integer, String> ?
 */
public class ToHexString {
    public static void main(String... args){
        /**
            A. (a)-> Integer.toHexString(a)
                toHextString is a static method in Integer class. It takes an int as an argument
                and returns a String that represents the int value in Hexadecimal format.
            
           B. a -> Integer::toHexString
                Integer::toHexString is a valid method reference but is not suitable as a body
                 of a lambda expression because it is not possible to determine the
                 argument that is to be passed to this method from the context.
                 The given lambda expression will be converted into an anonymous class like this:


                new Function(){
                   public String apply(Integer a){
                       return Integer::toHexString;  //<- The method reference cannot be
                            //coverted into an expression that returns a String at this point.
                
                   }
                }
                
            
         */
        Function<Integer, String> responseA = (a)-> Integer.toHexString(a);
        
        
        /**
            C. Integer::toHexString
                This method reference can be coverted to a functional
                interface implementation because there is only one possible value
                that can be passed as an argument to toHexString,
                which is the argument passed to the Funtion's apply method. Something like this:

                new Function(){
                   public String apply(Integer arg){
                       return Integer.toHexString(arg);
                   }
                }

                Observe the difference between how a method reference and a lambda expression are handled.
                When you use a method reference, it is "converted" into a method body.
                But when you use a lambda expression, the expression given in the lamba body is used as it is in the method body.
         */
        Function<Integer, String> responseC = Integer::toHexString;
        
        /**
         D. i::toHexString
            This invalid because i is unknown and it is not a valid way to get a method reference.
         E. toHexString
            This is not a valid method reference because it does not specify the class that contains this method.
         F. val -> val + 1
            This is not valid because val is an int and val+1 will produce a int, while we need a String to be returned.
         */
        
        /**
           G. (Integer a)-> Integer.toHexString(a)
         */
        Function<Integer, String> responseG = (Integer a)-> Integer.toHexString(a);
        
        /**
           H. Integer a-> Integer.toHexString(a)
            If you are specifying the argument type, then the argument list must be enclosed within parenthesis i.e. ( ).
         */
        
        /**
          Final description 
           public interface Function<T,R> : Represents a function that accepts one argument and produces a result.

            This is a functional interface whose functional method is apply(Object).
            Function<Integer, String> means that the type of the input argument is Integer and the type of return value is String.
           
            If you have a method that expects this function, for example: void myMethod(Function<Integer, String> f){   ... }
            
            it can be invoked like this:
            
            myMethod( i -> "create some string here" );
            
            Correct(A,C, G)
         */
    }
}