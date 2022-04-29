package workingWithGenerics.boundingGenericTypes.upperBoundedWildcards;
import java.util.*;

public class Total{
   public static long total(List<? extends Number> list){
     long count = 0;
     for(Number number : list)
        count +=number.longValue();
    return count;
   }

  public static void main(String[] args){
    List<Integer> myList = new ArrayList<>();

    myList.add(4);
    myList.add(5);

    var result = total(myList);
    System.out.println(result);
  }
}
