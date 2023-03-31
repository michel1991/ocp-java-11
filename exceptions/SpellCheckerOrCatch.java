package exceptions;

/**
   How many lines of text does the following program print?
    A. One.
    B. Two.
    C. Three.
    D. The code does not compile.
    E. None of the above.
    
    The program compiles without issue, so option D is incorrect.
    The narrower SpellingException and NullPointerException, which inherit from Exception,
    are correctly presented in the first catch block,
    with the broader Exception being in the second catch block.
    The if-then statement evaluates to true, and a new SpellingException instance is created,
    but it is not thrown because it is missing the throw keyword.
    For this reason, the try block ends without any of the catch blocks being executed.
    The finally block is then called, making it the only section
    of code in the program that prints a line of text.
     For this reason, option A is the correct answer.
 */
class SpellingException extends RuntimeException {}
class SpellChecker {
    public final static void main(String... participants) {
        try {
            if(!"cat".equals("kat")) {
                new SpellingException();
            }
        } catch (SpellingException | NullPointerException e) {
            System.out.println("Spelling problem!");
        } catch (Exception e) {
            System.out.println("Unknown Problem!");
        } finally {
            System.out.println("Done!");
        }
    }
}
public class SpellCheckerOrCatch {
  
}