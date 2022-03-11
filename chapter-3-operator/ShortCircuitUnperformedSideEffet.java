public class ShortCircuitUnperformedSideEffet{
   public static void main(String[] args){
      int rabbit = 6;
     boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
     System.out.println("right expression it not evaluate: " + rabbit);
   }
}
