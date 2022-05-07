package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;

class DuplicateKeyMap{
   static void duplicateKey(){
      var ohMy = Stream.of("lions", "tiggers", "bears");
      Map<Integer, String> map = ohMy.collect( Collectors.toMap(String::length, k -> k) );
      System.out.println("duplicate key " + map); 
   }

   public static void main(String[] args){
      duplicateKey();

   }

}
