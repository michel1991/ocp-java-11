package creatingAComparableClass.sortingAndSearching;
import creatingAComparableClass.comparingDataWithAComparator.Duck;
import java.util.*;

public class FixUseTreeSet{
   static class Rabbit{
      int id;
   }

  

    public static void main(String[] args){
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles", 6));
        Set<Rabbit> rabbits = new TreeSet<>((r1, r2) -> r1.id - r2.id);
        rabbits.add(new Rabbit()); 
  
    }
}
