import java.util.function.*;
public class LocalVariableLambdaMustBeDeclareWithFinal{
  private String color;
  public void caw(final String name){
     final String volume = "loudly";
     Consumer<String> consumer = s -> System.out.println(name + " says " + volume + " that she is " + color);
     consumer.accept(name);
  }

  public static void main(String[] args){
    var myCrow = new LocalVariableLambdaMustBeDeclareWithFinal();
     myCrow.color = "black";
     myCrow.caw("hawking");
  }
}
