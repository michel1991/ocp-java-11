package  workingWithParallelStream.processingParallelReduction;
import java.util.*;
import java.util.stream.*;

/**
 * unordered:
   Cette méthode ne réorganise pas réellement les éléments ;
   il indique simplement à la JVM que si une opération de flux basée sur l'ordre est appliquée,
   l'ordre peut être ignoré. Par exemple, appeler skip(5) sur un flux non ordonné (unordered stream)
   ignorera 5 éléments quelconques, pas les 5 premiers requis sur un flux ordonné (ordered stream).
   Pour les flux série, l'utilisation d'une version non ordonnée
   n'a aucun effet, mais sur les flux parallèles, les résultats peuvent grandement améliorer les performances.
 */
public class UnorderedTellJvmToIgnoreOperationBasedOnOrder {
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
    
    static int skipIgnoreAnyElement(Stream<Integer> stream){
        return  stream
                 .skip(5)
                 .limit(2)
                 .findFirst()
                 .get()   
       ;
    }
    
    public static void main(String[] args){
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
        Stream<Integer> serial =  List.of(numbers).stream().unordered();
        Stream<Integer> parallelStream =  List.of(numbers)
                    .stream()
                    .unordered()
                    .parallel();
        
        int resultSerial = skipIgnoreAnyElement(serial);
        int resultParallel = skipIgnoreAnyElement(parallelStream);

        System.out.println("result serial " + resultSerial);
        System.out.println("result parallel " + resultParallel);
    }
}