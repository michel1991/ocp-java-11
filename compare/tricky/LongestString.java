package compare.tricky;
import java.util.*;

/**
   Suppose we want to implement a Comparator<String> so that it sorts the longest strings first.
   You may assume there are no null values. Which method could implement such a comparator?


    A.
        public int compare(String s1, String s2) {
           return s1.length() - s2.length();
        }

    B.
        public int compare(String s1, String s2) {
           return s2.length() - s1.length();
        }

    C.
        public int compare(Object obj1, Object obj2) {
           String s1 = (String) obj1;
           String s2 = (String) obj2;
           return s1.length() - s2.length();
        }

    D.
        public int compare(Object obj1, Object obj2) {
           String s1 = (String) obj1;
           String s2 = (String) obj2;
           return s2.length() - s1.length();
        }

    E. None of the above

    Options C and D are incorrect because the method signature is incorrect.
     Unlike the equals() method,
     the method in Comparator<String> takes the type being
     compared as the parameters when using generics.
     Option A is a valid Comparator<String>. However, it sorts in ascending order by length.
     Option B is correct. If s1 is three characters and s2 is one character, it returns -2.
     The negative value says that s1 should sort first,
     which is correct, because we want the longest String first.
 */
public class LongestString {
    public int compare(String s1, String s2) {
        return s2.length() - s1.length();
    }
}