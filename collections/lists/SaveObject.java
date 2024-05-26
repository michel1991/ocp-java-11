package collections.lists;
import java.util.*;

/**
  Consider the following code to count objects and save the most recent object:

    int i = 0 ;
    Object prevObject ;
    public void saveObject(List e ){
        prevObject = e ;
        i++ ;
    }
    
    Which of the following calls will work without throwing an exception?
    
    A. saveObject( new ArrayList() );
         Because an ArrayList is a List.
      
    B. Collection c = new ArrayList(); saveObject( c );
        saveObject() cannot accept c because c is declared of type Collection, which is a super interface of List,
        but the saveObject() method expects a List.
        
    C. List el = new ArrayList(); saveObject(el);
    
    D. saveObject(null);
        In this case prevObj will be set to null.
       
     E. saveObject(0); //The argument is the number zero and not the letter o
        0 is an int, which means it is a primitive. So it will be boxed into
        an Integer object when you pass it to a method that expects an Object.
        However, Integer cannot be passed to a method that expects a List.
        Therefore, this option is not valid.
        Had the method been saveObject(Object obj), it would have been valid because an Integer is an Object.

 */
public class SaveObject {
    int i = 0 ;
    Object prevObject ;
    public void saveObject(List e ){
        prevObject = e ;
        i++ ;
    }
    
    public static void main(String... args){
        var ob = new SaveObject();
        ob.saveObject( new ArrayList() );
        List el = new ArrayList(); ob.saveObject(el);
        ob.saveObject(null);

    }
}