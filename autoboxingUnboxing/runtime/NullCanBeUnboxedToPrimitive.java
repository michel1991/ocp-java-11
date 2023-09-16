package autoboxingUnboxing.runtime;
import java.util.*;

/**
  What is the result of the following?
    A. The code does not compile.
    B. Line 14 throws an exception.
    C. Line 15 throws an exception.
    D. Line 16 throws an exception.
    E. Line 17 throws an exception.
    F. 3null4
    
    The code does compile, making option A incorrect.
    Line 13 creates a fixed-size list.
     While we are using var, the type is List˂Integer˃.
     Line 14 successfully changes the contents of the list to [3, null, 4].
     Line 15 automatically unboxes to the primitive 3.
     Line 16 has a problem. The list has a null value at index 1.
     This cannot be unboxed to a primitive and throws a NullPointerException.
     Therefore, option D is the answer. If line 16 were commented out,
     line 17 would have thrown an exception because Java uses zero based indexes,
     and there is no element at index 3.
 */
public class NullCanBeUnboxedToPrimitive {
    public static void main(String... args){
        var numbers = Arrays.asList(3, 1, 4); // 13: 
        numbers.set(1, null); //   14: 
        int first = numbers.get(0); // 15: 
        int middle = numbers.get(1); //   16: 
        int last = numbers.get(3); //   17: 
        System.out.println(first + " " + middle + " " + last); // 18: 
    }
}