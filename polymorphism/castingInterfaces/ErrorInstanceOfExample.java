package polymorphism.castingInterfaces;
import java.util.*;
public class InstanceOfExample{
   public static void main(String[] args){
     Number myNumber = 5;
     Double myDouble = Double.valueOf(6);
     boolean result =  myNumber instanceof List;
     boolean resultWithoutBaseClass =   myDouble instanceof List;
     System.out.println(" with ref from base class " + result);
     System.out.println(" with ref from base class " +  resultWithoutBaseClass);

   }
}
