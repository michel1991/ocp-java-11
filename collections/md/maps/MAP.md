#### Which of these methods are defined in the Map interface?
* A. contains(Object o)
* B. addAll(Collection c)
* C. remove(Object o)
* D. values( )
* E. toArray( )

The Map interface defines the methods remove(Object) and values().
It does not define methods contains(), addAll() and toArray().
Methods with these names are defined in the Collection interface,
but Map does not extend from Collection.

#### Identify the concrete classes that can be used to store key - value pairs?

* A. java.util.HashMap
* B. java.util.Set
* C. java.util.SortedSet
* D. java.util.Map
Map is an interface and not a class.
* E. java.util.SortedMap
Note that SortedMap is an interface and not a class.
* F. java.util.TreeMap
(Correct A, F)

### Which interfaces does java.util.NavigableMap extend directly or indirectly?

* A. java.util.SortedSet
* B. java.util.Map
* C. java.util.SortedMap
* D. java.util.TreeMap
    TreeMap is a class that implements NavigableMap interface. ConcurrentSkipListMap is the other such class.
* E java.util.List

A NavigableMap is a SortedMap (which in turn extends Map) extended with navigation methods returning
the closest matches for given search targets. Methods lowerEntry, floorEntry, ceilingEntry,
and higherEntry return Map. Entry objects associated with keys respectively less than, less than or equal,
greater than or equal, and greater than a given key, returning null if there is no such key.
Similarly, methods lowerKey, floorKey, ceilingKey, and higherKey return only the associated keys.

All of these methods are designed for locating, not traversing, entries.

A NavigableMap may be accessed and traversed in either ascending or descending key order.
The descendingMap method returns a view of the map with the senses of all relational and directional
methods inverted. The performance of ascending operations and views is likely to be faster than that of descending ones.
Methods subMap, headMap, and tailMap differ from the like-named SortedMap
methods in accepting additional arguments describing whether lower
and upper bounds are inclusive versus exclusive. Submaps
of any NavigableMap must implement the NavigableMap interface.

This interface additionally defines methods firstEntry, pollFirstEntry, lastEntry,
and pollLastEntry that return and/or remove the least and greatest mappings, if any exist, else returning null.

Implementations of entry-returning methods are expected to return Map.Entry
pairs representing snapshots of mappings at the time they were produced,
and thus generally do not support the optional Entry.setValue method. Note however
that it is possible to change mappings in the associated map using method put.

Methods subMap(K, K), headMap(K), and tailMap(K) are specified to return SortedMap
to allow existing implementations of SortedMap to be compatibly retrofitted to implement NavigableMap,
but extensions and implementations of this interface are encouraged
to override these methods to return NavigableMap. Similarly

(Correct B, C)

### Your application requires to store name value pairs such that the order
### of entries returned while iterating through the structure is deterministic.
### In other words, if you iterate over the same structure twice,
### the order of elements returned in both the iterations will be the same. Which of the following classes would you use?

* A. HashMap
    HashMap does not guarantee to return the elements in a pre-determined order while iterating.
* B. LinkedHashSet
    It is a Set and not a Map so it cannot store Name-Value pairs.
* C. Hashtable
    Hashtable does not guarantee to return the elements in a pre-determined order while iterating.
* D. LinkedHashMap
    It is a linked list implementation of the Map interface, with predictable iteration order.
    This implementation differs from HashMap in that it maintains a doubly-linked
    list running through all of its entries. This linked list defines the iteration ordering,
    which is normally the order in which keys were inserted into the map (insertion-order).
    Note that insertion order is not affected if a key is re-inserted into the map.
* E. TreeMap
    It always returns the entries in sorted order.
(Correct D, E)

#### Your application needs to load a set of key value pairs from a database table which never changes.
### Multiple threads need to access this information but none of them changes it.
### Which class would be the most appropriate to store such data if the values need not be kept in a sorted fashion?

* A. Hashtable
* B. HashMap
* C. Set
* D. TreeMap
* E List

You should know that all Hashtable methods are synchronized and this compromises its performance for simultaneous reads.
Since no thread modifies the data, it is not efficient to use a Hashtable.
A HashMap is a perfect choice because its methods are not synchronized and
so it allows efficient multiple reads. TreeMap is used to keep the keys sorted which makes
it a little bit slower than HashMap.

Set and List can't be used since we need to store Key-value pairs.
(Correct is B)



