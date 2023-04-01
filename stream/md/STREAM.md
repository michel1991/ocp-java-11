### What is the best example of lazy evaluation?
*  A. The pipeline can execute before seeing all the data.
*  B. The pipeline does not begin until the terminal operation is executed.
*  C. The pipeline executes all operations as quickly as possible.
*  D. The pipeline loses data.
*  E. The pipeline takes a nap.

Lazy evaluation delays execution until it is needed.
Option B is the only one that matches this requirement.
While option A is true, this can be done without lazy evaluation.
Option C requires parallelization rather than deferred execution.
Option D is incorrect as data loss is bad. Finally, pipelines are run by the computer, which does not get tired.

### Which are true statements? (Choose two.)
*  A. A source cannot return an infinite stream.
*  B. A source may return an infinite stream.
*  C. A source must return an infinite stream.
*  D. An intermediate operation cannot return an infinite stream.
*  E. An intermediate operation may return an infinite stream.
* F. An intermediate operation must return an infinite stream.

The generate() and iterate() sources return an infinite stream.
Further, the of() source returns a finite stream, which shows option B is one of the answers.
The limit() intermediate operation returns a finite stream.
When given an infinite stream, the map() intermediate operations keeps the infinite stream,
which means option E is the other correct answer.

#### Which statement about a source in a Stream is true?
*  A. The source is mandatory in a stream pipeline.
*  B. The source is only allowed to return primitives.
*  C. The source must be retrieved by calling the stream() method.
*  D. The source must return a finite number of elements.
*  E. None of the above.

Option A is correct as the source and terminal operation
are mandatory parts of a stream pipeline.
Option B is incorrect because a Stream must return objects.
Specialized interfaces like IntStream are needed to return primitives.
Option C is incorrect because Stream has methods
such as of() and iterate() that return a Stream.
Option D is incorrect because infinite streams are possible.

### Which operation can occur more than once in a stream pipeline?
*  A. Origin
*  B. Sink
*  C. Source
*  D. Intermediate operation
*  E. Terminal operation
*  F. None of the above

Options A and B are incorrect because they
are not operations in a stream pipeline.
A source and the terminal operation are required parts
of a stream pipeline and must occur exactly once.
The intermediate operation is optional.
It can appear zero or more times. Since more
than once falls within zero or more, option D is correct.

#### In a stream pipeline, which can return a value other than a Stream?
* A. Source
* B. Intermediate operation
* C. Terminal operation
* D. None of the above

The result of the source and any intermediate operations
are chained and eventually passed to the terminal operation.
The terminal operation is where a nonstream result is generated,
making option C correct.

##### What is a common reason for a stream pipeline not to run?
* A. The source doesn’t generate any items.
* B. There are no intermediate operations.
* C. The terminal operation is missing.
* D. The version of Java is too old.
* E. None of the above.

Option A is incorrect because a pipeline still runs if
the source doesn’t generate any items and the rest of the pipeline is correct.
Granted, some of the operations have nothing to do,
but control still passes to the terminal operation.
Option B is incorrect because intermediate operations are optional.
Option C is the answer. The terminal operation triggers the pipeline to run.
Option D is incorrect because the code would not compile at all if the version of Java were too old.

##### Given an IntStream, which method would you use to obtain an equivalent parallel Stream˂T˃?
* A. parallel()
* B. parallelStream()
* C. parallels()
* D. getParallel()
* E. getParallelStream()
* F. None of the above

Trick question! The correct method to obtain an equivalent parallel stream
of an existing IntStream is parallel(),
but for an IntStream this returns another IntStream, not a generic Stream˂T˃. For this reason, option F is correct.

#### Given a Stream<T>, which method would you use to obtain an equivalent parallel Stream<T>?
* A. getParallelStream()
* B. parallelStream()
* C. parallel()
* D. getParallel()
* E. parallels()
* F. None of the above

The correct method to obtain an equivalent parallel stream of an existing stream is parallel(),
which is inherited by any class that implements BaseStream<T>. For this reason, option C is correct.

##### Which statements about the findFirst() method applied to a stream are correct? (Choose three.)
* A. It always returns the first element on an ordered serial stream.
* B. It may return any element on an ordered serial stream.
* C. It always returns the first element on an unordered stream.
* D. It may return any element on an unordered stream.
* E. It always returns the first element on an ordered parallel stream.
* F. It may return any element on an ordered parallel stream.

The findFirst() method always returns the first element on an ordered stream,
regardless if it is serial or parallel, making options A and E correct.
Option D is also correct, as it is free to return any element if the stream is unordered.
Option C is actually invalid, as an unordered stream does not have a first element.
See https://stackoverflow.com/questions/21350195/stream-ordered-unordered-problems

##### What is the minimum number of intermediate operations
##### that can fill in each box [M, N, O, P] to
#### have the pipeline complete given any intermediate operation?
* A. [0, 0, 0, 1]
* B. [0, 0, 1, 0]
* C. [0, 0, 1, 1]
* D. [1, 1, 0, 1]
* E. [1, 1 ,1, 0]
* F. [1, 1, 1, 1]

[image](images/source_intermediate_terminal_operation.png)
Since the first two rows are already finite streams,
boxes M and N do not require an intermediate operation to complete,
so options D, E, and F are incorrect. Box P does not need an intermediate operation either,
since findFirst() will cause the stream to terminate, making options A and C incorrect.
Box O does need to be filled in with code such as limit(1). This allows the code to terminate, and option B is the answer.

