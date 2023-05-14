package collections.sets;
import java.util.*;

public class HashSetDoesHoldMethodToSetValueByIndex {
    /**
     * What is the output of the following? (Choose three.)
        A. When inserting ArrayList into the blank, the code prints 1 false.
        B. When inserting ArrayList into the blank, the code does not compile.
        C. When inserting HashMap into the blank, the code prints 1 false.
        D. When inserting HashMap into the blank, the code does not compile.
        E. When inserting HashSet into the blank, the code prints 1 false.
        F. When inserting HashSet into the blank, the code does not compile.
        
        Line 20 does not compile for a Map because it requires two generic types.
        Line 23 does not compile for a Set because the elements are unordered and do not have an index.
        This makes options D and F correct. Additionally, option A is correct
        because line 23 replaces the second element with a new value, making chars contain [a, c].
        Then line 24 removes the first element, making it just [c].
        There is only one element, but it is not the value b.

     */
   static void add(){
       var chars = new ArrayList<Character>(); // 20:  ___________________
       chars.add('a'); //  21: 
       chars.add(Character.valueOf('b')); //  22: 
       chars.set(1, 'c'); //   23: 
       chars.remove(0); //  24:
       System.out.print(chars.size() + " " + chars.contains('b')); //  25: 
   }
    
    public static void main(String... args){
        
    }
}