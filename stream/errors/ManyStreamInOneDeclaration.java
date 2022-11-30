package stream.errors;
 import java.util.stream.*;
 import jaba.util.*;

 class ManyStreamInOneDeclaration{
    static void makePartition(){
        var letters = Arrays.asList('a', 'b', 'c');
	letters.stream()
               .sorted()
               .distinct()
               .collect(Collectors.partitioningBy(c -> c != 'a' ))
               .values()
               .distinct()
               .count()
               .stream()
               .count()
               .sorted()
              .count();
    }


 public static void amin(String... args){
     makePartition();
  }

 }
