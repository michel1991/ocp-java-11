package stream.reduce;

import java.util.stream.*;
import java.util.*;

/**
 * What is the output of the following application?
    A. CatHat CatHat
    B. aCataHat HatCat
    C. The code does not compile because the stream in concat1() returns an Optional.
    D. The code does not compile for a different reason.
    E. An exception is printed at runtime.
    F. None of the above.
    
    The code compiles and runs without issue.
    The three-argument reduce() method returns a generic type,
    while the one-argument reduce() method returns an Optional.
    The concat1() method is passed an identity "a", which it applies to each element,
    resulting in the reduction to aCataHat.
    The lambda expression in the concat2() method reverses the order of its inputs,
    leading to a value of HatCat. For these reasons, option B is the correct answer.
 */
 class Concat {
    public String concat1(List<String> values) {
        return values.parallelStream()
            .reduce("a",
                    (x,y) -> x+y,
                           String::concat);
    }
    public String concat2(List<String> values) {
        return values.parallelStream()
            .reduce((w,z) -> z+w).get();
    }
    public static void main(String... questions) {
        Concat c = new Concat();
        var list = List.of("Cat","Hat");
        String x = c.concat1(list);
        String y = c.concat2(list);
        System.out.print(x+" "+y);
    } }

public class ConcatWithParallel {
    public static void main(String... args){
        Concat.main(args);
    }
}