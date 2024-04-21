package stream.optionals;
import java.util.*;

/**
 * Identify correct statement(s) about the following code:
 
   A. It will throw a NullPointerException at //1
    Optional.of method throws NullPointerException if you try to create an Optional with a null value.
    If you expect the argument to be null, you should use Optional.ofNullable method, which returns an empty Optional if the argument is null.
    
   B. It will throw a NullPointerException at //3
   
   C. It will throw a NoSuchElementException at //3
    Calling get() on an empty Optional causes a java.util.NoSuchElementException to be thrown.
    If you expect an Optional to be empty, you should use orElse(T ) method. This method never throws any exception, not even if the argument is null.
    
    D. It will throw a NullPointerException at //4
    Optional's orElse method never throws any exception.
    
    E. 
        It will print:
        false
        null
        null
       
      Correct(A)
 */
public class FunWithOptional{
    public static String getValue(){
        return null;
    }
    public static void main(String[] args) {
        Optional<String> stro = Optional.of(getValue());//1
        System.out.println(stro.isPresent());//2
        System.out.println(stro.get());//3
        System.out.println(stro.orElse(null));//4
    }
} 