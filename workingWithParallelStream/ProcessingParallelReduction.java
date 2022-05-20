package  workingWithParallelStream;
import java.util.*;
import java.util.stream.*;

public class ProcessingParallelReduction{
   static void performingOrderBasedTasksOnSerialStream(){
       System.out.print(
           List.of(1, 2, 3, 4, 5, 6)
               .stream()
              .findAny()
              .get() 
       );
   }

  static void performingOrderBasedTasksOnParallelStream(){
       System.out.print(
           List.of(1, 2, 3, 4, 5, 6)
               .parallelStream()
              .findAny()
              .get()
       );
   }

  static void creatingUnorderedStreamsOnSerialStream(){
                        
           List.of(1, 2, 3, 4, 5, 6)
               .stream()
               .unordered()
           ;            
              
   }

  static void creatingUnorderedStreamsOnParallelStream(){
       
           List.of(1, 2, 3, 4, 5, 6)
               .stream()
               .unordered()
               .parallel()
           ;
      
   }

   public static void main(String[] args){
       System.out.println("Using findAny with serial Stream below ");
       performingOrderBasedTasksOnSerialStream();
       System.out.println();
       System.out.println("Using findAny with parallel Stream below ");
       performingOrderBasedTasksOnParallelStream();
    }
}
