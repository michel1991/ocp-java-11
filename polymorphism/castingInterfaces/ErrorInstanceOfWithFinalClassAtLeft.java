package polymorphism.castingInterfaces;
import java.util.*;
public class ErrorInstanceOfWithFinalClassAtLeft{
   public static void main(String[] args){
     Number myNumber = 5;
     Double myDouble = Double.valueOf(6);
     boolean resultWithAbstractTypeAtLeft =  myNumber instanceof List;
     boolean resultWithoutConcreteClassAtLeft =   myDouble instanceof List;
      boolean resultWithTwoAbstractType = myNumber instanceof AbstractList;
     System.out.println(" with abstract base class reference  at left and interface at right " + resultWithAbstractTypeAtLeft);
     System.out.println(" with concrete class at left and interface at right " +  resultWithoutConcreteClassAtLeft);
     System.out.println(" with abstract class reference at left and abstract at right " +  resultWithTwoAbstractType);

   }
}
