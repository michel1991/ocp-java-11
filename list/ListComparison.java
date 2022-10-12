package list;
import java.util.*;

class ListComparison{
   public static void ascendingUpperCaseFirst(){
      List<String> cats = new ArrayList<>();
      cats.add("leo");
      cats.add("Olivia");

      cats.sort((c1, c2) -> -c2.compareTo(c1)); // line X
      System.out.println(cats);

      // This code has a double negative. The code c2.compareTo(c1) sorts in descending order. However, the negative sign before it switches to ascending order. Since uppercase sorts before lowercase, option B is correct.
   }

   public static void main(String... args){
     ascendingUpperCaseFirst();
   }
}
