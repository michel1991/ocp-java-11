package concurrency.tricky;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 Consider the following code:

    import java.util.List;
    import java.util.concurrent.CopyOnWriteArrayList;
    public class MyCache {
        private CopyOnWriteArrayList<String> cal = new CopyOnWriteArrayList<>();
    
        public void addData(List<String> list){
            cal.addAll(list);
        }
        
        public Iterator getIterator(){
            return cal.iterator();
        }
    }
    
    
    Given that one thread calls the addData method on an instance of the above class and another
    thread calls the getIterator method on the same instance at the same time and starts iterating
    through its values, which of the following options are correct?
    
    
    (Assume that no other calls have been made on the MyCache instance.)
    
    A. The call to addAll may be blocked while the other thread is iterating through the iterator.
    B. Both the threads will complete their operations successfully without getting any exception.
    C. The thread iterating through the Iterator will get a ConcurrentModificationException.
       -------------
        CopyOnWriteArrayList guarantees that the Iterator acquired from its instance will never get this exception.
        This is made possible by creating a copy of the underlying array of the data.
        The Iterator is backed by this duplicate array.

        An implication of this is that any modifications done to the list are not reflected
        in the Iterator and no modifications can be done on the list using that Iterator (such as by calling iterator.remove() ).
        Calls that try to modify the iterator will get UnsupportedOperationException.
        
    D. Elements added by the addAll method will automatically be visible through the iterator in the other thread.
    --------------------------------
       This will happen only if the call to addAll succeeds before the iterator is acquired.
       If the call to addAll is executed after the iterator has been acquired or while the iterator
       is being iterated through, the new elements will not be visible through the iterator.
       
    ------
     Correct (B)

 */
public class MyCache {
    private CopyOnWriteArrayList<String> cal = new CopyOnWriteArrayList<>();

    public void addData(List<String> list){
        cal.addAll(list);
    }
    
    public Iterator getIterator(){
        return cal.iterator();
    }
}
