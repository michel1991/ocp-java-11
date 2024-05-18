package collections.tricky.maps;
import java.util.*;
import java.util.concurrent.*;

/**
  Given:
    Which of the above lines will throw NullPointerException?
    (Assume that each of the put and add calls are executed as if they are wrapped inside a try/catch block i.e.
    an exception thrown at //1 will not prevent the execution of //2.)
    
    A. //1
    B. //2
    C. //3
    D. //4
    E. //5
    F. //6
    G. //7
    
   CopyOnWriteArrayList is a thread-safe variant of ArrayList in which all mutative operations (add, set, and so on)
   are implemented by making a fresh copy of the underlying array. It permits all elements to be added, including null.
   -------------------------------------------------------------------------------------------
   Remember that HashMap supports adding null key as well as null values but ConcurrentHashMap does not.
   Inserting null key or null in a ConcurrentHashMap will throw a NullPointerException.
   Some candidates have reported getting a question on this aspect of ConcurrentHashMap.
   
   Correct(A, B)
 */
public class ConcurrentHashMapNotAllowNullValue {
    public static void main(String...args){
        Map hm = new ConcurrentHashMap();
        hm.put(null, "asdf");  //1
        hm.put("aaa", null);  //2
    
        hm = new HashMap();
        hm.put(null, "asdf");  //3
        hm.put("aaa", null);  //4
    
        List list = new ArrayList();
        list.add(null); //5
        list.add(null); //6
    
        list = new CopyOnWriteArrayList();
        list.add(null); //7
    }
}