package collections.lists.remove;
import java.util.*;

public class RemoveValueOfVariableS {
    /**
     What will the following code print?
        A. A NullPointerException will be thrown at line marked //1.
        B. A NullPointerException will be thrown at line marked //2.
        C. A NullPointerException will be thrown at line marked //3.
        
        D. [a, b]
            -----
            It is possible for a particular implementation of List to not support nulls,
            in which case a NullPointerException is thrown when you try to add/remove nulls from such a List.
        
             However, ArrayList does support nulls. You can add and remove nulls to/from an ArrayList.
             Therefore, in the given code, a NullPointerException will not be thrown.
             The print statement will simply print the contents of the list.
             
        E. [a, null, b]
        F. []
        
        ----------------
        ArrayList's remove(Object ) method returns a boolean. It returns true if the element is found in the list and false otherwise.
        The JavaDoc API description of this method is important for the exam -

        public boolean remove(Object o)
        Removes the first occurrence of the specified element from this list, if it is present (optional operation).
        If this list does not contain the element, it is unchanged.
        More formally, removes the element with the lowest index i such that (o==null ? get(i)==null : o.equals(get(i)))
        (if such an element exists). Returns true if this list contained the specified
        element (or equivalently, if this list changed as a result of the call).
        
        Observe that it does not remove all occurences of the element. It removes just the first one.
        
        Correct(D)

     */
    public static void main(String... args){
        List<String> s1 = new ArrayList<String>();
        String s = null;
        s1.add("a");
        s1.add(s); //1
        s1.add("b");
        s1.remove(s); //2
        System.out.println(s1); //3
    }
}