#### Which of these statements concerning the use
#### of collection interfaces of the Java standard class library are true?

* A. None of the standard collection classes are thread safe.
    Although Vector and Hashtable have been out of favor for quite a while,
    they may still be used when you need synchronized collections. Note that java.util.Vector
    implements java.util.List and java.util.Hashtable implements java.util.Map.
    Most new code uses ArrayList and HashMap, when synchronization is not needed,
    and CopyOnWriteArrayList and ConcurrentHashMap when thread safe concurrent behavior is needed.
* B. Class HashSet implements SortedSet.
    No, it does not.
* C. Collection classes implementing List cannot have duplicate elements.
    List is meant for ordering of elements. Duplicates are allowed.
* D. ArrayList can only accommodate a fixed number of elements.
    It grows as more elements are added.
* E. Some operations may throw an UnsupportedOperationException.

Some operations may throw an UnsupportedOperationException.
This exception type is unchecked, and code calling these operations
is not required to explicitly handle exceptions of this type
(Correct E)

