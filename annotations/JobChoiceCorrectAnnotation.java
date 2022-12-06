package annotations;
import java.lang.annotation.*;

/*$
   Which annotations, when applied independently, allow the following program to compile? (Choose all that apply.)
    A. @CurrencyAmount
    B. @CurrencyAmount(Unit.Dollar) @CurrencyAmount(Unit.Yen)
    C. @CurrencyAmount(Unit.Peso, Unit.Rupee)
    D. @CurrencyAmount({Unit.Euro, Unit.Dollar})
    E. @CurrencyAmount(value=Unit.Euro, Unit.Dollar)
    F. None of the above

   First, alternative() includes a default value, so it is optional in each of the choices.
   Option A with no values is correct because the annotation does not have any required elements.
   Option D is also correct, as it passes an array of Unit values.
   Option B is incorrect, as CurrencyAmount is not marked @Repeatable.
   Remember, annotations are not repeatable by default.
   Options C and E are incorrect, as the array braces ({}) can be dropped only if there is only one element provided.
 */
enum Unit {Dollar, Euro, Peso, Yen, Rupee}
@Target(ElementType.METHOD)
@Documented public @interface CurrencyAmount {
    Unit[] value() default Unit.Dollar;
    String alternative() default "";
}

abstract class Job {
    @CurrencyAmount abstract long salary();
}

public class JobChoiceCorrectAnnotation {

}