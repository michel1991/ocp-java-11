package usingCommonTerminalOperations;
import java.util.stream.*;
import java.util.TreeSet;

public class CollectOperation{

  static void basicExample(){
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println("basic example " + word);
  }
  
  static void differentLogicBetweenAccumulatorAndCombiner(){
     Stream<String> stream = Stream.of("w", "o", "l", "f");
     TreeSet<String> set = stream.collect(
         TreeSet::new,
         TreeSet::add,
         TreeSet::addAll
    ); 

     System.out.println("differnt logic between accumulator and combiner " + set);
  }

  public static void main(String[] args){
         
     basicExample();
     differentLogicBetweenAccumulatorAndCombiner();

  }

}
