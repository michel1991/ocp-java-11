package creatingAComparableClass.sortingAndSearching;
import java.util.*;

public class SortRabbits{
   static class Rabbit{
      int id ;
   }

    public static void main(String[] args){
         List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());
        Collections.sort(rabbits); // does not compile
    }
}
