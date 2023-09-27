package stream.complex;
import java.lang.annotation.*;
/**
 * How many times does this code print [2, 7, 8]?
 
    A. Zero.
    B. One.
    C. Two.
    D. Three.
    E. The code does not compile.
    F. The code compiles but throws an exception.
    
    Lines 14 and 15 create RemoveMe˂Integer˃ and RemoveMe<Long> instances, respectively.
    Since we are using generics, the method calls on lines 16 and 17 autobox the primitive values (1 and 1L)
    to the Integer value 1 and Long value 1L, respectively.
    Therefore, the method on line 11 removes the argument
    that matches this object value, and not the element at index 1, from the two lists.
    These are the two lines that print [2, 7, 8]. Line 27 is trickier.
    Since we are passing a primitive int,
    the index is used (and not an object matching the value) in the call to remove().
    This means line 28 prints [2, 1, 8], which is not what we are looking for.
    Since only lines 16 and 17 give us the desired output, option C is the answer.

 */


 import java.util.*; // 1: 
  import java.util.stream.*; // 2:
//3:
public class RemoveMe<T> { // 4: 
    private List<T> values; //   5:
    @SafeVarargs
    public RemoveMe(T... values) { //   6: 
        this.values = Arrays.stream(values) //7: 
          .collect(Collectors.toList()); // 8: 
    } //     9:  
    public void remove(T value) { // 10: 
        values.remove(value); //    11: 
    } //  12:
    public static void main(String[] args) { // 13: 
        var integer = new RemoveMe<Integer>(2, 7, 1, 8); //   14: 
        var longs = new RemoveMe<Long>(2L, 7L, 1L, 8L); //  15: 
        integer.remove(1); //      16: 
        longs.remove(1L); //    17: 
        //18:
        System.out.println(integer.values); // 19:  
        System.out.println(longs.values); //   20: 
       // 21:
        var values = new ArrayList<Integer>(); // 22: 
        values.add(2); //      23:
        values.add(7); //     24: 
        values.add(1); //    25: 
        values.add(8); //       26:  
        values.remove(1); //   27: 
        System.out.println(values); //     28: 
    } // 29: 
} // 30: