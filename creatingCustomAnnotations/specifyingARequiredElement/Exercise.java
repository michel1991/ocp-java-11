package creatingCustomAnnotations.specifyingARequiredElement;

public @interface Exercise{
   int hoursPerDay();
   int startHour() default 6;
}
