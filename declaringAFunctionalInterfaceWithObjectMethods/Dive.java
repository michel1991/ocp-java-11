package declaringAFunctionalInterfaceWithObjectMethods;

public interface Dive{
  String toString();
  public boolean equals(Object o);
  public abstract int hashCode();
  public void dive();
}
