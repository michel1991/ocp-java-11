package lambda;
import java.util.function.*;

public class PredicateWithStringBuilderChoiceAnswer {

   /**
    * Which changes can be independently made to this code and have it still compile? (Choose three.)
      Predicate˂StringBuilder˃ p = (StringBuilder b) -˃ {return true;};
        A. Change StringBuilder b to var b.
        B. Change StringBuilder b to b.
        C. Remove StringBuilder b.
        D. Remove -˃.
        E. Remove { and ;}.
        F. Remove { return and ;}.

        Options A and B are correct because the type may be var or omitted in a lambda.
        If there are multiple parameters, all must be handled the same way.
        Option C is tricky but incorrect. While a lambda can have zero parameters, a Predicate cannot.
        A Predicate is defined as a type mapping to a boolean.
        Option D is clearly incorrect as -˃ separates the parts of a lambda.
        Options E and F are similar.
        Option E is incorrect because return is allowed only when the braces are present.
        Option F is correct.
    */
  static void choice(){
      Predicate<StringBuilder> p = (StringBuilder b) -> {return true;};
  }
}