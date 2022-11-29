package puttingTogetherThePipeline ;
import java.util.stream.*;

/**
* N'oubliez pas que les méthodes s'exécutent sur chaque élément un par un jusqu'à ce que le traitement soit terminé.
* En fonction de chque operation intermediate un element peut ou non passer à l'autre operation intermediate.
* L'ordre des operations intermediate peut influer sur le resultat
 */
class PeekBehindTheScenes{

    /**
     * Les cinq premiers passent (1 --> 5)
     */
   static void oddNumber(){
      var infinite = Stream.iterate(1, x -> x + 1);
      infinite.limit(5)
              .filter(x -> x % 2 == 1)
              .forEach(System.out::print)
      ;

   }

    /**
    * Les cinq premiers passent (1 --> 5)
    */
   static void oddNumberWithPeek(){
      var infinite = Stream.iterate(1, x -> x + 1);
      infinite.limit(5)
              .peek(System.out::print)
              .filter(x -> x % 2 == 1)
              .forEach(System.out::print)
      ;

   }


    /**
    * On filtre d'abord puis on compte
    */
   static void oddNumberReverseOrderTheIntermediateOperation(){
      var infinite = Stream.iterate(1, x -> x + 1);
      infinite.filter(x -> x % 2 == 1)
              .limit(5)
              .forEach(System.out::print)
      ;

   }

    /**
    * On filtre d'abord puis on compte
    */
   static void oddNumberFilterBeforePeek(){
      var infinite = Stream.iterate(1, x -> x + 1);
      infinite.filter(x -> x % 2 == 1)
              .peek(System.out::print)
              .limit(5)
              .forEach(System.out::print)
      ;

   }


  public static void main(String[] args){
     System.out.println("odd number ");
      oddNumber();

       System.out.println();
       System.out.println("odd number with peek ");
       oddNumberWithPeek();

        System.out.println();
        System.out.println();
        System.out.println("odd number reverse the order of the intermediate operation change the result ");
        oddNumberReverseOrderTheIntermediateOperation();

       System.out.println();
       System.out.println("odd number filter before peek "); 
       oddNumberFilterBeforePeek();
   }

}
