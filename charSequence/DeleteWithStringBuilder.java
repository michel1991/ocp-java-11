package charSequence;

public class DeleteWithStringBuilder {
    /**
     *  What is the output of the following?
        A. Leaves growing
        B. ing
        C. wing
        D. The code does not compile.
        E. The code compiles but throws an exception at runtime
        
        On the first iteration through the loop, the first five characters are removed,
        and builder becomes "s growing".
        Since there are more than five characters left, the loop iterates again.
        This time, five more characters are removed,
        and builder becomes "wing". This matches option C.
     */
    public static void main(String... args){
        var builder = new StringBuilder("Leaves growing");
        do {
            builder.delete(0, 5);
        } while (builder.length() > 5);
        System.out.println(builder);
    }
}