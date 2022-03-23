public class SamplePassingByValue{
  public static void newNumber(int num){
    num = 8;
    System.out.println("the new number " + num);
  }

 public static void main(String[] args){
    int num = 4;
    newNumber(num);
    System.out.println("original value " + num);
 }
 
}
