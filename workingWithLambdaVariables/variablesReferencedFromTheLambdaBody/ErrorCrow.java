package workingWithLambdaVariables.variablesReferencedFromTheLambdaBody;
import java.util.function.*;

public class ErrorCrow{
   private String color;
  public void caw(String name){
      String volume = "loudly";
      color = "allowed";
      name = "not allowed";
      volume = "not allowed";
      Predicate<String> p = s -> ( name + volume + color).length() == 10; 
  }

}
