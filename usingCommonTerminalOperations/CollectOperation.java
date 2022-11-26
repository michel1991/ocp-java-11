package usingCommonTerminalOperations;
import java.util.stream.*;
import java.util.function.*;
import java.util.TreeSet;
import java.util.*;

/**
*  If no intermediate accumulator the combine lambda is not call
*/
public class CollectOperation{

  static void basicExample(){
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println("basic example " + word);
  }
  static void basicExampleWithType(){
      Stream<String> stream = Stream.of("w", "o", "l", "f");
      BiConsumer<StringBuilder, String> accumulator = (mutableAccumulator, currentValue) -> {
          mutableAccumulator.append(currentValue);
      };
      BiConsumer<StringBuilder, StringBuilder> combiner = (identityMutableCombiner, intermediateAccumulator) -> {
          System.out.println(" basicExampleWithType identity mutable combiner" + identityMutableCombiner);
          System.out.println(" basicExampleWithType intermediate accumulator" + intermediateAccumulator);
      };
      Supplier<StringBuilder> mutableIdentity = StringBuilder::new;
      StringBuilder word = stream.collect(mutableIdentity, accumulator, combiner);

      System.out.println("basic example (specified type ) " + word);
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

    static void differentLogicBetweenAccumulatorAndCombinerType()
    {
      Stream<String> stream = Stream.of("w", "o", "l", "f");
      BiConsumer<TreeSet<String>, String> accumulator = (mutableAccumulator, currentValue) ->{
          mutableAccumulator.add(currentValue);
      };
      BiConsumer<TreeSet<String>, TreeSet<String>> combiner = (identityMutableCombiner, intermediateAccumulator) ->{
          System.out.println("differentLogicBetweenAccumulatorAndCombinerType: combiner identity " + identityMutableCombiner);
          System.out.println("differentLogicBetweenAccumulatorAndCombinerType: combiner current value "+ intermediateAccumulator);
          identityMutableCombiner.addAll(intermediateAccumulator);
      };
      Supplier<TreeSet<String>> mutableIdentity = TreeSet::new;
      TreeSet<String> set = stream.collect(
              mutableIdentity,
              accumulator,
              combiner
      );
      System.out.println("differnt logic between accumulator and combiner(specified type ) " + set);
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
     Set<String> first = new HashSet<>();
     first.add("w");
     first.add("o");
     
     Set<String> second = new HashSet<>();
     second.add("l");
     second.add("f");

     first.addAll(second);
     System.out.println(first);

     basicExample();
     basicExampleWithType();
     differentLogicBetweenAccumulatorAndCombiner();
      differentLogicBetweenAccumulatorAndCombinerType();
     usingJavaCollectorSorted();
     usingJavaCollectorUnSortedShortVersion();

  }

}
