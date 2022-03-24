import java.util.*;
import java.time.*;
import java.time.Month;
public class MoreOverloadingMethodReferenceType{
   public static void print(Iterable i){
     System.out.print("I");
   }

   public static void print(CharSequence c){
      System.out.print("C");
   }

  public static void print(Object o){
    System.out.print("O");
  }

   public static void main(String[] args){
     print("abc");
     print(new ArrayList<>());
     print(LocalDate.of(2019, Month.JULY, 4));
   }
}
