package puttingTogetherThePipeline;
import java.util.stream.*;
import java.util.*;

class BlockedStream{
   
    static void sortedWaitSoLong(){
      
     Stream<String> list = Stream.generate( () -> "Elsa" );
     list
         .filter( n -> n.length() == 4)
         .sorted()
         .limit(2)
         .forEach(System.out::println)
    ;
    }
  public static void main(String... args){

  }
}
