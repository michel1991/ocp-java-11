
package workingWithGenerics.boundingGenericTypes.lowerBoundedWildcards;
import java.util.*;

/**
 * Rule Left Generic Type must match to right
 */
public class ContextListStringThatWorkWithGeneric {
    static void addSound(List<String> list){
        list.add("quack");
    }

    public static void main(String... args){
        List<String> strings = new ArrayList<>();
        addSound(strings);
        System.out.println(strings);
    }
}