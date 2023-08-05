package polymorphism.overridingAndHidingMembers;

public class CrestedPenguin extends Penguin{
   
   public static int getHeight(){
      return 8;
   }

  public static void main(String... fish){
    new CrestedPenguin().printInfo();
     CrestedPenguin crested =  new CrestedPenguin();

     // it is like call super.printInfo(); because the method printInfo is not override
    // in method  printInfo of the parent this.getHeight() refer to the parent
    crested.printInfo();

    Penguin peguinRefLeft = new CrestedPenguin();
    peguinRefLeft.printInfo();


  }

}
