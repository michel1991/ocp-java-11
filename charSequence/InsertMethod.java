package charSequence;
/**
 *  The author of this method forgot to include the data type.
 * Which of the following reference types can best fill in the blank to complete this method?
    A. String
    B. StringBuilder
    C. Both
    D. Neither
    
    he charAt() and length() methods are declared on both String and StringBuilder.
    However, the insert() method is declared only on a StringBuilder and not a String.
    Therefore, option B is correct.
 */
public class InsertMethod {
    public static void secret(StringBuilder mystery) {
        char ch = mystery.charAt(3);
        mystery = mystery.insert(1, "more");
        int num = mystery.length();
    }
}