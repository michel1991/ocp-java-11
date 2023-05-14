package list.queue.errors;
import java.util.*;


public class ArrayDequeNotHaveSomeMethod {
    
    /**
     *  What is the output of the following?
      
        A. sugar sugar 3
        B. sugar minnie 1
        C. minnie minnie 3
        D. minnie snowball 1
        E. The code does not compile.
        F. None of the above.
        
        The addFirst() and addLast() methods are on the Deque interface.
        While ArrayDeque does implement this interface, it also implements Queue.
        Since the q variable is of type Queue, these methods do not compile,
         and option E is the answer. If the correct interface were used,
         minnie minnie 3 would be printed.
     */
   static void addWithAddFirstAndAddLast(){
       Queue<String> q = new ArrayDeque<>();
       q.add("snowball");
       q.addLast("sugar");
       q.addFirst("minnie");

       System.out.println(q.peek() + " " + q.peek() + " " + q.size());
   }
}