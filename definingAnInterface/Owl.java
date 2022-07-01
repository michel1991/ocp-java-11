package definingAnInterface;

public class Owl implements Nocturnal, CanFly{
   public int hunt(){
     return 5;
   }

   public void flap(){
     System.out.println("Flap!");
   }
}
