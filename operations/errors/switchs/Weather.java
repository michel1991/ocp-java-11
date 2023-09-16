package operations.errors.switchs;
/**
 * Given the following enum and class, which option fills in the blank and allows the code to compile?
    A. case Season.WINTER:
    B. case WINTER, SPRING:
    C. case SUMMER | WINTER:
    D. case SUMMER ->
    E. case FALL:
    F. None of the above
    
    Option A is incorrect because the enum type Season is not used within a case statement.
    If it were just case WINTER:, then it would compile.
    Options B and C do not compile because switch statements
    do not support multiple values within a case statement.
    Option D is incorrect because -> is used instead of :.
    Option E is incorrect because FALL is not defined in the
    list of values for the enum Season.
    Since none of the lines of code is correct, option F is correct.
 */
enum Season { SPRING, SUMMER, WINTER }
public class Weather {
    public int getAverageTemperate(Season s) {
        switch (s) {
            default:
                case Season.WINTER:  return 30; // _______________  i put bad response
        }
    }
}