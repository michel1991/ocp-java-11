package returningAnOptional.creatingAnOptional;
import java.util.Optional;

public class ErrorCreatingAnOptionalWithCustomException  extends  CreatingAnOptional{
  
   public static void main(String[] args){
      Optional<Double> opt = average();
      System.out.println(opt.orElseThrow( () -> new IllegalStateException()  ));     
   }
}
