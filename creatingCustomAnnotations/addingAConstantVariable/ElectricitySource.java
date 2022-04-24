package creatingCustomAnnotations.addingAConstantVariable;
public @interface ElectricitySource{
   public int voltgae();
  int MIN_VOLTAGE = 2;
  public static final int MAX_VOLTAGE = 18;
}
