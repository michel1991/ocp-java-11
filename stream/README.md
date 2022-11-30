# When performing a parallel reduction, which of the following would make a valid BinaryOperator<Integer> accumulator argument to the reduce() stream operation? Assume p is a valid ArrayList<Integer> instance. (Choose all that apply.)
    A. (a,b) -> 10
    B. (a,b) -> a-b
    C. (a,b) -> a/b
    D. (a,b) -> {p.add(a); return 1;}
    E. (a,b) -> a+b
    F. (a,b) -> {p.add(a); return a;}

To be a valid accumulator in a parallel reduction, the lambda expression must be associative such that ((a op b) op c) is equal to (a op (b op c)).
For these reasons, options A and E are correct, while options B and C are not correct.
Options D and F are incorrect because the lambda expression must also be stateless.

# Which stream operations produce consistent results when operated on an ordered stream, regardless of whether it is serial or parallel? (Choose all that apply.)
A. limit()
B. skip()
C. findAny()
D. forEachOrdered()
E. forEach()
F. map()
G. findFirst()

The limit(), skip(), forEachOrdered(), and findFirst() methods produce the same results, regardless of whether the stream is serial or parallel.
There may be a performance cost with using them on a parallel stream, though, as the stream is forced into a single-threaded operation.
While the findAny() operation often returns the first result on a serial stream, it is permitted to return any result in the stream even on serial streams.
The forEach() and map() operations are executed concurrently in a parallel stream, possibly changing the expected results.