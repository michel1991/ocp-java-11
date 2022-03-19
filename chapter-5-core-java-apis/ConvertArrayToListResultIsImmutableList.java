import java.util.*;
public class ConvertArrayToListResultIsImmutableLis{
  public static void main(String[] args){
    String[] array = {"hawk", "robin"};
    List<String> list = List.of(array);
     System.out.println(list.size());
    array[0] = "new";
    System.out.println(Arrays.toString(array));
    System.out.println(list);
  }

}

