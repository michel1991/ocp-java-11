package advancedDesign;

   interface Planet{ 
    
   }

  interface Moon{
    
   }

  class Mars implements Planet{
    
   }

  class Titan implements Moon{     
    
   }

 final class Unknown extends Titan{
    
   }
 
class CheckingInstanceWithInheritance{
 
	
   public static void main(String... args){
      var m1 = new Mars();
      Titan t1 = new Titan();
      Unknown u1 = new  Unknown();
      System.out.println( m1 instanceof Planet ) ;
      System.out.println( t1 instanceof Planet) ;
   }


}
