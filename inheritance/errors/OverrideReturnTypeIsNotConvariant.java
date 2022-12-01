package inheritance.errors;

/**
*
  Which statements about the following declarations are correct? (Choose all that apply.)
    A. The HasWater declaration compiles.
    B. The IsSalty declaration compiles.
    C. The IsSea declaration does not compile because an interface can only extend one interface.
    D. The IsSea declaration compiles because it is not required to implement any of the methods it inherits.
    E. The Ocean declaration compiles.
    F. The variable color is inherited by the Ocean class.
    *
    The HasWater and IsSalty interfaces compile, making options A and B correct.
    Option C is incorrect, as an interface can extend multiple interfaces.
    That said, the IsSalty interface still does not compile, but the reason is that the return types of Boolean and boolean are not covariant;
    in other words, one is not a subtype of the other. For this reason, option D is also incorrect.
    Even though IsSalty is an abstract type, the compiler can detect no concrete method could ever override both inherited abstract methods simultaneously.
    Option E is incorrect, as a class cannot be marked both abstract and final.
    Finally, option F is correct, as interface variables are implicitly public and inherited in the classes that implement the interface.
 */
interface HasWater {
    public boolean isBlue();
    void wet();
}
interface IsSalty {
    static final String color = "clear";
    Boolean isBlue();
    public void wet();
}
interface IsSea extends HasWater, IsSalty {}
abstract public final class Ocean implements IsSalty {}

public class OverrideReturnTypeIsNotConvariant {
   public static void main(String... args){

   }
}