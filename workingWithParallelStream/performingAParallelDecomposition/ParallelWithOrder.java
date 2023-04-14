package workingWithParallelStream.performingAParallelDecomposition;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.*;

class ParallelWithOrder{
    private static int doWork(int input){
         try{
             Thread.sleep(5000);
        }catch(InterruptedException e){
           
       }
       return input;
    }

  static void usingForEachOrderedOnParallelStream(){
     long start = System.currentTimeMillis();
     List.of(1, 2, 3, 4, 5)
         .parallelStream()
         .map( w -> doWork(w) )
         .forEachOrdered( s -> System.out.print( s + " ") )

      ;
     System.out.println();
     var timeTaken = ( System.currentTimeMillis() - start ) / 1000;
     System.out.println("Time: " + timeTaken + " seconds");
   }


   public static void main(String[] args)
   {
     System.out.println("using parallel stream with forEachOrdered who work like serial stream  below ");
      usingForEachOrderedOnParallelStream();
       System.out.println();
   }

}
