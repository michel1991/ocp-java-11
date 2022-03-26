package instanceInitialization;

public class Chimpanzee extends Ape{
   public Chimpanzee(){
     super(2);
     System.out.print("Chimpanzee-");
   }

  public static void main(String[] args){
    new Chimpanzee();
  }

}
