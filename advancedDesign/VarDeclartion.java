package advancedDesign;
public class VarDeclartion {
    /**
       Which of the following code snippets about var compile without issue when used in a method? (Choose all that apply.)
       A. var cheetah = 2, var cloudedLeopard = 1;
        B. var var = "var";
        C. var tiger = null;
        D. var _ = "ROAR";
        E. var snowLeopard = 1F;
        F. var cougar = 5; var tigon = 2_1;
        G. var lion = false, jaguar = true;
        H. var kitty = 7; kitty = null;

        A var cannot be used in a multiple variable assignment expression, making options A and G incorrect.
        Option F is not a multiple variable expression, but two expressions, separated by a semicolon (;),
        making option F a correct answer. Option B is correct, as var is not a reserved word in Java.
        A var cannot be initialized with a null value, but it can be assigned a null value,
        if the underlying type is not a primitive. For these reasons, options C and H are incorrect.
        Option H would be correct if the expression was a String or Object instead of primitive 7.
        Option D is incorrect since a single underscore (_) cannot be an identifier as of Java 9.
         Finally, option E is correct with snowLeopard being assigned a float value.
     */
   static void firstExample(){
        var var = "var";
        var snowLeopard = 1F;
        var cougar = 5; var tigon = 2_1;
   }
}