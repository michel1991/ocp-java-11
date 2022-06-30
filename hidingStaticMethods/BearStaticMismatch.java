package hidingStaticMethods;
public class BearStaticMismatch{
  public static void sneeze(){
     System.out.println("Bear is sneezing");
  }

   public void hibernate(){ 
     System.out.println("Bear is hibernating");
  }

   public static void laugh(){
     System.out.println("Bear is laughing");
  }
}
