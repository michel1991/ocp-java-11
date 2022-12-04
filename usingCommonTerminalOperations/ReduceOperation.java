package usingCommonTerminalOperations;
import java.util.stream.*;
import java.util.function.*;

/**
* Pourquoi y a-t-il deux méthodes similaires ?
* Pourquoi ne pas simplement exiger toujours l'identité ? Java aurait pu le faire.
* Cependant, il est parfois agréable de différencier le cas où le flux est vide du cas où une valeur correspond à l'identité renvoyée par le calcul.
* La signature renvoyant un Optional nous permet de différencier ces cas.
* Par exemple, nous pourrions retourner Optional.empty() lorsque le flux est vide et Optional.of(3) lorsqu'il y a une valeur.
 */
public class ReduceOperation{
   static void withLambda(){ 
    Stream<String> stream = Stream.of("w", "o", "l", "f");
    String word = stream
                        .reduce(
                                "",
                                (s,c) -> s + c
                        );
    System.out.println("result reduce with lambda " + word);
  }

    static void withReferenceMethod(){
    Stream<String> stream = Stream.of("w", "o", "l", "f");
    String word = stream
                        .reduce(
                                "",
                                String::concat
                        );
    System.out.println("result reduce with reference method " + word);
  }

   static void multiply(){
     Stream<Integer> stream = Stream.of(3, 5, 6);
      int result =  stream
                          .reduce(
                                   1,
                                   (a, b) -> a * b
                          );
      System.out.println("multiply:  "+ result ); 
   }

   /**
   *  1: if the stream is empty, an empty Optional is returned.
   *  2: If the stream has one element, it is returned.
   *  3: If the stream has multiple elements, the accumulator is applied to combine them
    */
   static void omitIdentity(){
     BinaryOperator<Integer> accumulator = (a, b) -> a * b;
     Stream<Integer> empty = Stream.empty();
     Stream<Integer> oneElement = Stream.of(3);
     Stream<Integer> threeElements = Stream.of(3, 5, 6);

     empty
           .reduce(accumulator)
           .ifPresent(System.out::println); // no output


     oneElement
               .reduce(accumulator)
               .ifPresent(System.out::println); // 3

     threeElements
                   .reduce(accumulator)
                   .ifPresent(System.out::println); // 90
   }

    /**
    * La troisième signature de méthode est utilisée lorsque nous traitons avec différents types.
    * Il permet à Java de créer des réductions intermédiaires(intermediate reductions) puis de les combiner à la fin.
    * Examinons un exemple qui compte le nombre de caractères dans chaque chaîne(String) :
    * Le premier paramètre ( 0) est la valeur de l'initialisateur. Si nous avions un flux vide, ce serait la réponse
    *  Contrairement aux accumulateurs que vous avez vus précédemment, celui-ci gère les types de données mixtes.
    * L'opération reduce() à trois arguments est utile lorsqu'on travaille avec des flux parallèles car elle permet de décomposer et de réassembler le flux par des threads séparés.
    * Par exemple, si nous avions besoin de compter la longueur de quatre chaînes de 100 caractères, les deux premières valeurs et les deux dernières pourraient être calculées indépendamment.
    * Le résultat intermédiaire (200 + 200) serait ensuite combiné pour obtenir la valeur finale.
     */
  static void withThirdParameter(){
      Stream<String> stream = Stream.of("w", "o", "l", "f!");
      int length =  stream
                         .reduce(
                                    0,
                                    (i, s) -> i + s.length(),
                                    (a, b) -> a + b
                                );
      System.out.println("with third parameter " + length); // 5
   }
    static void withThirdParameterUsingTypeDefinitions(){
       Stream<String> stream = Stream.of("w", "o", "l", "f!");
       BiFunction<Integer, String, Integer>  accumulator = (previousValue, s) -> previousValue + s.length();
       BinaryOperator<Integer> combiner = (a, b) -> a + b;
       int theIdentity = 0;
       int length =  stream.reduce(
                        theIdentity,
                        accumulator,
                        combiner
       );
       System.out.println("with third parameter  using Type definition " + length); // 5
   }

  public static void main(String[] args){
        withLambda();
        System.out.println();
        withReferenceMethod();
        System.out.println();
        multiply();
        System.out.println();
        omitIdentity();
        System.out.println();
        withThirdParameter();
        System.out.println();
        withThirdParameterUsingTypeDefinitions();
  }

}
