package supportingDuplicatesWithRepeatable;
import java.lang.annotation.Repeatable;

@Repeatable // does not compile
public @interface Risk{
   String danger();
   int level() default 1;
}
