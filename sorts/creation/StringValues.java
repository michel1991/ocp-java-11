package sorts.creation;
import java.util.*;

public class StringValues {
    /**
     Given the following code that appears inside a method:

           var values = new ArrayList<String>();
           //INSERT CODE HERE
        
        What can be inserted at the given location without causing any compilation error?
        
        A.
          values.sort( var a, var b-> a.compareTo(b) );
           -----
            The lambda expresion is syntactically incorrect.
            If you want to specify the type of the lambda variables or if there are more than one arguments,
            then you have to put the argument list within parentheses, like this:
            values.sort((var a, var b)->a.compareTo(b));
            
        B.
            values.sort( (a, b) -> a.compareTo(b) );
            values.forEach( System.out::println );
            
            -------
            Note: List extends Iterable interface, which defines a default forEach method:
            default void forEach(Consumer<? super T> action)
            Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
            Actions are performed in the order of iteration, if that order is specified.
            Exceptions thrown by the action are relayed to the caller.
            
            The behavior of this method is unspecified if the action performs side-effects that modify the underlying source of elements,
            unless an overriding class has specified a concurrent modification policy.
            
            Implementation Requirements:
            The default implementation behaves as if:
            
                 for (T t : this)
                     action.accept(t);
                     
        C.
            values.sort();
            values.forEach( System.out::println);
            
            ----------
            The sort method requires a Comparator as an argument.
            Note: java.util.List interface defines a default void sort(Comparator<? super E> c) method,
            which sorts the elements of the list as per the ordering enforced by the passed Comparator.
            
        D.
           values.removeIf((var k)->k.equals("a") );

        E.
            String[] sa = values.toArray();
            
             --------------------
            values.toArray(); will return an Object[]. You cannot assign it to sa, which is of type String[], without a cast.
            
            List has two toArray methods.
            
            1. Object[] toArray() :     
            Returns an array containing all of the elements in this list in proper sequence (from first to last element).
            
            2. <T> T[] toArray(T[] a) :
            Returns an array containing all of the elements in this list in proper sequence
    (from first to last element); the runtime type of the returned array is that of the specified array.
    If the list fits in the specified array, it is returned therein.
    Otherwise, a new array is allocated with the runtime type of the specified array and the size of this list
            
            Thus, the argument to this method can be an array with length 0 (but not null) i.e.
            String[] sa = values.toArray(new String[0]); //valid, sa will be assigned a new
            //array of Strings containing all the elements of the array pointed to by values.
            String[] temp = null;
            String[] sa = values.toArray(temp);//will compile but will throw NullPointerException
            
         -----------------------------------------------------------
           Correct(B, D)
     */
    
    static void responseB(List<String> values){
        values.sort( (a, b) -> a.compareTo(b) );
        values.forEach( System.out::println );
    }
    
    static void responseD(List<String> values){
        values.removeIf((var k)->k.equals("a") );
    }
    
    public static void main(String... args){
        var values = new ArrayList<String>();
        responseB(values);
        responseD(values);
    }
}