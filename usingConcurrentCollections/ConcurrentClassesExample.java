package  usingConcurrentCollections;
import java.util.concurrent.*;
import java.util.*;

public class  ConcurrentClassesExample{
  public static void main(String[] args){
      Map<String, Integer> map = new ConcurrentHashMap<>();
      map.put("zebra", 52);
      map.put("elephant", 10);
      System.out.println(map.get("elephant"));
      
      Queue<Integer> queue = new ConcurrentLinkedQueue<>();
      queue.offer(31);
      System.out.println(queue.peek());
      System.out.println(queue.poll());
  }

}
