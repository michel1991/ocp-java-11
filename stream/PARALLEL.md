### When performing a parallel reduction, which of the following would make a valid BinaryOperator<Integer> accumulator argument to the reduce() stream operation? Assume p is a valid ArrayList<Integer> instance. (Choose all that apply.)
    *  A. (a,b) -> 10
    *  B. (a,b) -> a-b
    *  C. (a,b) -> a/b
    *  D. (a,b) -> {p.add(a); return 1;}
    *  E. (a,b) -> a+b
    *  F. (a,b) -> {p.add(a); return a;}

    To be a valid accumulator in a parallel reduction, the lambda expression must be associative such that ((a op b) op c) is equal to (a op (b op c)).
    For these reasons, options A and E are correct, while options B and C are not correct.
    Options D and F are incorrect because the lambda expression must also be stateless.

   ### What are the three requirements for performing a parallel reduction with the collect() method, which takes a Collector argument. (Choose three.)
   *  A. The Collector argument is marked concurrent.
   *  B. The elements of the stream implement the Comparable interface.
   *  C. The stream is parallel.
   *  D. The stream is thread-safe.
   *  E. The stream or Collector is marked unordered.
   *  F. The stream is not a primitive stream.

    Options A, C, and E are the precise requirements for Java to perform a concurrent reduction using the collect() method,
    which takes a Collector argument.
    Recall from your studies that a Collector is considered concurrent and unordered
    if it has the Collector.Characteristics enum values CONCURRENT and UNORDERED, respectively.
    The rest of the options are not required for a parallel reduction.