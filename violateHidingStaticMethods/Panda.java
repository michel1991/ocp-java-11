package violateHidingStaticMethods;

public class Panda extends Bear{
  public void sneeze(){ // does not compile
      System.out.println("Panda sneezes");
  }

  public static void hibernate(){
    System.out.println("Panda is going to sleep"); // does not compile
  }

 protected static void laugh(){ // does not compile
    System.out.println("Panda is laughing");
  }

}
