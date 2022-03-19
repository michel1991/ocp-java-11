import java.util.*;
public class ConvertArrayToListWithListLinkedToTheOriginalArray{
 public static void main(String[] args){
    String[] array = {"hawk", "robin"};
   List <String> list = Arrays.asList(array); // return fixed size list
   System.out.println(list.size());
   list.set(1, "test");
   array[0] = "new";
   System.out.print(Arrays.toString(array));
   list.remove(1);
  
  }
 
}
