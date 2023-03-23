package constructingSensitiveObjects.makingMethodsFinal;
import java.util.stream.*;
import java.util.*;
public class FoodOrder {
   private String item;
   private int count;

   public FoodOrder(String item, int count){
       setItem(item);
       setCount(count);
   }

   final public String getItem() {
       return item;
   }

    final public void setItem(String item) {
       this.item = item;
   }

    final public int getCount() {
       return count;
   }

    final public void setCount(int count) {
       this.count = count;
   }

    /**
     * count numbers of items
     */
    public static int total(List<FoodOrder> orders) {
       return orders.stream()
       .mapToInt(FoodOrder::getCount)
       .sum()
       ;
   }
}