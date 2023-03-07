package nio.errors;
import java.nio.file.*;
import java.util.function.*;
import java.util.*;
import java.io.*;

/**
 *  How many lines does the following code output?
    A. One.
    B. Two.
    C. The code does not compile due to line x.
    D. The code does not compile due to line y.
    E. The code compiles but throws an exception at runtime.

   The filter() method takes a Predicate, which requires a boolean return type from the lambda or method reference.
   The getColor() method returns a String and is not compatible. This causes the code to not compile and option C to be the answer.

 */
class Blankie {
    String color;
    String getColor() {
        return color;
    }
}

class PreSchool {
    public static void main(String[] args) {
        var b1 = new Blankie();
        var b2 = new Blankie();
        b1.color = "pink";
        List<Blankie> list = Arrays.asList(b1, b2);
        list.stream()
         .filter(Blankie::getColor)       // line x
         .forEach(System.out::println);   // line y
    }
}

public class PreSchoolFilterRequiredPredicate {

}