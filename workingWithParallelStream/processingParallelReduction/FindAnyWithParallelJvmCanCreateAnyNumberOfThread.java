package  workingWithParallelStream.processingParallelReduction;
import java.util.*;
import java.util.stream.*;

/**
 Avec un flux parallèle, la JVM peut créer n'importe quel nombre de threads pour traiter le flux.
  Lorsque vous appelez findAny() sur un flux parallèle,
  la JVM sélectionne le premier thread pour terminer la tâche et récupère ses données.
 */
public class FindAnyWithParallelJvmCanCreateAnyNumberOfThread {
    public static void main(String[] args){
        System.out.println("Using findAny with serial Stream below ");
        System.out.print(
                List.of(1, 2, 3, 4, 5, 6)
                   .parallelStream()
                  .findAny()
                  .get() 
        );
    }
}