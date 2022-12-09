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
