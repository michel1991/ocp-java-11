package list;
import java.util.*;

public class LinkedListOperations {
    /**
     *  What is the output of the following?
        A. 13 5
        B. 13 18
        C. 18 5
        D. 18 13
        E. The code does not compile.
        F. The code compiles, but prints something else.

        Note that LinkedList is a Deque, or double-ended queue.
        This lets us add elements at both ends. The offer() method
        adds an element to the back of the queue. After line 7 completes,
        the queue contains 18 and 5 in that order. The push() method adds an element to the front of the queue.
        How rude! The element 13 pushes past everyone on the line. After line 8 completes,
        the queue now contains 13, 18, and 5, in that order.
        Then we get the first two elements
        from the front, which are 13 and 18, making option B correct.

     */
  static void add(){
      var x = new LinkedList<Integer>(); //  5:
      x.offer(18); //  6:
      x.offer(5); //  7:
      x.push(13); // 8:
      System.out.println(x.poll() + " " + x.poll()); //  9:
  }

    public static void main(String... args){
      add();
  }
}