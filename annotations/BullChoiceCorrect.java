package annotations;
import java.lang.annotation.*;

/**
* Given the following program, which would be a valid declaration for the EatsGrain annotation? (Choose all that apply.)
     // EatsGrain declaration
        @EatsGrain
        public class Bull {
            @EatsGrain private String calf;
        }

   A. @Target(ElementType.TYPE) @interface EatsGrain {}
    B. @interface EatsGrain {}
    C. @interface EatsGrain { String value(); }
    D. @interface EatsGrain { int grain() = 0; }
    E. @Target(ElementType.TYPE_USE) @interface EatsGrain {}
    F. None of the above

    Option A is incorrect, as the @Target is TYPE.
    This means it can be applied to the Bull class declaration but not the calf variable.
    Option B is correct, as annotations can be used on types, methods, and variables by default if no @Target is specified.
    Option C is incorrect, as it specifies a required element.
    The usage of the annotation in the Bull class would have to be changed.
    Option D is incorrect, as annotation elements require the default keyword (not =) to set a default value.
     Finally, option E is correct, as a @Target of TYPE_USE allows the annotation to be used anywhere a type is declared or used.
 */
   @Target(ElementType.TYPE_USE)
    @interface EatsGrain{

    }

    @interface EatsGrainSecond{

    }

    @EatsGrain
    @EatsGrainSecond
    class Bull {
        @EatsGrain
        @EatsGrainSecond
        private String calf;
    }


public class BullChoiceCorrect {

}