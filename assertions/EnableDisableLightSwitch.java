package annotations;
/**
* Once compiled, which commands result in an AssertionError being thrown at runtime? (Choose all that apply.)
*   A. java –disableassertions office.LightSwitch
    B. java –enableassertions office.LightSwitch
    C. java –ea:office office.LightSwitch
    D. java –ea office office.LightSwitch
    E. java –ea:office... office.LightSwitch
    F. java –ea office... office.LightSwitch
    G. None of the above

  Assertions are disabled by default, so option A is not correct.
  Option B is correct, as using –ea or –enableassertions enables assertions everywhere.
  Option C is incorrect and enables assertions f only or a class named office, while option E enables assertions for the office package and is correct.
  Options D and F are incorrect, as they use a space instead of colon (:) between -ea and the package name.
  They result in a different error, as the assertion argument is treated as the name of the entry point class.
 */
public class EnableDisableLightSwitch {
    public static void main(String[] args) {
        String s = null;
        assert s != null;
    }
}