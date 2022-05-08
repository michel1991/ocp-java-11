package UnderstandingSuppressedExceptions;

public class LosePrimaryExceptionUsingJammedTurkeyCage{
  
   static void loseExceptions(){
         try(
             JammedTurkeyCage t = new JammedTurkeyCage()
       ){
          throw new IllegalStateException("Turkeys ran off");
     } finally{
        throw new RuntimeException("and we couldn't find them ");
      }

    }

    public static void main(String[] args){    
      System.out.println("Lose Primary Exception and not throw suppressed exception");
      loseExceptions();
   }

}
