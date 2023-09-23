package stream.errors;
 import java.util.stream.*;
 import jaba.util.*;

 /**
 * What is the minimum number of lines you can remove so that code compiles and the pipeline executes?
     A. Zero
     B. One
     C. Two
     D. Three
     E. Four
     F. Five

   Since there are two stream() calls in this code,
   it is attempting to create two stream pipelines.
   One spans lines 9–12, and the other spans lines 16–19.
   Lines 14 and 15 need to be removed because
   you cannot call stream methods outside of a pipeline.
   
   Line 17 needs to be removed because it is a terminal operation
   and the following line is an intermediate operation.
   
   This makes three lines to remove, making option D correct.
   Removing lines 18–19 instead of 17 would work,
   but that would be more lines to remove and the question asks about the minimum.
  */
 class ManyStreamInOneDeclaration{
    static void makePartition(){
        var letters = Arrays.asList('a', 'b', 'c'); // 8:
        letters.stream()   // 9
               .sorted()   // 10
               .distinct()  // 11
               .collect(Collectors.partitioningBy(c -> c != 'a' )) // 12
               .values() // 13
               .distinct() // 14
               .count()  // 15
               .stream() // 16
               .count()  // 17
               .sorted()  // 18
              .count(); // 19
    }


 public static void amin(String... args){
     makePartition();
  }

 }
