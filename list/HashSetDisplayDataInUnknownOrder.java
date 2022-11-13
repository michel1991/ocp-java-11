package list;
import java.util.*;

public class HashSetDisplayDataInUnknownOrder {
   public static void display(){
       var numbers = new HashSet<Number>();
       numbers.add(Integer.valueOf(86));
       numbers.add(75);
       numbers.add(Integer.valueOf(86));
       numbers.add(null);
       numbers.add(309L);
       Iterator iter = numbers.iterator();
       while (iter.hasNext())
           System.out.println(iter.next());
   }

    public static void main(String... args){
       display();
    }
}