package UnderstandingSuppressedExceptions;

public class JammedTurkeyCage implements AutoCloseable{
  
  public void close() throws IllegalStateException{
         throw new IllegalStateException("Cage door does not close");
  }
  
   static void primaryExceptionAndSuppressedExceptions(){
         try(
             JammedTurkeyCage t = new JammedTurkeyCage()
       ){
          throw new IllegalStateException("Turkeys ran off ");
     } catch(IllegalStateException e){
         System.out.println("Caught primary exception: " + e.getMessage());
         for(Throwable t : e.getSuppressed() )
           System.out.println("Suppressed:" + t.getMessage());
      }

    }

    public static void main(String[] args){
      try(
             JammedTurkeyCage t = new JammedTurkeyCage()
       ){
          System.out.println("Put turkeys in");
     } catch(IllegalStateException e){
         System.out.println("Caught: " + e.getMessage());
      }
      
      System.out.println();
      System.out.println("Primary Exception and Suppressed Exception bellow:");
      primaryExceptionAndSuppressedExceptions();
   }

}
