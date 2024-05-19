#### Which of the following method(s) of java.util.stream.Stream interface is/are used for reduction?
* A. filter
--------------------------
filter(Predicate<? super T> predicate) method returns a stream consisting of the elements of this stream
that match the given predicate.
However, it is not a reduction operation because it does not combine the elements to produce one value

* B. reduce

    Stream has the following three reduce methods:
-----------------------------------------
    ```
     Optional<T> reduce(BinaryOperator<T> accumulator)
    ```
   
Performs a reduction on the elements of this stream,
using an associative accumulation function, and returns an Optional describing the reduced value, if any.

```
  T reduce(T identity, BinaryOperator<T> accumulator)
```

Performs a reduction on the elements of this stream, using the provided identity value and an associative accumulation function,
and returns the reduced value.

```
<U> U reduce(U identity, BiFunction<U,? super T,U> accumulator,
    BinaryOperator<U> combiner)
```
Performs a reduction on the elements of this stream, using the provided identity, accumulation and combining functions.


* C. sum

This is a valid reduction operation but it is not in java.util.stream.Stream interface.
Methods to sum up the numbers in a stream are available in specialized Stream interfaces such an IntStream, LongStream, and DoubleStream

* D. max

min and max are valid reduction operations. The Stream version of these methods take a Comparator as an argument,
while the versions in specialized streams such as IntStream and DoubleStream do not take any argument.

* F add
There is no such method in Stream interface

--------------------------------

A reduction operation (also called a fold) takes a sequence of input elements and combines them into
a single summary result by repeated application of a combining operation, such as finding the sum or maximum of a set of numbers,
or accumulating elements into a list. The streams classes have multiple forms of general reduction operations,
called reduce() and collect(), as well as multiple specialized reduction forms such as sum(), max(), or count().

For example, you can combine elements of a stream to express complicated queries
such as "Calculate the sum of all sales in a given list of transactions" or "Find the highest
sales transaction in a list of transactions" using reduction operations.
They are called as such because such queries combine all the elements in the stream repeatedly
to produce a single value such as a Double. In other words,  a stream is reduced to a value by applying these operations.
Correct(B, D)