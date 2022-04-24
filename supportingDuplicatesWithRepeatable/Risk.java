package supportingDuplicatesWithRepeatable;

public @interface Risk{
   String danger();
   int level() default 1;
}
