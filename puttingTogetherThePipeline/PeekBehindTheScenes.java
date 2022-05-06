package puttingTogetherThePipeline ;
import java.util.stream.*;

class PeekBehindTheScenes{

   static void oddNumber(){
      var infinite = Stream.iterate(1, x -> x + 1);
      infinite.limit(5)
              .filter(x -> x % 2 == 1)
              .forEach(System.out::print)
      ;

   }


   static void oddNumberWithPeek(){
      var infinite = Stream.iterate(1, x -> x + 1);
      infinite.limit(5)
              .peek(System.out::print)
              .filter(x -> x % 2 == 1)
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
   }

}
