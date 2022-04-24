package markingMethodsWithOverride;

public class Dog extends Canine{
   @Override
   public boolean platFetch(){
     return true; // does not compile
   }
   
  @Override
  void howl(int timeOfDay){
    // does not compile
  }
}
