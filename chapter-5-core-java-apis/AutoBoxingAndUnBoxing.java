import java.util.*;
public class AutoBoxingAndUnBoxing{

  public static void main(String[] args){
    List<Integer> weights = new ArrayList<>();
    Integer w = 50; // autoboxing
    weights.add(w);
    weights.add(Integer.valueOf(60)); // long way to write using wrapper class
    weights.remove(new Integer(50));
    double first = weights.get(0);
  }
}
