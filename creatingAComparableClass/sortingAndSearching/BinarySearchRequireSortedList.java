package creatingAComparableClass.sortingAndSearching;
import java.util.*;

public class BinarySearchRequireSortedList{
  public static void main(String[] args){
     List<Integer> list = Arrays.asList(6, 9, 1, 8);
    Collections.sort(list);
      System.out.println(Collections.binarySearch(list, 6)); // 1
     System.out.println(Collections.binarySearch(list, 3)); // -2
  }
}
