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

   public static void main(String[] args){
       performingOrderBasedTasksOnSerialStream();
    }
}
