package workingWithGenerics.boundingGenericTypes;
import java.util.*;
class DifferenceBetweenUnboundedWildCardAndObject{
   public static void main(String... args){
      List<?> x1 = new ArrayList<>();
      var x2 = new ArrayList<>();
   }
}
