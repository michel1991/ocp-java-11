package polymorphism.castingInterfaces;
public class BadCasts{
  public static void main(String[] args){
      Canine canine = new Wolf();
      Canine badDog = (Dog)canine;
  }

}
