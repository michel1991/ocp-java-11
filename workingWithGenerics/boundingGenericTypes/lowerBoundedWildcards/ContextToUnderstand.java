package workingWithGenerics.boundingGenericTypes.lowerBoundedWildcards;
import java.util.*;

public class ContextToUnderstand {
    static void addSound(List<Object> list){
        list.add("quack");
    }
    
    public static void main(String... args){
        List<String> strings = new ArrayList<>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<>(strings);
        addSound(strings);
        addSound(objects);
    }
}