##### When working with a Stream˂String˃, which of these types can be returned
##### from the collect() terminal operator by passing arguments to Collectors.groupingBy()?
* A. Only Map<Boolean, HashSet<String>>
* B. Only Map<Integer, List˂String>>
* C. Both Map<Boolean, HashSet˂String>> and Map<Integer, List˂String>>
* D. Only List<Integer>
* E. Only List<String>
* F. Both List<Integer> and List<String>

The groupingBy() collector always returns a Map (or a specific implementation class of Map),
so options D, E, and F are incorrect. The other two are definitely possible.
To get one, you can group using a Function that returns an Integer
such as s.collect(groupingBy(String::length)). To get the other,
you need to group using a Function that returns a Boolean and specify the type,
such as s.collect(groupingBy(String::isEmpty, toCollection(HashSet::new))).
Therefore, option C is correct.