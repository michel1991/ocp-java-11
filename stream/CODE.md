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