package workingWithAdvancedStreamPipelineConcepts;
import java.util.*;

class MapChainingOptionalWitCustomLogic {
	static Optional<Integer> calculator(String value){
           return Optional.of( value.length() );
	}

	public static void main(String... args){
	   String name = "jobs";
          System.out.print("Using flat map with custom logic that return optional, the purpose is to count the number of length of the string  " +name + " "); 
	  Optional<String> stringOptional = Optional.of(name);
	   stringOptional
		   .map(FlatMapChainingOptionalWitCustomLogic::calculator)
		   .ifPresent(System.out::print)
	    ;

	}

}
