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

### Which stream operations produce consistent results when operated on an ordered stream, regardless of whether it is serial or parallel? (Choose all that apply.)
*  A. limit()
*  B. skip()
*  C. findAny()
*  D. forEachOrdered()
*  E. forEach()
*  F. map()
*  G. findFirst()

The limit(), skip(), forEachOrdered(), and findFirst() methods produce the same results, regardless of whether the stream is serial or parallel.
There may be a performance cost with using them on a parallel stream, though, as the stream is forced into a single-threaded operation.
While the findAny() operation often returns the first result on a serial stream, it is permitted to return any result in the stream even on serial streams.
The forEach() and map() operations are executed concurrently in a parallel stream, possibly changing the expected results.

### Given the generic type String, the partitioningBy() collector creates a Map<Boolean, List<String>> when passed to collect() by default. When a downstream collector is passed to partitioningBy(), which return types can be created? (Choose all that apply.)
*  A. Map<boolean, List<String>>
* B. Map<Boolean, List<String>>
* C. Map<Boolean, Map<String>>
* D. Map<Boolean, Set<String>>
* E. Map<Long, TreeSet<String>>
* F. None of the above

Options A and C do not compile, because they are invalid generic declarations.
Primitives are not allowed as generics, and Map must have two generic type parameters.
Option E is incorrect because partitioning only gives a Boolean key.
Options B and D are correct because they return a Map with a Boolean key and a value type that can be customized to any Collection.

### Given the following code snippet, what can be inserted into the blank to ensure the stream operation is a concurrent reduction?
```java
    var zooFriends = Stream.of("lemur","ferret","monkey");
    var byNameLength = zooFriends.collect(
    Collectors.__________________(String::length));

```
*  A. combine
*  B. combineConcurrent
*  C. groupingByConcurrent
*  D. groupingBy
*  E. parallel
*  F. The code does not compile, regardless of what is placed in the blank.
*  G. None of the above.

Options A, B, and E are not valid methods and will not compile.
On the other hand, the code will compile if option C or D is placed in the blank, making option F incorrect, but it will not be a concurrent reduction.
To be a concurrent reduction, the stream itself must be parallel. For this reason, option G is correct.

### Which are true statements about terminal operations in a stream that runs successfully? (Choose all that apply.)
* A. At most, one terminal operation can exist in a stream pipeline.
* B. Terminal operations are a required part of the stream pipeline in order to get a result.
* C. Terminal operations have Stream as the return type.
* D. The peek() method is an example of a terminal operation.
* E. The referenced Stream may be used after calling a terminal operation.

Terminal operations are the final step in a stream pipeline. Exactly one is required, because it triggers the execution of the entire stream pipeline.
Therefore, options A and B are correct. Option C is true of intermediate operations, rather than terminal operations.
Option D is incorrect because peek() is an intermediate operation.
Finally, option E is incorrect because once a stream pipeline is run, the Stream is marked invalid.

### Which of the following are true given this declaration? (Choose all that apply.)
```java
  var is = IntStream.empty();
```

* A. is.average() returns the type int.
* B. is.average() returns the type OptionalInt.
* C. is.findAny() returns the type int.
* D. is.findAny() returns the type OptionalInt.
* E. is.sum() returns the type int.
* F. is.sum() returns the type OptionalInt.

The average() method returns an OptionalDouble since averages of any type can result in a fraction.
Therefore, options A and B are both incorrect.
The findAny() method returns an OptionalInt because there might not be any elements to find.
Therefore, option D is correct.
The sum() method returns an int rather than an OptionalInt because the sum of an empty list is zero.
Therefore, option E is correct.

### What best describes a reduction?
*  A. A source operation that creates a small value
*  B. An intermediate operation where it filters the stream it receives
*  C. An intermediate operation where it mathematically divides each element in the stream
*  D. A terminal operation where a single value is generated by reading each element in the prior step in a stream pipeline
*  E. A terminal operation where one element is returned from the prior step in a stream pipeline without reading all the elements

The word reduction is used with streams for a terminal operation,
so options A, B, and C are incorrect.
Option E describes a valid terminal operation like anyMatch(), but is not a reduction.
Option D is correct because a reduction has to look at each element in the stream to determine the result.

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
