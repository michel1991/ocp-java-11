package usingCommonTerminalOperations;
import java.util.stream.*;
import java.util.TreeSet;
import java.util.Set;

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


 static void usingJavaCollectorSorted(){
    Stream<String> stream = Stream.of("w", "o", "l", "f");
    TreeSet<String> set =  stream.collect(Collectors.toCollection(TreeSet::new));
    System.out.println("Java collector with sort set: " + set);
 }

 static void usingJavaCollectorUnSortedShortVersion(){ 
    Stream<String> stream = Stream.of("w", "o", "l", "f");
    Set<String> set =  stream.collect(Collectors.toSet());
    System.out.println("Java collector with unsort set: " + set);
 }

  public static void main(String[] args){
         
     basicExample();
     differentLogicBetweenAccumulatorAndCombiner();
     usingJavaCollectorSorted();
     usingJavaCollectorUnSortedShortVersion();

  }

}
