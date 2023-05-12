package workingWithGenerics.boundingGenericTypes.lowerBoundedWildcards;
import java.util.*;


/**
 * Rule Left Generic Type must match to right
 */
public class ContextListObjectThatWorkWithGeneric {
    static void addSound(List<Object> list){
        list.add("quack");
    }

    public static void main(String... args){
        List<Object> strings = new ArrayList<>();
        addSound(strings);
        System.out.println(strings);
    }
}