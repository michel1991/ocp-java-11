public class InstanceOfOperatorSampleUsingOperator{
   public static void openZoo(Number time){
    if(time instanceof Integer)
       System.out.print((Integer) time + " O'clock");
    else
      System.out.print(time);
  }

  public static void main(String[] args){
      Integer myNumber = 6; 
      InstanceOfOperatorSampleUsingOperator.openZoo(myNumber);
  }
}
