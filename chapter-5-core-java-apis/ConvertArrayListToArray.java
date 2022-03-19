import java.util.*;
public class ConvertArrayListToArray{
   public static void main(String[] args){
    List <String> list = new ArrayList<>();
    list.add("hawk");
    list.add("robin");
    Object[] objectArray = list.toArray();
    String[] stringArray = list.toArray(new String[0]);
     list.clear();
    System.out.println(objectArray.length);
    System.out.println(stringArray.length);
    for(String myString : stringArray){
        System.out.println("the value is " + myString);
    }
  }

}
