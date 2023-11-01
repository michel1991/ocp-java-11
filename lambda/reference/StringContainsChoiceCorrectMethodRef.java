package lambda.reference;
import java.util.*;
import java.util.function.*;

public class StringContainsChoiceCorrectMethodRef{
  
  /**
   * Which method reference can replace the lambda on the second line so the output is the same?
      A. s::contains(a)
      B. s::contains
      C. String::contains(a)
      D. String::contains
      E. The supplied code does not compile.
      F. None of the above.

    Since the lambda references an effectively final variable,
    the method reference needs to as well.
    
    Option B is a correct method reference that meets this criteria.
    
    Options A and C use syntax that is not supported with method references.
    Option D is incorrect because the Predicate passes only one value at runtime,
    so one of the instance variable or method parameter would need to be supplied.

   */
  static void choice(){
    var s = "fish";
    Predicate<String> pred = (a) -> s.contains(a);
    Predicate<String> predBis = s::contains;
    System.out.println(pred.test("is"));
    System.out.println(predBis.test("is"));
  }
   public static void main(String... args){
    choice();
   }
}