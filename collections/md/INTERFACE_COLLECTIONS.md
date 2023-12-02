### Which of these interfaces are in the Java Collections framework?

* A. Set
* B. Union
    There is nothing like Union in Java.
* C. BitSet
    It has nothing to do with Collections.
* D. Collection
* E. Map
* F. NavigableMap

    This is not required for the exam but in case you want to know what a BitSet is:
    
    public class BitSet extends Object implements Cloneable, Serializable
    
    This class implements a vector of bits that grows as needed.
    Each component of the bit set has a boolean value.
    The bits of a BitSet are indexed by nonnegative integers.
    Individual indexed bits can be examined, set, or cleared.
    One BitSet may be used to modify the contents of another BitSet through logical AND,
    logical inclusive OR, and logical exclusive OR operations.
    
    By default, all bits in the set initially have the value false.
    
    Every bit set has a current size,
    which is the number of bits of space currently in use by the bit set.
    Note that the size is related to the implementation of a bit set,
    so it may change with implementation.
    The length of a bit set relates to logical length
    of a bit set and is defined independently of implementation.
(Correct A, D, E, F)

### Which is/are the root interface(s) for all collection related interfaces?

* A. BaseCollection
* B. Collection
* C. List
* D. Set
* E. Map

All name-value maps such as java.util.HashMap and java.util.TreeMap
implement java.util.Map and all collections such as java.util.ArrayList,
and java.util.LinkedList implement java.util.Collection.
(Correct B, E)