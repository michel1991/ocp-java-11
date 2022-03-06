public class CastingPrimitiveToSmallType{
  public static void main(String[] args){
    int trainer = (int) 1.0;
   short ticketTaker = (short) 1921222; // stored as 20678
   int usher = (int) 9f;
  long manager =  192301398193810323L;
  System.out.println("short from int 1921222 result is "+ ticketTaker);
  System.out.println("all it is done");

  }
}
