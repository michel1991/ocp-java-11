package  workingWithParallelStream.processingParallelReduction;
import java.util.*;
import java.util.stream.*;


/**
 * With Serial Stream Algorithm can take the first element
 */
public class FindAnySerialStreamCanTakeAlwaysFisrtElement {
    public static void main(String[] args){
        System.out.println("Using findAny with serial Stream below ");
        System.out.print(
                List.of(1, 2, 3, 4, 5, 6)
               .stream()
              .findAny()
              .get() 
        );
    }
}