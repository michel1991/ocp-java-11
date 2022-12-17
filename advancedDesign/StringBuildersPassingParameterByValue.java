package advancedDesign;
/**
* Which of the following are output by the following code? (Choose all that apply.)
*   A. s1 = a
    B. s1 = s1
    C. s2 = s2
    D. s2 = s2b
    E. s3 = a
    F. The code does not compile.

  Since Java is pass-by-value, assigning a new object to a does not change the caller.
  Calling append() does affect the caller because both the method parameter and the caller have a reference to the same object.
  Finally, returning a value does pass the reference to the caller for assignment to s3.

 */
class StringBuilders {
    public static StringBuilder work(StringBuilder a,
                                     StringBuilder b) {
        a = new StringBuilder("a");
        b.append("b");
        return a;
    }
    public static void main() {
        var s1 = new StringBuilder("s1");
        var s2 = new StringBuilder("s2");
        var s3 = work(s1, s2);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }
}

/**
* What is the result of the following code?
*   A. or-ixyginal stringmaybe
    B. or-nal string
    C. or-xyginal stringmaybe
    D. original string
    E. A different value
    F. An exception is thrown.
    G. The code does not compile.

    There’s a lot going on in this question. The first thing to notice is that there is only one StringBuilder in use.
    Both methods create a new StringBuilder, but they do not use it.
   The code uses method chaining. In the trade() method, after the call to append(), we have "original stringmaybe".
   That result is passed to the first insert() call, which inserts at index 2.
    At this point, we have "orshiginal stringmaybe ".
    That result is passed to the final insert(), which inserts xy at index 5, resulting in "orshixyginal stringmaybe".
   Then we call the replace() method, which removes the characters from positions 2, 3, and 4 and substitutes a dash.
   We finally have the result "or-xyginal stringmaybe", making option C correct.
 */
class TradeReplace{
    private static StringBuilder trade(StringBuilder original) {
        var b = new StringBuilder();
        return original.append("maybe").insert(2, "sh")
        .insert(5, "xy");
    }
    private static StringBuilder replace(StringBuilder original) {
        var b = new StringBuilder();
        return original.replace(2, 5, "-");
    }

    public static void main() {
        System.out.println("Begin  TradeReplace ");
        var sb = new StringBuilder("original string");
        var trade = trade(sb);
        var newSb = replace(sb);

        System.out.println(newSb);

        System.out.println("End TradeReplace ");
    }
}

public class StringBuildersPassingParameterByValue {



    public static void main(String[] args) {
        StringBuilders.main();
    }
}