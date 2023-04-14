package  workingWithParallelStream.combiningResultsWithReduce;
import java.util.*;
import java.util.stream.*;

/**
  Vous pouvez voir d'autres problèmes si nous utilisons
  un paramètre d'identité qui n'est pas vraiment une valeur d'identité.
  Dans le cadre du processus parallèle, l’identité( identity) est appliquée
  à plusieurs éléments du flux, ce qui donne des données très inattendues.

 */
public class UseInvalidValueOfIdentity {
    public static void main(String[] args){
        System.out.println(
                List.of("w", "o", "l", "f")
              .parallelStream()
              .reduce(
                      "X",
                      String::concat
                )
        );
    }
}