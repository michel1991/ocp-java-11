package workingWithParallelStream.performingAParallelDecomposition;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.*;

public class UseCaseWithSerialStream {
    private static int doWork(int input){
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){

        }
        return input;
    }
    
    public static void main(String[] args)
   {
       long start = System.currentTimeMillis();
       List.of(1, 2, 3, 4, 5)
         .stream()
         .map( w -> doWork(w) )
         .forEach( s -> System.out.print( s + " ") )

      ;
       System.out.println();
       var timeTaken = ( System.currentTimeMillis() - start ) / 1000;
       System.out.println("Time: " + timeTaken + " seconds");
   }
}