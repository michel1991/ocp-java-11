package workingWithParallelStream.combiningResultsWithCollect;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.*;

/**
 * De plus, comme pour reduce(), les opérations de l'accumulateur et du combinateur
 * [accumulator and combiner operations] doivent pouvoir traiter les résultats dans n'importe quel ordre.
 * De cette manière, la version à trois arguments de collect() peut être exécutée comme une réduction parallèle
 *
 * Rappelons que les éléments d'un ConcurrentSkipListSet sont triés en fonction de leur ordre naturel.
 * Vous devez utiliser une collection concurrente pour combiner les résultats,
 * en veillant à ce que les résultats des threads concurrents ne provoquent pas une ConcurrentModificationException
 *
 * L'exécution de réductions parallèles avec un collecteur nécessite des considérations supplémentaires.
 * Par exemple, si la collection dans laquelle vous insérez est un set de données ordonné, tel qu'une liste,
 * les éléments de la collection résultante doivent être dans le même ordre, que vous utilisiez un flux série ou parallèle.
 * Cela peut toutefois réduire les performances, car certaines opérations ne peuvent pas être effectuées en parallèle.

 */
public class ReduceListOfCharactersWithSkipList {
  public static void main(String[] args){
    Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
    SortedSet<String> set = stream.collect(
            ConcurrentSkipListSet::new,
            Set::add,
            Set::addAll
    );
    System.out.println(set);
  }
}