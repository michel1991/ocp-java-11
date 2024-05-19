package collections.sublist;

/**
 In which sequence will the characters a, b, and, c be printed by the following program?
    A. The sequence a, b, c is printed.
    B. The sequence a, b, c, b is printed.
    C. The sequence a, c, b, c is printed.
    D. The sequence a, c, b is printed.
        add(1, "c") will insert 'c' between 'a' and 'b' . subList(1 , 1) will return an empty list.
    E. None of the above.
    
   ------------------------------------------------------
   First, "a" and "b" are appended to an empty list. Next, "c" is added between "a" and "b".
    Then a new list s2 is created using the sublist view allowing access to elements from index 1 to index 1(exclusive) (i.e. no elements ).
    (Note that if fromIndex and toIndex arguments t subList method are equal (as is the case in this question), subList returns an empty list.).
    Now, s2 is added to s1.
    So s1 remains :a, c, b
    
   Correct(D)

 */
import java.util.* ;
public class ListTest{
    public static void main(String args[]){
        List s1 = new ArrayList( );
        s1.add("a");
        s1.add("b");
        s1.add(1, "c");
        List s2 = new ArrayList(  s1.subList(1, 1) );
        s1.addAll(s2);
        System.out.println(s1);
    }
}