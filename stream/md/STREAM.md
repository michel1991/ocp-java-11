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