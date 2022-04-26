package usingMethodReferences.callingConstructors;
import java.util.*;
import java.util.function.*;

public class CallingConstructors{
 public static void main(String[] args){
     Supplier<List<String>> methodRef = ArrayList::new;
     Supplier<List<String>> lambda = () -> new ArrayList();
  }
}
