package returningAnOptional.creatingAnOptional;
import java.util.Optional;

public class CreatingAnOptional{
  
  public static Optional<Double> average(int... scores){
     if(scores.length == 0)
     return Optional.empty();

    int sum = 0;
    for (int score : scores)
     sum += score;

     return Optional.of((double) sum / scores.length);
  }

   public static void main(String[] args){
       var result = average(90, 100);
       System.out.println(result);
       System.out.println();

        System.out.println("result with empty");
       var resultEmpty = average();
       System.out.println(resultEmpty);
   }
}
