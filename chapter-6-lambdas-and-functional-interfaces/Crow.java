import java.util.function.*;
public class Crow{
  private String color;
  public void caw(String name){
     String volume = "loudly";
     Consumer<String> consumer = s -> System.out.println(name + " says " + volume + " that she is " + color);
     consumer.accept(name);
  }

  public static void main(String[] args){
    var myCrow = new Crow();
     myCrow.color = "black";
     myCrow.caw("hawking");
  }
}
