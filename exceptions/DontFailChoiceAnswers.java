package exceptions;
public class DontFailChoiceAnswers {
    /**
    * Which of the following can be inserted in the blank to make the code compile? (Choose all that apply.)
    *   A. var
        B. Exception
        C. IOException
        D. IllegalArgumentException
        E. RuntimeException
        F. StackOverflowError
        G. None of the above

      A var is not allowed in a catch block since it doesn’t indicate the exception being caught, making option A incorrect.
      With multiple catch blocks, the exceptions must be ordered from more specific to broader, or be in an unrelated inheritance tree.
      For these reasons, options D and F are correct, respectively.
      Alternatively, if a broad exception is listed before a specific exception or the same exception is listed twice, it becomes unreachable.
      For these reasons, options B and E are incorrect, respectively.
      Finally, option C is incorrect because the method called inside the try block doesn’t declare an IOException to be thrown.
      The compiler realizes that IOException would be an unreachable catch block.
     */
    public void dontFail() {
        try {
            System.out.println("work real hard");
        } catch (StackOverflowError e) {
        } catch (RuntimeException e) {}
    }
}