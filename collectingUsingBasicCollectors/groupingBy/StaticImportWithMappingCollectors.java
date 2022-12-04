package collectingUsingBasicCollectors.groupingBy;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.minBy;
public class StaticImportWithMappingCollectors {

    /**
    * Enfin, il existe un collecteur mapping() qui nous permet de descendre d'un niveau et d'ajouter un autre collecteur.
    * Supposons que nous voulions obtenir la première lettre du premier animal par ordre alphabétique de chaque longueur.
    * Pourquoi ? Peut-être pour un échantillonnage aléatoire. Les exemples de cette partie de l'examen sont également assez artificiels.
    * Nous écririons ce qui suit :
     */
    static void firstLetterOfFirstAnimalGroupByLengthWithStaticImport(){
        var ohMy = Stream.of("lions", "tigers", "bears", "fishs");
        Map<Integer, Optional<Character>> map = ohMy.collect(
                groupingBy(
                        String::length,
                        mapping(
                                s -> s.charAt(0),
                                minBy( (a, b) -> a-b  )
                        )

                )

        );
        System.out.println("Begin from stream to Map by specify mapping downstream collectors that hold value with lambda" );
        System.out.println("\t " + map);
            System.out.println("\t class is " + map.getClass());
         System.out.println("End from stream to Map by specify mapping downstream collectors that hold value with lambda" );
    }

    static void firstLetterOfFirstAnimalGroupByLengthWithType(){
        var ohMy = Stream.of("lions", "tigers", "bears", "fishs", "fishs");
        Function<String, Integer> keyMappingToNumberFirstLevel = String::length;
        Function<String, Character> mappingEachValueOfList = (currentValueOfList) -> currentValueOfList.charAt(0);
        //Comparator<Character> comparator = (a, b) -> a.compareTo​(b);
        Comparator<Character> comparatorListValueByAsc = Character::compare​;

        Map<Integer, Optional<Character>> map = ohMy.collect(
                groupingBy(
                        keyMappingToNumberFirstLevel,
                        mapping(
                                mappingEachValueOfList,
                                minBy( comparatorListValueByAsc )
                        )

                )

        );
        System.out.println("Begin from stream to Map by specify mapping downstream collectors that hold value with type on FI" );
        System.out.println("\t " + map);
        System.out.println("\t class is " + map.getClass());
        System.out.println("End from stream to Map by specify mapping downstream collectors that hold value with type on FI" );
    }

    public static void main(String[] args){
        firstLetterOfFirstAnimalGroupByLengthWithStaticImport();
        System.out.println();
        firstLetterOfFirstAnimalGroupByLengthWithType();
    }
}