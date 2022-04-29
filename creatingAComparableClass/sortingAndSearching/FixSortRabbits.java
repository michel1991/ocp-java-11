package creatingAComparableClass.sortingAndSearching;
import java.util.*;

public class FixSortRabbits{
   static class Rabbit{
      int id ;
   }

    public static void main(String[] args){
         List<Rabbit> rabbits = new ArrayList<>();

         Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
        rabbits.add(new Rabbit());
        Collections.sort(rabbits, c);
    }
}
