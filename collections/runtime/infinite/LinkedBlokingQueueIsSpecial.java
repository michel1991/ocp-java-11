package list.runtime;
import java.util.*;

public class LinkedBlokingQueueIsSpecial {
    
    /**
     Given the original array, how many of the following for statements enter an infinite loop at runtime,
       assuming each is executed independently?
       
        A. Zero.
        B. One.
        C. Two.
        D. Three.
        E. Four.
        F. The code does not compile.

     
     The for loops using copy1 and copy4 both throw a ConcurrentModificationException at runtime,
     since neither allows modification while they are being iterated upon. Next,
     CopyOnWriteArrayList makes a copy of the collection every time it is modified,
     preserving the original list of values the iterator is using.
     For this reason, the for loop using copy2 completes without throwing an exception or creating an infinite loop.
     On the other hand, the loop with copy3 enters an infinite loop at runtime.
     Each time a new value is inserted, the iterator is updated, and the process repeats.
     Since this is the only statement that produces an infinite loop, option B is correct.
     */
    static void infiniteLoop(){
        var original = new ArrayList<Integer>(List.of(1,2,3));

        var copy1 = new ArrayList<Integer>(original);
        for(Integer q : copy1)
            copy1.add(1);

        var copy2 = new CopyOnWriteArrayList<Integer>(original);
        for(Integer q : copy2)
            copy2.add(2);

        var copy3 = new LinkedBlockingQueue<Integer>(original);
        for(Integer q : copy3)
            copy3.offer(3);

        var copy4 = Collections.synchronizedList(original);
        for(Integer q : copy4)
            copy4.add(4);
    }
    public static void main(String... args){
        
    }
}