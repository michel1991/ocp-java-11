package stream.flatMap;
import java.util.stream.*;
import java.util.*;

public class Printac {
    /**
       What will the following code print when compiled and run?

            public static void main(String[] args) {
            Stream<List<String>> s1 = Stream.of(
                    Arrays.asList("a", "b"),
                    Arrays.asList("a", "c")
                );
            
            Stream<String> news = s1.filter(s->s.contains("c"))
                .flatMap(olds -> olds.stream());
            news.forEach(System.out::print);
            }
        
        A. ab
        B. ac
        C. [a, b]
        D. [a, c]
        E. [ab]
        F. [ac]
        
        --------------------------------
        The given code first creates a Stream, where each element is a List<String>.
        Next, it filters the stream using a criteria s.contains("c");,
        which means only the elements that satisfy the criteria will remain in the resulting stream.
        Hence, the list containing a, b will be removed.
        Next, it uses the flatMap method to generate elements of the new stream.
        The flatMap method returns a stream consisting of the results of replacing each element
        of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element.
        In this case, our original stream has only one element, which is a List of Strings.
        The lambda expression passed to this method converts this List object into a stream using List's stream() method.
        
        Finally, it uses the forEach method of Stream to print each element. Therefore, the code will print ac.
        Correct(B)

     */
    public static void main(String... args){
        Stream<List<String>> s1 = Stream.of(
                Arrays.asList("a", "b"),
                Arrays.asList("a", "c")
            );
        
        Stream<String> news = s1.filter(s->s.contains("c"))
            .flatMap(olds -> olds.stream());
        news.forEach(System.out::print);
    }
}