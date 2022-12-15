package annotations;
import java.lang.annotation.*;
import java.util.*;


/**
* Which options, when inserted into the blank in the code, allow the code to compile without any warnings? (Choose all that apply.)
    A. @SafeVarargs
    B. @SafeVarargs("unchecked")
    C. @Inherited
    D. @SuppressWarnings
    E. @SuppressWarnings("ignore")
    F. @SuppressWarnings("unchecked")
    G. None of the above
    *
    The @SafeVarargs annotation does not take a value and can be applied only to methods that cannot be overridden (marked private, static, or final).
    For these reasons, options A and B produce compilation errors. Option C also does not compile, as this annotation can be applied only to other annotations.
    Even if you didn’t remember that, it’s clear it has nothing to do with hiding a compiler warning.
    Option D does not compile as @SuppressWarnings requires a value.
    Both options E and F allow the code to compile without error, although only option F will cause a compile without warnings.
    The unchecked value is required when performing unchecked generic operations.
 */
class Donkey {
    //_________________________
    @SuppressWarnings("unchecked")
    public String kick(List... t) {
        t[0] = new ArrayList();
        t[0].add(1);
        return (String)t[0].get(0);
    }
}

public class DonkeyRemoveWarning {

}