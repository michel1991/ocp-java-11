package hidingStaticMethods;
public class PandaStaticMismatch extends  BearStaticMismatch{
  public void sneeze(){ // does not compile
     System.out.println("Panda is sneezes quietly");
  }

   public static void hibernate(){ // does not compile 
     System.out.println("Panda is going to sleep");
  }
    
   protected static void laugh(){ // does not compile
     System.out.println("Panda is laughing");
  }
}
