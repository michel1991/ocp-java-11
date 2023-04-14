package  workingWithParallelStream.processingParallelReduction;
import java.util.*;
import java.util.stream.*;

public class SpecialMethodWithSameResult {
   static Integer applySameResult(Stream<Integer> stream){
       return  stream
                 .skip(5)
                 .limit(2)
                 .findFirst()
                 .get()   
       ;
   }
    
    public static void main(String[] args){
       System.out.println("Using findAny with serial Stream below ");
       Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
       Stream<Integer> serial =  List.of(numbers).stream();
       Stream<Integer> parallelStream =  List.of(numbers).stream();
       int resultSerial = applySameResult(serial);
       int resultParallel = applySameResult(parallelStream);
       
       System.out.println("result serial " + resultSerial);
       System.out.println("result parallel " + resultParallel);
   }
}