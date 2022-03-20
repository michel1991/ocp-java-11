import java.util.function.*;

public class ParamterListFinctionalInterfaceWithVarType{
  public void consume(Consumer<Integer> c, int num){
     c.accept(num);
  }

  public void whatAmI(){
     consume((var x) -> System.out.print(  x ), 123);
  }
  public static void main(String[] args){
     var myFI = new ParamterListFinctionalInterfaceWithVarType();
     myFI.whatAmI();
  }
}
