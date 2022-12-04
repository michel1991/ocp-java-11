package advancedDesign;
public class ChoiceEffectivelyFinalVariable {

    /**
    *  Which variables are effectively final? (Choose all that apply)
        A. local1
        B. local2
        C. param1
        D. param2
        E. None of the above

        Method parameters and local variables are effectively final if they aren’t changed after initialization.
        Options A and D meet this criterion.
     */
    public static void isIt(String param1, String param2) {
        String local1 = param1 + param2;
        String local2 = param1 + param2;

        param1 = null;
        local2 = null;
    }

    public static void main(String... args){
        
    }

}