##### When performing a parallel reduction, which of the following would
##### make a valid BinaryOperator<Integer> accumulator argument to the reduce()
##### stream operation? Assume p is a valid ArrayList<Integer> instance. (Choose all that apply.)
*  A. (a,b) -> 10
*  B. (a,b) -> a-b
*  C. (a,b) -> a/b
*  D. (a,b) -> {p.add(a); return 1;}
*  E. (a,b) -> a+b
*  F. (a,b) -> {p.add(a); return a;}

To be a valid accumulator in a parallel reduction,
the lambda expression must be associative such that ((a op b) op c) is equal to (a op (b op c)).
For these reasons, options A and E are correct, while options B and C are not correct.
Options D and F are incorrect because the lambda expression must also be stateless.

##### What are the three requirements for performing a parallel reduction with the collect() method,
##### which takes a Collector argument. (Choose three.)
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

##### Which statements about using a parallel stream instead of a serial stream are correct? (Choose three.)
* A. The number of threads used is guaranteed to be higher.
* B. It requires a stateful lambda expression.
* C. The stream operation may execute faster.
* D. The stream operation may execute slower.
* E. The result of the stream operation will be the same.
* F. The result of the stream operation may change.

Using a parallel stream does not guarantee concurrent execution
or a specific number of threads, making option A incorrect.
Option B is also incorrect, as stateful lambda expressions should
be avoided with all streams, serial or parallel.
In fact, if a stateful lambda expression is used,
the result of the stream may change, making option F correct and option E incorrect.
Option C is correct, as a parallel stream may improve performance.
Option D is also correct, though, as a parallel stream may add extra overhead
to a stream that is forced into a serial operation, such as when the findFirst() method is called.

#### Given an IntStream, which method would you use to obtain an equivalent parallel IntStream?
* A. parallelStream()
* B. parallels()
* C. getParallelStream()
* D. parallel()
* E. getParallel()
* F. None of the above

The correct method to obtain an equivalent parallel stream of an existing stream is parallel(),
which is inherited by any class that implements BaseStream<T>
including the primitive streams. For this reason, option D is correct.

##### Which statements about applying forEachOrdered()
##### to a parallel ordered stream instead of using forEach() are correct? (Choose two.)
*  A. The operation will likely be faster.
*  B. The operation will likely be slower.
*  C. There is no expected change in performance.
*  D. It forces some stream operations in the pipeline to be performed in a serial manner.
*  E. It forces all stream operations in the pipeline to be performed in a serial manner.
*  F. All stream operations will continue to be performed in a parallel manner.

Applying forEachOrdered() to a parallel stream forces
the terminal operation to be performed in a single-threaded, rather than parallel, manner.
For this reason, it is likely that it will be slower, making option B correct.
Intermediate operations can still take advantage of parallel processing,
since forEachOrdered() is only applied at the end of the pipeline. For this reason, option D is correct.

##### Given a parallel Stream<T>, which method
##### would you use to obtain an equivalent serial Stream<T>?

* A. unordered()
* B. reduce()
* C. concat()
* D. stream()
* E. boxed()
* F. None of the above

The correct method to obtain an equivalent sequential stream of an existing
stream is sequential(), which is inherited by any class
that implements BaseStream<T>.
Since this isn’t an option, option F is correct.
Note that unordered() creates a stream
that can be evaluated in any order,
but it can still be processed in a sequential or parallel stream.
