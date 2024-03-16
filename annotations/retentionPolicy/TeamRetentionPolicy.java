package annotations.retentionPolicy;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 The main() method in the following program reads the annotation value() of Plumber at runtime on each member of Team.
It compiles and runs without any errors. Based on this, how many times is Mario printed at runtime?
    A. Zero
    B. One
    C. Two
    D. Three
    E. The answer cannot be determined until runtime.

  This question, like some questions on the exam, includes extraneous information that you do not need to know to solve it.
  Therefore, you can assume the reflection code is valid. That said, this code is not without problems.
  The default retention policy for all annotations is RetentionPolicy.CLASS if not explicitly stated otherwise.
  This means the annotation information is discarded at compile time and not available at runtime.
  For this reason, none of the members will print anything, making option A correct.
  If @Retention(RetentionPolicy.RUNTIME) were added to the declaration of Plumber, then the worker member would cause the default annotation value(),
  Mario, to be printed at runtime, and option B would be the correct answer. Note that foreman would not casue Mario to be printed even with the corrected retention annotation. Setting the value of the annotation is not the same as setting the value of the variable foreman.

 */
@interface Plumber {
    String value() default "Mario";
}

class Team {
    @Plumber("") private String foreman = "Mario";
    @Plumber private String worker = "Kelly";
    @Plumber("Kelly") private String trainee;

    public static void main(String[] args) {
        var t = new Team();
        var fields = t.getClass().getDeclaredFields();
        for (Field field : fields)
            if(field.isAnnotationPresent(Plumber.class))
                System.out.print(field.getAnnotation(Plumber.class)
                .value());
    }
}

public class TeamRetentionPolicy {

}