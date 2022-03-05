public class Chick {
   private String name = "Fluffy";
  {
     // initializer instance bloc
     System.out.println("Setting field");
  }
    public Chick(){
      name = "Tiny";
      System.out.println("Setting constructor");
    }
    public static void main(String[] args){
      Chick chick = new Chick();
     System.out.println(chick.name); 
    }
    {
     System.out.println("second bloc instance initializer to run before constructor");
    }
}
