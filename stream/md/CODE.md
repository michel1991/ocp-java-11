##### Fill in the blank so this code outputs three lines:

``` java
    var list = new ArrayList˂String˃();
    list.add("Atlanta");
    list.add("Chicago");
    list.add("New York");
    list.stream()
    .filter(_____________)
    .forEach(System.out::println);

```
* A. String::isEmpty
* B. ! String::isEmpty
* C. String::! isEmpty
* D. String::isNotEmpty
* E. None of the above

Option A is the only one of the three options to compile.
However, it results in no lines being output since
none of the three strings is empty.
Options B and C do not even compile
because a method reference cannot have an operator next to it.
Option D does not compile because String does not have an isNotEmpty() method.
Therefore, option E is correct.

#### Which fills in the blank so the code is guaranteed to print 1?

```java
    var stream = Stream.of(1, 2, 3);
    System.out.println(stream.________);
```
* A. anyMatch()
* B. findAny()
* C. first()
* D. min()
* E. None of the above

Option A is incorrect because anyMatch() returns a boolean.
Option B is incorrect because findAny() might not return 1.
The result could be any of the three numbers.
Option C is incorrect because there is no first() method available as a terminal operation.
Option D is tempting because there is a min() method.
However, since we are working with a Stream (not a primitive stream like IntStream),
this method requires a Comparator as a parameter. Therefore, option E is the answer.
