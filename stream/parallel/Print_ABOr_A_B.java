package stream.parallel;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class Print_ABOr_A_B {
     /**
        Identify correct statements about the following code:
        A. It will always print _ab
        B. It will always print either _ab or _ba
        C. It will print either _ab or _a_b
          ----------------
            Since we are creating a parallel stream, it is possible for both the elements of the stream to be processed by two different threads.
            In this case, the identity argument will be used to reduce both the elements. Thus, it will print _a_b.
            It is also possible that the result of the first reduction ( _a ) is reduced further using the second element (b).
             In this case, it will print _ab.
            
            Even though the elements may be processed out of order individualy in different threads, the final output
            will be produced by joining the individual reduction results in the same order. Thus, the output can never have b before a
            
        D.
           It will print any of the following:
            _ab, _ba, _a_b,_b_a
           
         -------------------------------------------------------------------------------------
         We suggest you to run the following program and see how it works by studying its output:

            List<String> vals = Arrays.asList("a", "b", "c", "d", "e", "f", "g",
            "a", "b", "c", "d", "e", "f", "g",
            "a", "b", "c", "d", "e", "f", "g",
            "a", "b", "c", "d", "e", "f", "g");
            String join = vals.parallelStream()
            //peek shows how the elements are retrieved from the stream
                .peek(System.out::println)
                .reduce("_",
                    (a, b)->{
                    System.out.println("reducing "+a+" and "+b+" Thread: "
            +Thread.currentThread().getName());
                    return a.concat(b);
                    },
                    (a, b)->{
                    System.out.println("combining "+a+" and "+b+" Thread: "
            +Thread.currentThread().getName());
                    return a.concat(b);
                    }
                );
            System.out.println(join);
            
            The following is what it prints:
            
            d
            d
            b
            reducing _ and b Thread: ForkJoinPool.commonPool-worker-3
            c
            reducing _b and c Thread: ForkJoinPool.commonPool-worker-3
            b
            reducing _ and d Thread: ForkJoinPool.commonPool-worker-2
            reducing _ and d Thread: main
            e
            a
            reducing _ and b Thread: ForkJoinPool.commonPool-worker-1
            reducing _ and a Thread: ForkJoinPool.commonPool-worker-3
            reducing _d and e Thread: ForkJoinPool.commonPool-worker-2
            combining _a and _bc Thread: ForkJoinPool.commonPool-worker-3
            e
            d
            f
            c
            reducing _ and f Thread: ForkJoinPool.commonPool-worker-2
            reducing _ and d Thread: ForkJoinPool.commonPool-worker-3
            e
            reducing _d and e Thread: ForkJoinPool.commonPool-worker-3
            reducing _d and e Thread: main
            f
            g
            reducing _f and g Thread: ForkJoinPool.commonPool-worker-2
            reducing _b and c Thread: ForkJoinPool.commonPool-worker-1
            combining _de and _fg Thread: ForkJoinPool.commonPool-worker-2
            combining _a_bc and _de_fg Thread: ForkJoinPool.commonPool-worker-2
            f
            f
            reducing _ and f Thread: ForkJoinPool.commonPool-worker-3
            reducing _ and f Thread: ForkJoinPool.commonPool-worker-2
            reducing _ and f Thread: main
            g
            a
            reducing _f and g Thread: main
            g
            g
            reducing _f and g Thread: ForkJoinPool.commonPool-worker-2
            combining _de and _fg Thread: main
            reducing _ and a Thread: ForkJoinPool.commonPool-worker-1
            combining _a and _bc Thread: ForkJoinPool.commonPool-worker-1
            b
            d
            reducing _f and g Thread: ForkJoinPool.commonPool-worker-3
            reducing _ and d Thread: ForkJoinPool.commonPool-worker-2
            reducing _ and b Thread: main
            c
            b
            reducing _ and b Thread: ForkJoinPool.commonPool-worker-1
            c
            reducing _b and c Thread: main
            e
            combining _de and _fg Thread: ForkJoinPool.commonPool-worker-3
            reducing _d and e Thread: ForkJoinPool.commonPool-worker-2
            combining _de and _fg Thread: ForkJoinPool.commonPool-worker-2
            combining _a_bc and _de_fg Thread: ForkJoinPool.commonPool-worker-2
            a
            reducing _ and a Thread: ForkJoinPool.commonPool-worker-3
            a
            reducing _ and a Thread: main
            reducing _b and c Thread: ForkJoinPool.commonPool-worker-1
            combining _a and _bc Thread: ForkJoinPool.commonPool-worker-1
            combining _a_bc and _de_fg Thread: ForkJoinPool.commonPool-worker-1
            combining _a_bc_de_fg and _a_bc_de_fg Thread: ForkJoinPool.commonPool-worker-1
            combining _a and _bc Thread: main
            combining _a_bc and _de_fg Thread: main
            combining _a_bc_de_fg and _a_bc_de_fg Thread: main
            combining _a_bc_de_fg_a_bc_de_fg and _a_bc_de_fg_a_bc_de_fg Thread: main
            _a_bc_de_fg_a_bc_de_fg_a_bc_de_fg_a_bc_de_fg
        
          Correct(C)
      */
    public static void main(String... args){
        List<String> vals = Arrays.asList("a", "b");
        String join = vals.parallelStream()
            .reduce("_",
                (a, b)->a.concat(b)
                );
        System.out.println(join);
    }
}