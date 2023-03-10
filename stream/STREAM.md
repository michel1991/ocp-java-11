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