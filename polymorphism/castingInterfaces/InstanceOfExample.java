package polymorphism.castingInterfaces;
import java.util.*;
public class InstanceOfExample{
   public static void main(String[] args){
     Number myNumber = 5;
     Double myDouble = Double.valueOf(6);
     HashMap myMap = new HashMap();
     boolean resultWithConcreteClassThatIsNotFinal = myMap instanceof List;
     System.out.println(" instanceof with concrete not final class at left and interface at right " +  resultWithConcreteClassThatIsNotFinal);
     
   }
}
