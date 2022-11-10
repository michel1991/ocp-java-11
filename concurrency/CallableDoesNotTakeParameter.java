package concurrency;
import java.util.concurrent.*;
public class CallableDoesNotTakeParameter {
   public static void main(String... args) throws Exception{
       Callable<Integer> call = () -> 10;
       System.out.println(call.call());
       Callable<Integer> callTwo =  () -> {for(int i=0; i<10; i++) {} return 10;};
       System.out.println(callTwo.call());
   }
}