package declaringAFunctionalInterfaceWithObjectMethods;

public interface Hibernate{
  String toString();
  public boolean equals(Hibernate o);
  public abstract int hashCode();
  public void rest();
}
