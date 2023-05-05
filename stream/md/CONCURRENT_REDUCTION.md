##### Given the following code snippet, what can be inserted
##### into the blank to ensure the stream operation is a concurrent reduction?
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
On the other hand, the code will compile if option C or D is placed in the blank,
making option F incorrect, but it will not be a concurrent reduction.
To be a concurrent reduction, the stream itself must be parallel.
For this reason, option G is correct.

#### Which of the following statements about performing a concurrent reduction are correct? (Choose two.)
* A. If a collector is used, it must have the unordered characteristic.
* B. The stream must operate on thread-safe collections.
* C. If the reduce() method is used with a lambda expression, then it should be stateful.
* D. The stream must inherit ParallelStream<T>.
* E. The stream must be parallel.
* F. If a collector is used, it must have the concurrent characteristic.

To perform a concurrent reduction, the stream or the collector must be unordered.
Since it is possible to use an ordered collector with an unordered stream and
achieve a parallel reduction, option A is incorrect.
Option B is also incorrect.
While having a thread-safe collection is preferred, it is not required.
Stateful lambda expressions should be avoided, whether the stream is serial or parallel,
making option C incorrect.
Option D is incorrect as there is no class/interface
within the JDK called ParallelStream.
Options E and F are correct statements about performing parallel reductions.