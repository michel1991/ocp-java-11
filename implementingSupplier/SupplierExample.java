package implementingSupplier;
import java.util.function.Supplier;
import java.time.LocalDate;

public class SupplierExample{

   public static void exampleWithLocalDate(){
     Supplier<LocalDate> s1 = LocalDate::now;
     Supplier<LocalDate> s2 =  () -> LocalDate.now();
     
      LocalDate d1 = s1.get();
      LocalDate d2 = s2.get();

      System.out.println("Local date d1: " + d1);
      System.out.println("Local date d2: " + d2);
   }

    public static void exampleWithStringBuilder(){
       Supplier<StringBuilder> s1 = StringBuilder::new;
      Supplier<StringBuilder> s2  = () ->  new StringBuilder();

       System.out.println("String builder s1 using reference method: " + s1);
       System.out.println("String builder s2 using lambda: " + s2);
    }



  public static void main(String[] args){
     exampleWithLocalDate();
    
   exampleWithStringBuilder();
  }

}
