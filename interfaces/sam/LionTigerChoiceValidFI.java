package interfaces;

/**
  Which of these are functional interfaces?
    A. Lion
    B. Tiger
    C. Both Lion and Tiger
    D. Neither is a functional interface.
    E. The code does not compile.

    The code does compile, so option E is incorrect.
    A functional interface is required to have exactly one abstract method.
    Both interfaces have two. In both interfaces, roar() is abstract.
    The equals(Lion) method is similar to the equals(Object)
    in Object but is not an override of that method.
    Similarly, the toString() method in Tiger is also an abstract method.
    While there is a toString() method in Object, it does not take any parameters.
    Since each method has two abstract methods,
    neither is a functional interface, making option D the answer.
 */
interface Lion {
    public void roar();
    default void drink() {}
    boolean equals(Lion lion);
}

interface Tiger {
    public void roar();
    default void drink() {}
    String toString(String name);
}

public class LionTigerChoiceValidFI {

}