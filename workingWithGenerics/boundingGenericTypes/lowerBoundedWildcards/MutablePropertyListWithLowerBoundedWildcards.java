package workingWithGenerics.boundingGenericTypes.lowerBoundedWildcards;
import java.util.*;

class MutablePropertyListWithLowerBoundedWildcards{
  
    static void addSound(List<? super CharSequence> list){
       //list.add("quack");
    }	

 public static void main(String... args){
    List<CharSequence> strings = new ArrayList<CharSequence>();
    strings.add("tweets");
    List<Object> objects = new  ArrayList<Object>(strings);
    addSound(strings);
    addSound(objects);
    addSound(new StringBuilder());
    System.out.println(" list of object " + objects);
    System.out.println(" list of string " + strings);
 }	
}
