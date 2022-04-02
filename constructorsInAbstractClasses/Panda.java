package constructorsInAbstractClasses;

public class Panda extends Bear{
   String chew(){
      return "yummy!";
  }
  
  public static void main(String[] args){
     new Panda();
  }
}
