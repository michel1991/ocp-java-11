public class ShortCircuitOperatorSample{
  public static void main(String[] args){
    int hour = 10;
    boolean zooOpen = true || (hour <4);
   System.out.println( " display true because the left side is always true not need to verify the right side:  " + zooOpen); // true
  }
}
