package annotations;
import java.lang.annotation.*;

/**
 *  Assume the following code compiles. Which annotation inserted in the line allows the code to print a non-null value at runtime?
    A. @Inherited
    B. @Polymorphism
    C. @Inheritance
    D. @Retention
    E. @Subclass
    F. None of the above

    Trick question! By default, annotations are not present at runtime.
    To print a non-null value, both @Retention(RetentionPolicy.RUNTIME)
    and @Inherited would be required, making option F correct.
    The @Retention annotation would preserve the annotation for runtime,
    while the @Inherited annotation would apply it to the subclass Cheetah.
 */

// INSERT HERE
@interface Fast {
    int topSpeed() default 10;
}

@Fast class BigCat {}

class Cheetah extends BigCat {
    public static void main(String... unused) {
        var a = Cheetah.class.getAnnotation(Fast.class);
        System.out.print(a);
    }
}


public class CheetahPresentAtRuntime {

}