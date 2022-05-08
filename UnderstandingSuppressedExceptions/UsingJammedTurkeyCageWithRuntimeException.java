package UnderstandingSuppressedExceptions;

public class UsingJammedTurkeyCageWithRuntimeException{
  
  
  
   static void primaryExceptionAndSuppressedExceptions(){
         try(
             JammedTurkeyCage t = new JammedTurkeyCage()
       ){
          throw new RuntimeException("Turkeys ran off ");
     } catch(IllegalStateException e){
         System.out.println("Caught" + e.getMessage());
      }

    }

    public static void main(String[] args){    
      System.out.println();
      System.out.println("Primary Exception and Suppressed Exception bellow:");
      primaryExceptionAndSuppressedExceptions();
   }

}
