package operations;
public class NumberWithUnderscore {
    /**
    *  Which of the following expressions, when inserted independently into the blank line, allow the code to compile? (Choose all that apply.)
    *   A. 3_1
        B. 1_329_.0
        C. 3_13.0_
        D. 5_291._2
        E. 2_234.0_0
        F. 9___6
        G. _1_3_5_0
        H. None of the above

      An underscore (_) can be placed in any numeric literal, so long as it is not at the beginning, the end, or next to a decimal point (.).
      Underscores can even be placed next to each other. For these reasons, options A, E, and F are correct.
      Options B and D are incorrect, as the underscore (_) is next to a decimal point (.).
      Options C and G are incorrect, because an underscore (_) cannot be placed at the beginning or end of the literal.
    *
     */
    public void printMagicData() {
        double magic = 9___6 ; // ________________
        System.out.println(magic);
    }

    public static void main(String... args){

    }
}