### Which of the following elements is/are a must in a stream pipeline?

* A. a source
* B. an intermediate operation
* C. a terminal operation
* D. a reduction operation
* E. a method reference
* F. a lambda expression

As per https://docs.oracle.com/javase/tutorial/collections/streams/:
A pipeline contains the following components:
A source: This could be a collection, an array, a generator function,
or an I/O channel. In this example, the source is the collection roster.
Zero or more intermediate operations: An intermediate operation, such as filter, produces a new stream.
A terminal operation.

(Correct A, C)
