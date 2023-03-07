package advancedDesign.errors;

/**
  What is the result of the following code?
     A. radicarobots
    B. radicalrobots
    C. The code does not compile.
    D. The code compiles but throws an exception at runtime.

    Calling the constructor and then insert() is an example of method chaining.
    However, the sb.length() call is a problem.
    The sb reference doesn’t exist until after the chained calls complete.
    Just because it happens to be on a separate line doesn’t change when the reference is created.
    Since the code does not compile, option C is correct.

 */
public class StringBuilderChainedWithoutRefThatExist {
  public static void main(String... args){
      var sb = new StringBuilder("radical").insert(sb.length(), "robots");
      System.out.println(sb);
  }
}