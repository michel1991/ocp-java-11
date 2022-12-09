package usingCommonIntermediateOperations;
import java.util.stream.*;

class LimitAndSkip{
  
   static void basicExample(){
       Stream<Integer> s = Stream.iterate(1, n -> n + 1);
       s.skip(5)
       .limit(2)
       .forEach(System.out::print); // 67
   }

    static void limitWithFilterFininiteStreamEmpty(){
       Stream<Integer> stream = Stream.empty();
       stream
           .peek((value) -> System.out.println(" limit With Filter Fininite Stream  after empty"))
           .filter( value -> value >= 10 )
           .peek((value) -> System.out.println(" limit With Filter Fininite Stream  after filter"))
           .limit(5)
           .forEach(System.out::print);
        ;
   }

  public static void main(String[] args){
      basicExample();
      limitWithFilterFininiteStreamEmpty();
  }

}
