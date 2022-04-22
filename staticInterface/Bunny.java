package staticInterface;

public class Bunny implements Hop{
   public void printDetails(){
       System.out.println(Hop.getJumpHeight());
   }
}
