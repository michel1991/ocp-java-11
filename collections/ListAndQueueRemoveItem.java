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

    static void addElements(Collection<Integer>  q){
        q.add(10); //  4:
        q.add(12); // 5:
    }

    /**
    * remove by index, object are available, List add method remove by index
    */
    static void removeItem(List<Integer>  q){
        addElements(q);
        q.remove(1); //  6:
       System.out.println(q); //  7:
   }

    /**
     * Only remove by object is available to Collection that Queue inherit. Java make autobox from int to object
     */
    static void removeItemWithQueue(Queue<Integer>  q){
        addElements(q);
        q.remove(1); //  6:
        System.out.println(q); //  7:
   }

    /**
    * Only remove by object is available to Collection. Java make autobox from int to object
    */
    static void prooveThatOnlyRemoveByObjectIsAvailableToCollection(Collection<Integer>  q){
        addElements(q);
        q.remove(1); //  6:
        System.out.println(q); //  7:
    }

    static Queue<Integer> createQueue(){
        Queue <Integer> queue = new LinkedList<>();
        return queue;
    }

    public static void main(String... args){
        List <Integer> list = new LinkedList<>();
        removeItem(list);
        removeItemWithQueue(createQueue());
        prooveThatOnlyRemoveByObjectIsAvailableToCollection(createQueue());
   }
}