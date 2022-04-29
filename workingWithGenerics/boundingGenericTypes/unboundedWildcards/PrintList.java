package workingWithGenerics.boundingGenericTypes.unboundedWildcards;
import java.util.*;

public class PrintList{
   public static void printList(List<Object> list){
     for (Object x : list)
      System.out.println(x);
  }

  public static void main(String[] args){
      List<String> keywords = new ArrayList<>();
      keywords.add("java");
     printList(keywords); // does not compile
  }

}
