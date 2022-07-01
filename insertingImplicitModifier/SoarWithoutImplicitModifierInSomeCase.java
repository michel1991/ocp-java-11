package insertingImplicitModifier;
public interface SoarWithoutImplicitModifierInSomeCase{
  int MAX_HEIGHT = 10;
  final static boolean UNDERWATER = true;
  void fly(int speed);
  abstract void takeoff();
  public abstract double dive();
}
