
package usingCommonIntermediateOperations;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

/**
* Ici, nous avons passé un comparateur pour spécifier que nous voulons trier dans l'ordre inverse du tri naturel.
* Vous êtes prêt pour un problème délicat ? Vous voyez pourquoi ça ne compile pas ?
*
   Examinez à nouveau les signatures de méthode. Le comparateur est une interface fonctionnelle.
   Cela signifie que nous pouvons utiliser des références de méthode ou des lambdas pour l'implémenter.
   L'interface Comparator implémente une méthode qui prend deux paramètres String et renvoie un int.
   Cependant, Comparator::reverseOrder ne le fait pas.
   Il s'agit d'une référence à une fonction qui prend zéro paramètre et renvoie un comparateur(Comparator).
   Ce n'est pas compatible avec l'interface.
   Cela signifie que nous devons utiliser une méthode et non une référence de méthode.
   Nous évoquons cela pour vous rappeler que vous devez vraiment bien connaître les références de méthode.

 */
public class SortedReverseOrderAsRefMethodIsError {
    static void basicExample(){
        System.out.println("Sorted without comparator using natural order,  values are: brown-, bear-");
        Stream<String> s = Stream.of("brown-", "bear-");

        // Comparator<String> x = Comparator::reverseOrder; 
        s.sorted(Comparator::reverseOrder)
        .forEach(System.out::print);
    }

    public static void main(String... args){

    }

}