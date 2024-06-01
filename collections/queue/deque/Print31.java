package collections.queue.deque;
import java.util.*;

public class Print31 {
    /**
     What will be the contents of d at the end of the following code?

        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.addFirst(2);
        d.pop();
        d.offerFirst(3);
    
        (Assume that in the output, front of deque is on the left side and the end is on the right side.)
        
        A.
            1, 3
        
        B. 3, 1
           ---------------
            add(e) is a queue method and adds the element to the end. But addFirst(e), adds the element in the front.
            Therefore, the contents of d change as follows:
            1
            2, 1
            Now, pop() removes the element from the front, so d contains:
            1
            offer(e) is a queue method and adds the element to the end. But offerFirst(e), adds the element in the front.
            Therefore, the contents of d change to:
            3, 1
            
        C. An exception will be thrown at run time.

        D. Order of elements in the Deque cannot be predicted.

        E. It will not compile.

     -----------------------------------------------------
     Deque is an important interface for the exam. To answer the questions,
     you must remember that a Deque can act as a Queue as well as a Stack. Based on this fact, you can deduce the following:

        1. Since Queue is a FIFO structure (First In First Out i.e. add to the end and remove from the front),
        it has methods offer(e)/add(e)(for adding an element to the end or tail) and poll()/remove()(for removing an element
        from the front or head) for this purpose.  Note that offer and add are similar while poll and remove are similar.
        
        2. Since Stack is a LIFO structure (Last In First Out i.e. add to the front and remove from the front),
        it provides methods push(e) and pop() for this purpose, where push adds to the front and pop removes from the front.
        
        Besides the above methods, Deque also has variations of the above methods. But it is easy to figure out what they do:
        
        pollFirst()/pollLast() - poll is a Queue method. Therefore pollFirst and pollLast will remove elements from the front
        and from the end respectively.
        removeFirst()/removeLast() - These are Deque specific methods. They will remove elements from the front and from the end respectively.
        These methods differ from pollFirst/pollLast only in that they throw an exception if this deque is empty.
        
        offerFirst(e)/offerLast(e) - offer is a Queue method.
        Therefore offerFirst and offerLast will add elements to the front and to the end respectively.
        addFirst(e)/addLast(e) - add is a Queue method. Therefore addFirst and addLast will add elements to the front and to the end respectively.
        
        peek(), peekFirst(): return the first element from the front of the queue but does not remove it from the queue.
        peekLast() : returns the last element from the end of the queue but does not remove it from the queue.
        element(): retrieves, but does not remove, the head of the queue represented by this deque
        (in other words, the first element of this deque). This method differs from peek only in that it throws an exception if this deque is empty.
        
        Notice that there is no pushFirst(e) and pushLast(e).
        
        You may wonder why there are multiple methods for the same thing such as offer(e) and add(e).
         Well, they are not exactly same. add(e) throws an exception if the element cannot
         be added to the queue because of lack of capacity, while offer(e) does not.
         There are similar differences in other methods but they are not too important for the exam.
        Correct(B)
     */
    public static void main(String... args){
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.addFirst(2);
        d.pop();
        d.offerFirst(3);
        System.out.println(d);
    }
}