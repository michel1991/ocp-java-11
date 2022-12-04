package collectingUsingBasicCollectors.runtime;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

class DuplicateKeyMap{
    /**
    * Nous voulons maintenant faire l'inverse et faire correspondre la longueur du nom de l'animal au nom lui-même.
    * Notre première tentative incorrecte est montrée ici
    * Qu'est-ce qui ne va pas? Deux des noms d'animaux ont la même longueur.
    * Nous n'avons pas dit à Java quoi faire. Le collectionneur (Collectors || Collecteur) doit-il choisir le premier qu'il rencontre ?
    * Le dernier qu'il rencontre ? concaténer les deux ? Puisque le collecteur (Collectors) n'a aucune idée de ce qu'il doit faire,
    * il « résout || solve » le problème en levant une exception et en en faisant notre problème.
     */
   static void duplicateKey(){
      var ohMy = Stream.of("lions", "tiggers", "bears");
      Map<Integer, String> map = ohMy
                   .collect(
                             Collectors.toMap(
                                     String::length,
                                     k -> k)
          );
      System.out.println("duplicate key " + map);
   }

    static void duplicateKeyWithType(){
        var ohMy = Stream.of("lions", "tiggers", "bears");
        Function<String, Integer> theKey =    String::length;
        Function<String, String> theValue =   k -> k;
        Map<Integer, String> map = ohMy
                                .collect(
                                        Collectors.toMap(
                                                theKey,
                                                theValue )
                                );
        System.out.println("duplicate key " + map);
    }

   public static void main(String[] args){
      duplicateKeyWithType();
      System.out.println();
      duplicateKey();

   }

}
