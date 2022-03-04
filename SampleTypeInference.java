public class SampleTypeInference{
  public void reassignment(){
   var number = 7;
   var number = 4;
    number = "five";
   System.out.println(number); // does not compile
  }
  public static void main(String[] args){
    SampleTypeInference sample = SampleTypeInference();
     sample.reassignment();
  }
}
