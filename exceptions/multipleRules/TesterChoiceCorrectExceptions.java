package exceptions.multipleRules;

/**
* Which of the following can fill in the blank to make the code compile? (Choose all that apply.)

    A. Exception
    B. HurtException
    C. IOException
    D. LimpException
    E. RuntimeException

    Option A is correct because it is more general than LimpException.
    Option E is correct because any method might throw a runtime exception without declaring it.
    Option D is incorrect because two catch blocks with the same exception are not allowed.
    Option C is incorrect because the compiler knows there is no way split() throws an IOException.
    Option B is incorrect because HurtException was already caught and no other LimpExceptions are thrown from split().
    Java recognizes it as dead code.
 */

class LimpException extends Exception{}
class HurtException extends LimpException{}

public class TesterChoiceCorrectExceptions {
    public void run() {
        try {
            split();
        }catch(LimpException e) {

        } /*catch(____________ e) {
        }*/  // part of questions
    }
    private void split() throws HurtException {

    }

    public static void main(String... args){
        
    }
}