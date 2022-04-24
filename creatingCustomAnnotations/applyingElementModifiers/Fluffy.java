package creatingCustomAnnotations.applyingElementModifiers;

public @interface Fluffy{
 int cuteness();
 public abstract int softness() default 11;
 protected Material material(); // does not compile
 private String friendly(); // does not compile
 final boolean isBunny(); // does not compile
}
