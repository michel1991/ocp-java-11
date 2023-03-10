package list;
import java.util.*;

public class ArrayDequeMethods {
    /**
     * Which of these elements are in the output of the following? (Choose three.)
        A. sugar
        B. minnie
        C. snowball
        D. 1
        E. 2
        F. 3

        The offerLast() and offer() methods insert an element at the back of the queue,
        while the offerFirst() method inserts the element at the front of the queue.
        This means the queue initially contains [snowball, sugar, minnie].
        The poll() method returns the element at the front of the queue and removes it.
        In this case, it prints snowball, and the queue is reduced from three elements to [sugar, minnie].
        Then, the removeFirst() method removes sugar, leaving the queue as only containing [minnie].
        Further, the queue becomes one smaller, and 1 is printed. These are options A, C, and D.
     */
  static void firstExample(){
      var q = new ArrayDeque<String>();
      q.offerFirst("snowball");
      q.offer("sugar");
      q.offerLast("minnie");

      System.out.println(q.poll());
      System.out.println(q.removeFirst());
      System.out.println(q.size());

  }

    public static void main(String... args){
        firstExample();
    }
}