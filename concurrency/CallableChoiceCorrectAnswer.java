package concurrency;
import java.util.concurrent.*;
public class CallableChoiceCorrectAnswer {
    /**
     * Which of the following are valid Callable expressions? (Choose all that apply.)
        A. a -> {return 10;}
        B. () -> {String s = "";}
        C. () -> 5
        D. () -> {return null}
        E. () -> "The" + "Zoo"
        F. (int count) -> count+1
        G. () -> {System.out.println("Giraffe"); return 10;}

        A Callable lambda expression takes no values and returns a generic type;
        therefore, options C, E, and G are correct. Options A and F are incorrect because they both take an input parameter.
        Option B is incorrect because it does not return a value. Option D is not a valid lambda expression,
        because it is missing a semicolon at the end of the return statement, which is required when inside braces {}.

     */
  static void choiceResponse(){
        try{
            Callable<String> first =     () -> "The" + "Zoo";
            System.out.println(first.call());
            Callable<Integer> second =  () -> 5;
            System.out.println(second.call());
            Callable<Integer> third =   () -> {System.out.println("Giraffe"); return 10;};
            System.out.println(third.call());
        }catch(Exception ex){
            ex.printStackTrace();
        }

  }

    public static void main(String... args){
        choiceResponse();
    }
}