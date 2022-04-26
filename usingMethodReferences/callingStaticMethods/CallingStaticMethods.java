package usingMethodReferences.callingStaticMethods;
import java.util.*;
import java.util.function.Consumer;

public class CallingStaticMethods{
  public static void main(String[] args){
    Consumer<List<Integer>> methodRef = Collections::sort;
    Consumer<List<Integer>> lambda = x -> Collections.sort(x); 
  }
}
