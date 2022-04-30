package implementingConsumerAndBiConsumer;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.HashMap;

public class ConsumerAndBiConsumerExample {
  
 static void consumer(){
    Consumer<String> c1 = System.out::println;
    Consumer<String> c2 = x ->  System.out.println(x);

     c1.accept("Annie");
     c2.accept("Annie");
 }

static void biConsumer(){
   var map = new HashMap<String, Integer>();
   BiConsumer<String, Integer> b1 = map::put;
   BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

   b1.accept("chicken", 7);
   b2.accept("chick", 1);
   System.out.println("BiConsumer " + map);
}


static void anotherBiConsumer(){
   var map = new HashMap<String, String>();
   BiConsumer<String, String> b1 = map::put;
   BiConsumer<String, String> b2 = (k, v) -> map.put(k, v);

   b1.accept("chicken", "Cluck");
   b2.accept("chick", "Tweep");
   System.out.println("BiConsumer " + map);
}



 public static void main(String[] args){
    consumer();
    System.out.println();

    biConsumer();

    System.out.println();

   anotherBiConsumer();
  }

}
