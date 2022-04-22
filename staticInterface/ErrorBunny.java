package staticInterface;

public class ErrorBunny implements Hop{
   public void printDetails(){
       System.out.println(getJumpHeight()); // does not compile
   }
}
