package insertingImplicitModifier;
public abstract interface SoarWithImplicitModifier{
  public final static int MAX_HEIGHT = 10;
  public final static boolean UNDERWATER = true;
  public abstract void fly(int speed);
  public abstract void takeoff();
  public abstract double dive();
}
