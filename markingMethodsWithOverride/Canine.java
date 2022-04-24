package markingMethodsWithOverride;

public class Canine implements Intelligence{
   @Override
   public int cunning(){
     return 500;
   }
   
  void howl(){
     System.out.print("Woof!");
  }
}
