package collectingUsingBasicCollectors;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class JoiningCollectors {
    static void joiningDataIntoStream(){
        var ohMy = Stream.of("lions", "tiggers", "bears");

        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println( "joining string: " + result); // lions tiggers, beears
    }

    public static void main(String... args){
        joiningDataIntoStream();
    }
}