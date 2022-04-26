package usingMethodReferences.callingConstructors;
import java.util.*;
import java.util.function.*;

public class CallingConstructorsWithFunction{
 public static void main(String[] args){
     Function<Integer, List<String>> methodRef = ArrayList::new;
     Function<Integer, List<String>> lambda = x -> new ArrayList(x);
  }
}
