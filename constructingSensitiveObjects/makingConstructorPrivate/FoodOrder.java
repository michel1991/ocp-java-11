package constructingSensitiveObjects.makingConstructorPrivate;
import java.util.stream.*;
import java.util.*;

public class FoodOrder {
   private String item;
   private int count;

   private FoodOrder(String item, int count){
       setItem(item);
       setCount(count);
   }

   public String getItem() {
       return item;
   }

    public void setItem(String item) {
       this.item = item;
   }

   public int getCount() {
       return count;
   }

   public void setCount(int count) {
       this.count = count;
   }

    public static FoodOrder getOrder(String item, int count){
       return new FoodOrder(item, count);
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