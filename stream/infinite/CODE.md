#### Which can fill in the blank to have the code print true?

``` java
    var stream = Stream.iterate(1, i -˃ i);
    var b = stream.________(i -˃ i ˃ 5);
    System.out.println(b);

```
* A. anyMatch
* B. allMatch
* C. noneMatch
* D. None of the above

This code generates an infinite stream of the number 1.
The Predicate checks if the element is greater than 5.
This will never be true. With allMatch(),
the stream pipeline ends after checking the first element.
It doesn’t match, so the code prints false.
Both anyMatch() and noneMatch() keep checking and don’t find any matches.
However, they don’t know if a future stream element will be different,
so the code executes infinitely until the process is terminated. Therefore,
option D is correct.
