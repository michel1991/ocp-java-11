import java.util.function.*;
public class PrintWithConsumer{
  public static  void print(Consumer<String> consumer, String value){
    consumer.accept(value);
   }

   public static void main(String[] args){
      System.out.println("print using show version");
      print(a -> System.out.println(a), "Hello World");
      Consumer<String> consumer = (String a) -> System.out.println(a);
      System.out.println("print with the creation of local variable that hold consumer");
      print(consumer, "Hello World");
   }
}
