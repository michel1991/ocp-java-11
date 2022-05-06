package puttingTogetherThePipeline;
import java.util.*;
import java.util.stream.*;


class OtherExample{
 static void elsaTwice(){
     Stream.generate( () -> "Elsa")
           .filter( n -> n.length() == 4)
           .limit(2)
           .sorted()
           .forEach(System.out::println)
    ;
  }

  static void chainTwoPipeline(){
  long count  =  Stream.of("goldfish", "finch")          // first pipeline (source)
                       .filter( n -> n.length() >5 )     // first pipeline
                       .collect(Collectors.toList())     // first pipeline (terminal operation)
                       .stream()                         // second pipeline (source)
                       .count()                          // second pipeline (terminal operation)
    ;
    System.out.println("the result of count:  "+ count);
  }

  public static void main(String[] args){
     System.out.println("Print Elsa Twice ");
     elsaTwice();
     System.out.println();
      System.out.println("Chain two pipeline");
     chainTwoPipeline();
    System.out.println();
  }
}
