package list;
import java.util.*;

/**
* Which options are true of the following code? (Choose all that apply.)
*
*   A. If we fill in the blank with List, the output is [10].
    B. If we fill in the blank with List, the output is [10, 12].
    C. If we fill in the blank with Queue, the output is [10].
    D. If we fill in the blank with Queue, the output is [10, 12].
    E. The code does not compile in either scenario.
    F. A runtime exception is thrown.

    A LinkedList implements both List and Queue. The List interface has a method to remove by index.
    Since this method exists, Java does not autobox to call the other method.
    Queue has only the remove by object method, so Java does autobox there.
    Since the number 1 is not in the list, Java does not remove anything for the Queue.
 */
public class  ListAndQueueRemoveItem {
    static void removeItem(List<Integer>  q){
       q.add(10); //  4:
       q.add(12); // 5:
       q.remove(1); //  6:
       System.out.println(q); //  7:
   }

    static void removeItemWithQueue(Queue<Integer>  q){
       q.add(10); //  4:
        q.add(12); // 5:
        q.remove(1); //  6:
        System.out.println(q); //  7:
   }

    public static void main(String... args){
        List <Integer> list = new LinkedList<>();
        Queue <Integer> queue = new LinkedList<>();
       removeItem(list);
       removeItemWithQueue(queue);
       //removeItem(queue);
   }
}