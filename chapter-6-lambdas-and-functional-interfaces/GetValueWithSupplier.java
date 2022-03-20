import java.util.function.*;
public class GetValueWithSupplier{
  public static int returnNumber(Supplier<Integer> supplier){
     return supplier.get();
  }

  public static void main(String[] args){
       Supplier<Integer> number = () -> 42;
       System.out.println(returnNumber(number));
  }
}
