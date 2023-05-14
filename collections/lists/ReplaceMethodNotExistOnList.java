package collections.lists;
import java.util.*;



public class ReplaceMethodNotExistOnList {
    /**
    *  Which of the following pairs fill in the blanks to output 6?
        A. ArrayList and put(1, 6)
        B. ArrayList and replace(1, 6)
        C. ArrayList and set(1, 6)
        D. HashSet and put(1, 6)
        E. HashSet and replace(1, 6)
        F. HashSet and set(1, 6)
        G. The code does not compile with any of these options.

       The put() method is used on a Map rather than a List or Set, making options A and D incorrect.
       The replace() method does not exist on either of these interfaces.
        Finally, the set method is valid on a List rather than a Set because a List has an index.
        Therefore, option C is correct.

    */
   static void choiceCorrectMethod(){
       var values = new ArrayList<Integer>(); //  3:  ____________
       values.add(4);  //  4:
       values.add(4);  //  5:
       values.set(1, 6); //  6:  // __________
       values.remove(0); //  7:
       for (var v : values) System.out.print(v); // 8:
   }

    public static void main(String... args){
        choiceCorrectMethod();
   }
}