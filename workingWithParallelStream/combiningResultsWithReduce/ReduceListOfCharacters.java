package  workingWithParallelStream.combiningResultsWithReduce;
import java.util.*;
import java.util.stream.*;

/**
 * Sur les flux parallèles, la méthode reduce() fonctionne en appliquant
 * la réduction à des paires d'éléments dans le flux pour
 * créer des valeurs intermédiaires (intermediate values),
 * puis en combinant ces valeurs intermédiaires pour produire un résultat final
 */
public class ReduceListOfCharacters {
    public static void main(String[] args){
        System.out.println(
                List.of('w', 'o', 'l', 'f')
              .parallelStream()
              .reduce(
                      "",
                      (s1, c) -> s1 + c,
                      (s2, s3) -> s2 + s3
                )
        );
    }
}