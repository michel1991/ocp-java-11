package duplicateInterfaceMethodDeclarations;

public class BearUseForOverload implements HerbivoreUseForOverload, OmnivoreUseForOverload{
  
 public int eatPlants(int quantity){
   System.out.println("Eating plants "+ quantity);
   return quantity;
 }

  public void eatPlants(){
   System.out.println("Eating plants");
 }
 
}
