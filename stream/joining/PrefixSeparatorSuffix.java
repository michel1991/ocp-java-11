package stream.joining;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
   What will the following code print?

    Stream<String> ss = Stream.of("a", "b", "c");
    String str = ss.collect(Collectors.joining(",", "-", "+"));
    System.out.println(str);
    
    A. -a+,-b+,-c+
    B. ,-+b,-+c
    C. -a,b,c+
        Collectors.joining(",", "-", "+") returns a Collector that joins all the Strings in the given
        Stream separated by comma and then prefixes the resulting String with "-" and suffixes the String with "+".
    D. It will throw an exception at run time.
    
   ---------------------
   The following JavaDoc description of the joining method is helpful:
    public static Collector<CharSequence,?,String>
        joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
    Returns a Collector that concatenates the input elements, separated by the specified delimiter,
     with the specified prefix and suffix, in encounter order.
    Parameters:
    
    delimiter - the delimiter to be used between each element prefix - the sequence of characters to
    be used at the beginning of the joined result suffix - the sequence of characters to be used at the end of the joined result
    
    Returns:
    A Collector which concatenates CharSequence elements, separated by the specified delimiter, in encounter order
     Correct(C)

 */
public class PrefixSeparatorSuffix {
    public static void main(String... args){
        Stream<String> ss = Stream.of("a", "b", "c");
        String str = ss.collect(Collectors.joining(",", "-", "+"));
        System.out.println(str);
    }
}