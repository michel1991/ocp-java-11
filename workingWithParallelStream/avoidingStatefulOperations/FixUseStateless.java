package workingWithParallelStream.avoidingStatefulOperations;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

public class FixUseStateless {
    /**
       Nous pouvons corriger cette solution en réécrivant notre opération
       de flux pour ne plus avoir d'expression lambda à
       état (to no longer have a stateful lambda expression).
       
       Cette méthode traite le flux et collecte ensuite tous les résultats dans une nouvelle liste.
       Elle produit le même résultat sur les flux sériels et parallèles.
       
       Cette implémentation supprime l'opération avec état (stateful operation)
       et s'appuie sur le collecteur (collector )
       pour assembler les éléments. Nous pourrions également
       utiliser un collecteur (collector ) concurrent pour paralléliser
       la construction de la liste. L'objectif est d'écrire notre code pour
       permettre un traitement parallèle et laisser la JVM s'occuper du reste.



     */
    public static List<Integer> addValues(IntStream source){
        return  source.filter( s -> s % 2 == 0)
              .boxed()
              .collect( Collectors.toList())
        ;

    }
    
    static void executeWithSerialStream(){
        var list  = addValues(IntStream.range(1, 11));
        System.out.println(list);
    }
   
    static void executeWithParallelStream(){
        var list  = addValues(
                IntStream.range(1, 11).parallel()
        );
        System.out.println(list);
    }
    
    public static void main(String[] args){
        System.out.println("execute with serial stream");
        executeWithSerialStream();
        System.out.println();

        System.out.println("execute with parallel stream");
        executeWithParallelStream();
        System.out.println();
    }
}