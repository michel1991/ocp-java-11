public class ErrorOverloadingMethodsWithSameParameters{
   public void fly(int numMiles){
     System.out.println("hello fly 1 void"); 
   }
  
  public int fly(int numMiles){
     System.out.println("Hello Fly 2");
     return numMiles;
  }

  public static void main(String[] args){
     var sample = new ErrorOverloadingMethodsWithSameParameters();
     sample.fly(4);
  }

}
