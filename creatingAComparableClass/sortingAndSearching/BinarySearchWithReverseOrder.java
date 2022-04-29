package creatingAComparableClass.sortingAndSearching;
import java.util.*;

public class BinarySearchWithReverseOrder{
  public static void main(String[] args){
     var names = Arrays.asList("Fluffy", "Hoppy");
     Comparator<String> c = Comparator.reverseOrder();
     var index = Collections.binarySearch(names, "Hoppy", c);
      System.out.println(index);
  }
}
