package concurrency.unsafeCode;
import java.util.concurrent.*;
import java.util.*;

/**
 Given:
    public class ThreadSafety{
      List<Student> sList = new ArrayList<Student>();
    
      public Student getStudent(){
        var s = sList.remove(0);
        return s;
      }
      ...other irrelevant code
    } 
    If two threads, T1 and T2, concurrently execute getStudent() method on the same ThreadSafety instance,
    which of the following are possible outcomes? (Assume that there are no nulls in the list.)
    
    A.
       T1 gets a Student object and T2 gets IndexOutOfBoundsException.
       
        If there is only one object in the list, it is possible that T1 gets the object, and when T2 tries to call remove(0),
        it gets IndexOutOfBoundsException because the list is now empty.
        Observe that in this situation, this is expected behavior.
        The exception is not because of T1 and T2 stepping on each other (though that might occur as well).
        
    B.
       T1 and T2 get two different instances of Student objects.
        ---
        This is an error free situation when both the threads are interleaved such that they do not impact each other.
        T1 removes an object and then T2 removes another object from the list. So both get a different object and there is no exception.
        Observe that a thread unsafe code does not necessarily break all the time. It may break at any time.
        
    C.
      T1 gets a Student object and T2 gets null.
        This will not happen because if there is no object in the ArrayList,
        the remove method doesn't return null but throws an IndexOutOfBoundsException
        
    D.
        T1 gets a Student object and T2 gets a ConcurrentModificationException.
        ---
        ConcurrentModificationException is thrown by the methods of the Iterator interfaces.
        It is thrown when, while one thread is iterating through a collection, another thread modifies the collection.
        In this case, no thread is iterating through the collection.
        
    E.
      Both the threads get a reference to the same Student object.
        ----
        Since the code accesses the list in an unsafe manner, it is possible that this situation might occur.
        It really depends on the implementation of ArrayList, though.
       
    
    
    ------
    This is an example of a thread unsafe code. ArrayList methods are not synchronized and therefore multiple
    threads can execute its methods at the same time thereby corrupting its internal variables.
    This can yield unpredictable results for various method calls on the list object.
      correct(A, B, E)
 */

class Student{
    
}

public class ThreadSafety {
    List<Student> sList = new ArrayList<Student>();

    public Student getStudent(){
      var s = sList.remove(0);
      return s;
    }
}