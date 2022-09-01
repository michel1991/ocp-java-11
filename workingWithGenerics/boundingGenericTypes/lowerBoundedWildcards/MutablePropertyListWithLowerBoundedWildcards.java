package workingWithGenerics.boundingGenericTypes.lowerBoundedWildcards;
import java.util.*;

class MutablePropertyListWithLowerBoundedWildcards{
  
    static void addSound(List<? super String> list){
       list.add("quack");
    }	

 public static void main(String... args){
    List<String> strings = new ArrayList<String>();
    strings.add("tweets");
    List<Object> objects = new  ArrayList<Object>(strings);
    addSound(strings);
    addSound(objects);
    System.out.println(" list of object " + objects);
    System.out.println(" list of string " + strings);
 }	
}
