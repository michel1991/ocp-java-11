package polymorphism.casting;

public class ErrorUsingInstanceOfWithUnrelatedClass{
   public static void main(String[] args){
     Fish fish = new Fish();
     if(fish instanceof Bird ){
         Bird bird = (Bird)fish;        
   
     }  
      
  }

}
