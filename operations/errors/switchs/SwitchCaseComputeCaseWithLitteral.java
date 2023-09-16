package operation.errors.switchs;
public class SwitchCaseComputeCaseWithLitteral {

    /**
    * Of the eight lines of case statements in this switch statement, three of them compile, and five do not.
    * A case statement requires more than a final variable;
    * it requires a compile-time constant value. It can even be constructed by applying operators to literal values,
    * provided the compiler can resolve the value. For these reasons, options A and H, representing the first and last case lines,
    * are correct, and options B and F, lines 12 and 16, are incorrect. Options C, D, and G are all incorrect, as they use invalid syntax
    *  for case statements.Remember, switch statements do not support multiple values in a single case statement.
    * Option E is the other correct answer. It is not a single case statement, but two case statements separated by a semicolon (;).
     */
    private static Integer getCarton(final String defaultFlavor) {
       var iceCream = "mintChocolateChip";
        var favorite = "cottonCandy";
       final String backupChoice = "frenchVanilla";
        switch(iceCream) {
            default: case "A"+"Z" : return 21;
            case defaultFlavor: return -1;
            case "grape", case "butterPecan" : return 1;
            case "banana", "cherry" : return 7;
            case "": case "coffee": return 2;
            case favorite : return 9;
            case "vanilla" | "birthday" : return 3;
            case backupChoice : return 24;
            }
         return null;
    }
   public static void main(String... args){
        getCarton("hello");
   }
}