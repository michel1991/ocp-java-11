package creatingAComparableClass.comparingMultipleFields;
import java.util.function.*;
import java.util.*;

class MultipleComparisonWithReferenceMethod{
   static Comparator<Squirrel> comparingWithMethodRef(){
      return Comparator.comparing( Squirrel::getSpecies ).thenComparing(   Squirrel::getWeight );
   }

     static Comparator<Squirrel> comparingWithSpecyInverseOrder(){
      return Comparator.comparing( Squirrel::getSpecies ).reversed();
   }

   static List<Squirrel> getListOfSquirrel(){
      List<Squirrel> animals = new ArrayList<>();
     animals.add(new Squirrel(2, "bears"));
     animals.add(new Squirrel(3, "bears"));
     animals.add(new Squirrel(7, "bears"));
     animals.add(new Squirrel(5, "bears"));
     animals.add(new Squirrel(8, "dag"));
     animals.add(new Squirrel(10, "av"));
     animals.add(new Squirrel(1, "cat"));

     return animals;
   }

  static Comparator<Squirrel> comparatorWithLambda(){
      Function<Squirrel, String> getSpecyKey = squirrel -> squirrel.getSpecies();
      Function<Squirrel, Integer> getWeightKey = squirrel -> squirrel.getWeight();

      return Comparator.comparing(getSpecyKey).thenComparing( getWeightKey );
  }

   public static void main(String... args){
    System.out.println( " comparison original list  ");
    System.out.println(  getListOfSquirrel() );
    System.out.println();

     List<Squirrel> animals = getListOfSquirrel();

      var firstComparator = comparingWithMethodRef();
     Collections.sort( animals, firstComparator );

     System.out.println( " comparison with ref method below ");
     System.out.println( animals );
     System.out.println();

      System.out.println( " comparison with lambda method below ");
      List<Squirrel> animalsLambda = getListOfSquirrel();
      Collections.sort( animalsLambda,  comparatorWithLambda() );
      System.out.println( animalsLambda );
      System.out.println();

     System.out.println( " comparison using ref method, by inversed order of specy  ");
      List<Squirrel> animalsReversedOrderSpecy = getListOfSquirrel();
      Collections.sort( animalsReversedOrderSpecy,  comparingWithSpecyInverseOrder() );
     System.out.println( animalsReversedOrderSpecy   );
     System.out.println();


   }
}
