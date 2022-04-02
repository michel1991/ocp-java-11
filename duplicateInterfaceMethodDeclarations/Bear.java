package duplicateInterfaceMethodDeclarations;

public class Bear implements Herbivore, Omnivore{
  public void eatMeat(){
    System.out.println("Eating meat");
  }
 
 public void eatPlants(){
   System.out.println("Eating plants");
 }
 
}
