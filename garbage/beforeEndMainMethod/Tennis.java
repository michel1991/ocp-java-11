package garbage.beforeEndMainMethod;
/**
    How many objects are eligible for garbage
    collection immediately before the end of the main() method?
    
    A. None.
    B. One.
    C. Two.
    D. Three.
    E. The code does not compile.
    F. None of the above.
    
    All arrays are objects regardless of whether they point to primitives or classes.
    That means both balls and scores are objects.
    
    Both are set to null so they are eligible for garbage collection.
    The balls array is initialized to contain all null references.
    
    There are no objects inside. The scores array is initialized to all 0 values.
    Therefore, only two objects exist to be eligible for garbage collection,
     and option C is correct.
 */
public class Tennis {
    public static void main(String[] game) {
        String[] balls = new String[1];
        int[] scores = new int[1];
        balls = null;
        scores = null;
    }
}