package supportingDuplicatesWithRepeatable;
import java.lang.annotation.Repeatable;

@Repeteable // does not compile
public @interface Risk{
   String danger();
   int level() default 1;
}
