package workingWithGenerics.boundingGenericTypes.unboundedWildcards;
import java.util.*;

class ImmutablePropertyOfListUsingUnboundedWildcards{
    static void showElement(List<?> elements){
          elements.add("bro");
    }  
   public static void main(String... args){
      List<?> list = new ArrayList<String>();
      list.add("jobs");
      List<String> myList = new ArrayList<>();
      showElement(myList);
   }
}
