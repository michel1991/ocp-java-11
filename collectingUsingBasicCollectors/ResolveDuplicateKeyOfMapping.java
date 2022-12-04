package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class ResolveDuplicateKeyOfMapping {
    /**
    * Nous voulons maintenant faire l'inverse et faire correspondre la longueur du nom de l'animal au nom lui-même.
    * Notre première tentative incorrecte est montrée ici
    * Qu'est-ce qui ne va pas? Deux des noms d'animaux ont la même longueur.
    * Nous n'avons pas dit à Java quoi faire. Le collectionneur (Collectors || Collecteur) doit-il choisir le premier qu'il rencontre ?
    * Le dernier qu'il rencontre ? concaténer les deux ? Puisque le collecteur (Collectors) n'a aucune idée de ce qu'il doit faire,
    * il « résout || solve » le problème en utilisant la troisieme methode.
    */
    static void createAnimalNameSepareByComma(){
        var ohMy = Stream.of("lions", "tiggers", "bears");
        Map<Integer, String> map = ohMy.collect(
                Collectors.toMap(
                        String::length,
                        k -> k,
                        (s1, s2) -> s1 + "," + s2
                )
        );
        System.out.println("Begin from stream to Map resolve duplicate key  without type" );
            System.out.println("\t create string  without specify which map " + map);
            System.out.println("\t " + map.getClass());
        System.out.println("End from stream to Map resolve duplicate key  without type" );
    }

    static void createAnimalNameSepareByCommaWithType(){
        var ohMy = Stream.of("lions", "tiggers", "bears", "fishs");
        Function<String, Integer> theKey = String::length;
        Function<String, String> theValue = key -> key;
        BinaryOperator<String> resolve = (valuesOfKeyThatAlreadyExist, newStringStreamValue) ->  {
           // System.out.println("previous = "+valuesOfKeyThatAlreadyExist + " new=  value " + newStringStreamValue);
            return valuesOfKeyThatAlreadyExist+ "," + newStringStreamValue;
        };
        Map<Integer, String> map = ohMy.collect(
                Collectors.toMap(
                        theKey,
                        theValue,
                        resolve
                )
        );
        System.out.println("Begin from stream to Map resolve duplicate key  with type on FI" );
        System.out.println("\t create string  without specify which map " + map);
        System.out.println("\t " + map.getClass());
        System.out.println("End from stream to Map resolve duplicate key  with type on FI" );
    }

    static void createAnimalNameSepareByCommaWithSpecifyTypeOfMap(){
        var ohMy = Stream.of("lions", "tiggers", "bears");
        Map<Integer, String> map = ohMy.collect(
                Collectors.toMap(
                        String::length,
                        k -> k,
                        (s1, s2) -> s1 + "," + s2,
                        TreeMap::new
                )
        );
        System.out.println("Begin from stream to Map resolve duplicate key  without type and specify the type of map" );
        System.out.println("\t create string  without specify which map " + map);
        System.out.println("\t " + map.getClass());
        System.out.println("End from stream to Map resolve duplicate key  without type and specify the type of map" );
    }

    static void createAnimalNameSepareByCommaWithTypeOnFIAndSpecifyTypeOfMap(){
        var ohMy = Stream.of("lions", "tiggers", "bears");
        Function<String, Integer> theKey =  String::length;
        Function<String, String> theValue =  k -> k;
        BinaryOperator<String> resolveDuplicateKeyByUsingEachValue =
                    (valuesOfKeyThatAlreadyExist, newStringStreamValue) -> valuesOfKeyThatAlreadyExist + "," + newStringStreamValue
        ;
        Supplier<TreeMap<Integer, String>> mapWeWant = TreeMap::new;
        Map<Integer, String> map = ohMy.collect(
                                    Collectors.toMap(
                                            theKey,
                                            k -> k,
                                            resolveDuplicateKeyByUsingEachValue,
                                            mapWeWant 
                                    )
        );
        System.out.println("Begin from stream to Map resolve duplicate key  with type on FI and specify the type of map" );
        System.out.println("\t create string  without specify which map " + map);
        System.out.println("\t " + map.getClass());
        System.out.println("End from stream to Map resolve duplicate key  with type on FI and specify the type of map" );
    }

    public static void main(String[] args){
        createAnimalNameSepareByComma();
        System.out.println();
        createAnimalNameSepareByCommaWithType();
        System.out.println();
        createAnimalNameSepareByCommaWithSpecifyTypeOfMap();
        System.out.println();
        createAnimalNameSepareByCommaWithTypeOnFIAndSpecifyTypeOfMap();
    }
}