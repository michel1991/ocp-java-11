package creatingCustomAnnotations.selectingAnElementType;
import creatingCustomAnnotations.specifyingARequiredElement.Exercise;

public @interface Panda{
  Integer height();
  String[][] generalInfo();
  Size size() default Size.SMALL;
  Bear friendlyBear();
  Exercise exercise() default @Exercise(hoursPerDay=2);
}
