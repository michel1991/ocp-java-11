package stream.primitives;
import java.util.*;
import java.util.stream.*;


public class LongStreams {
    /**
    *   Which of the following can we add after line 6 for the code to run without error and not produce any output? (Choose all that apply.)
       A.
            if (opt.isPresent())
            System.out.println(opt.get());
        B.
            if (opt.isPresent())
            System.out.println(opt.getAsLong());
        C.
            opt.ifPresent(System.out.println);
        D.
            opt.ifPresent(System.out::println);
        E. None of these; the code does not compile.
        F. None of these; line 5 throws an exception at runtime.

      Lines 4–6 compile and run without issue, making option F incorrect.
      Line 4 creates a stream of elements [1, 2, 3]. Line 5 maps the stream to a new stream with values [10, 20, 30].
      Line 6 filters out all items not less than 5, which in this case results in an empty stream. For this reason, findFirst() returns an empty Optional.
      Option A does not compile. It would work for a Stream<T> object, but we have a LongStream and therefore need to call getAsLong().
      Option C also does not compile, as it is missing the :: that would make it a method reference.
      Options B and D both compile and run without error, although neither produces any output at runtime since the stream is empty.
     */
    static void filterLessThanFive(){
        var stream = LongStream.of(1, 2, 3);  //  4:
        var opt = stream.map(n -> n * 10) // 5:
        .filter(n -> n < 5).findFirst(); //  6:

        if (opt.isPresent())
            System.out.println(opt.getAsLong());

        opt.ifPresent(System.out::println);

    }

    public static void main(String... args){
        filterLessThanFive();
    }
}