package stream.matchMethods;
import java.util.*;
import java.util.function.*;
public class MatchMethod {
    // aucun ne correspond au predicat
    public static void noneMatchToPredicat(){
        var s = Stream.of( "mm",  "mm",  "mm",  "");
        var match = s
                 .peek(System.out::println)
                 .noneMatch(String::isEmpty);
        System.out.println(match);
    }

    public static void main(String... args){
        noneMatchWithEmpty();
    }
}