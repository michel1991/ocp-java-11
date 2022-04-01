package polymorphism.overridingAndHidingMembers;

public class CrestedPenguin extends Penguin{
   
   public static int getHeight(){
      return 8;
   }

  public static void main(String... fish){
    new CrestedPenguin().printInfo();
  }

}
