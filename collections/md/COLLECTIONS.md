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

### You are designing a class that will cache objects. It should be able to store
### and retrieve an object when supplied with an object identifier.
### Further, this class should work by tracking the "last accessed times" of the objects.
### Thus, if its capacity is full, it should remove only the object that hasn't been accessed the longest.
### Which collection class would you use to store the objects?

* A. HashSet
* B. ArrayList
* C. LinkedHashMap
* D. LinkedList
* E. TreeMap

The LinkedHashMap class maintains the elements in the order of their insertion time. This property can be used to build the required cache as follows:
1. Insert the key-value pairs as you do normally where key will be the object identifier and value will be the object to be cached.
2. When a key is requested, remove it from the LinkedHashMap and then insert it again. This will make sure that this pair marked as inserted latest.
3. If the capacity is full, remove the first element.

Note that you cannot simply insert the key-value again (without first removing it) because a reinsertion
operation does not affect the position of the pair.
(Correct C)


