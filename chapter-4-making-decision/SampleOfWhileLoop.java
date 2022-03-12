public class SampleOfWhileLoop{
  int roomInBelly = 5;
  public void eatCheese(int bitesOfCheese){
   while(bitesOfCheese > 0 && roomInBelly >0 ){
        bitesOfCheese--;
        roomInBelly--;
    }
    System.out.println(bitesOfCheese + " pieces of cheese left" );
  }

 public static void main(String[] args){
     SampleOfWhileLoop sample = new SampleOfWhileLoop();
     sample.eatCheese(20);
  }
}
