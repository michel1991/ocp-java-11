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

  static void  checkingContentAndPrintValue(){
    Optional<Double> opt = average(90, 100);
     if(opt.isPresent())
       System.out.println("the value is " +  opt.get());
   }

   public static void main(String[] args){
       var result = average(90, 100);
       System.out.println(result);
       System.out.println();

        System.out.println("result with empty");
       var resultEmpty = average();
       System.out.println(resultEmpty);

        System.out.println();
        System.out.println("checking content and print value");
        checkingContentAndPrintValue();
   }
}
