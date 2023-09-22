package garbage.beforeEndMainMethod;
public class StringState {
    /**
     * Which of the following are true right before the main() method ends? (Choose two.)
        A. No objects are eligible for garbage collection.
        B. One object is eligible for garbage collection.
        C. Two objects are eligible for garbage collection.
        D. No objects are guaranteed to be garbage collected.
        E. One object is guaranteed to be garbage collected.
        F. Two objects are guaranteed to be garbage collected.
        
        At the end of the method, state1 and state3 both point to "water",
        while state2 points to "mist". Since there are no references to "ice",
        it is eligible for garbage collection, making option B correct.
        However, garbage collection is not guaranteed to run,
        so option D is also correct.
     */
    public static void main(String[] args) {
        String state1 = new String("ice");
        String state2 = new String("water");
        String state3 = new String("mist");

        state1 = state2;
        state2 = state3;
        state3 = state1;
    }
}