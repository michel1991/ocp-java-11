package convenienceMethodsOnFunctionalInterfaces;
import java.util.function.*;

public class ConvenienceWithConsumer{
 
  static void consumer(){
     Consumer<String> c1 = x -> System.out.print("1:" +x);
     Consumer<String> c2 = x -> System.out.print(",2:" +x);
     Consumer<String> combined = c1.andThen(c2);
     combined.accept("Annie");   
        
  }

 public static void main(String[] args){
   consumer();
     
 }

}
