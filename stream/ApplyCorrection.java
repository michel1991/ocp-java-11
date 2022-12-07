package stream;
import java.util.stream.*;
import java.util.*;

public class ApplyCorrection {
    /**
    *  What changes need to be made together for this code to print the string 12345? (Choose all that apply.)
       Stream
            .iterate(1, x -> x++)
            .limit(5).map(x -> x)
            .collect(Collectors.joining());

            A. Change Collectors.joining() to Collectors.joining(",").
            B. Change map(x -> x) to map(x -> "" + x).
            C. Change x -> x++ to x -> ++x.
            D. Add forEach(System.out::print) after the call to collect().
            E. Wrap the entire line in a System.out.print statement.
            F. None of the above. The code already prints 12345.

       As written, the code doesn’t compile because the Collectors.joining() expects to get a Stream<String>.
       Option B fixes this, at which point nothing is output because the collector creates a String without outputting the result.
       Option E fixes this and causes the output to be 11111.
       Since the post-increment operator is used, the stream contains an infinite number of the character 1.
       Option C fixes this and causes the stream to contain increasing numbers.

     */
    static void print12345(){
        System.out.println(
                Stream
                .iterate(1, x -> ++x)
                .limit(5)
                .map(x -> "" + x)
                .collect(Collectors.joining())
        );
    }

    public static void main(String... args){
        print12345();
    }
}