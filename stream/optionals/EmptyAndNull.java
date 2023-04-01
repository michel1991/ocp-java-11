package stream.optionals;
import java.util.*;

public class EmptyAndNull {
    /**
       Which are true of the following? (Choose two.)
       
        A. All of these will run without error.
        B. One of the lines fails to compile or throws an exception.
        C. Two of the lines fail to compile or throw an exception.
        D. None of these returns true when calling opt.isPresent()
        E. One of these returns true when calling opt.isPresent()
        F. Two of these return true when calling opt.isPresent()
        
        The second line throws a NullPointerException when you pass a null reference to the of() method.
        The others compile and run successfully, making option B correct.
        The first and third lines return false because they represent an empty Optional.
        This makes option D the other answer.
     */
    static void declaration(){
        var empty = Optional.empty();
        var param = Optional.of(null);
        var method = Optional.ofNullable(null);
    }
    
    public static void main(String... args){
        declaration();
    }
}