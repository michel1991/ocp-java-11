package collections.comparison;
import java.util.*;

public class MyComparator implements Comparator<String> {
    /**
       What is the result of the following program?
        A. Abb aab 123
        B. aab Abb 123
        C. 123 Abb aab
        D. 123 aab Abb
        E. The code does not compile.
        F. A runtime exception is thrown.

       The array is sorted using MyComparator, which sorts the elements in reverse alphabetical order in a case-insensitive fashion.
       Normally, numbers sort before letters. This code reverses that by calling the compareTo() method on b instead of a.
     */
    public int compare(String a, String b) {
        return b.toLowerCase().compareTo(a.toLowerCase());
    }

    static String[] reverseAlphabetical(){
        String[] values = { "123", "Abb", "aab" };
        Arrays.sort(values, new MyComparator());
        return values;
    }
    
    public static void main(String... args){
        System.out.println(Arrays.asList(reverseAlphabetical()));
    }
}