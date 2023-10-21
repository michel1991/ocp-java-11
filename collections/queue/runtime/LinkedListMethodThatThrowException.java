package collections.queue.runtime;
import java.util.*;


public class LinkedListMethodThatThrowException {
    
    /**
     * Which statements when inserted independently will throw an exception at runtime? (Choose two.)
        A. x.peek(); x.peek();
        B. x.poll(); x.poll();
        C. x.pop(); x.pop();
        D. x.remove(); x.remove();
        
         Option A is incorrect because the peek() method returns the next
        value or null if there isn’t one without changing the state of the queue.
        In this example, both peek() calls return 18.
        
        Option B is incorrect because the poll() method removes and returns the next value,
        returning null if there isn’t one.
        
        In this case, 18 and null are returned, respectively.
        Options C and D are correct because both the pop()
        and remove() methods throw a NoSuchElementException
        when the queue is empty.
        
        This means both return 18 for the first call and throw an exception for the second.
     */
    static void popThrowExecptionIfEmptyList(){
        var x = new LinkedList<>();
        x.offer(18);
        // INSERT CODE HERE
        x.pop(); x.pop();
    }
    
    public static void main(String... args){
        try{
            popThrowExecptionIfEmptyList();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
}