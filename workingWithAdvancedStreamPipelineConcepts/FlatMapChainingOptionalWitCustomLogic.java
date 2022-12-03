package workingWithAdvancedStreamPipelineConcepts;
import java.util.*;
import java.util.function.*;

class FlatMapChainingOptionalWitCustomLogic {
	static Optional<Integer> calculator(String value){
           return Optional.of( value.length() );
	}

    static void printWithoutType(String name){
        Optional<String> stringOptional = Optional.of(name);
        stringOptional
                .flatMap(FlatMapChainingOptionalWitCustomLogic::calculator)
                .ifPresent(System.out::print)
        ;
    }

    static void printWithType(String name){
        System.out.println("Begin Flat map with Type ");
        Optional<String> stringOptional = Optional.of(name);
        Function<String, Optional<Integer>> customFlatMap = FlatMapChainingOptionalWitCustomLogic::calculator;
        stringOptional
                .flatMap(customFlatMap)
                .ifPresent(System.out::println)
            ;
        System.out.println("End Flat map with Type ");
    }

    static int calculatorWithMap(String value){
        return  value.length();
    }

    static void printWithoutFlatMap(String name){
        Optional<String> stringOptional = Optional.of(name);
        System.out.println("Begin Using custom map ");
        stringOptional
                .map(FlatMapChainingOptionalWitCustomLogic::calculatorWithMap)
                .ifPresent(System.out::println)
            ;
        System.out.println("End Using custom map ");
    }

	public static void main(String... args){
	   String name = "jobs";
          System.out.print("Using flat map with custom logic that return optional, the purpose is to count the number of length of the string  " +name + " ");
          printWithoutType(name);
          System.out.println();
          System.out.println();
          printWithType(name);
          System.out.println();
          printWithoutFlatMap(name);



	}

}
