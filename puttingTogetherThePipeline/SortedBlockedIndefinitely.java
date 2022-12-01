package puttingTogetherThePipeline;
import java.util.stream.*;
import java.util.*;

class SortedBlockedIndefinitely{

    /**
     * So sorted wait indefinitely all elemnt before java orchestractor ask to do his job
     */
    static void sortedWaitSoLong(){

     Stream<String> list = Stream.generate( () -> "Elsa" );
     list
         .filter( n -> n.length() == 4)
         .sorted()
         .limit(2)
         .forEach(System.out::println)
         ;
    }

    /**
    * So sorted wait indefinitely all elemnt before java orchestractor ask to do his job
    */
    static void filterWaitSoLong(){

     Stream<String> list = Stream.generate( () -> "Olaf Lazisson" );
     list
         .filter( n -> n.length() == 4)
         .sorted()
         .limit(2)
         .forEach(System.out::println)
         ;
    }

  public static void main(String... args){
     System.out.println("Do not start this program it will consume all your memory ");

  }
}
