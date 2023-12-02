#### Which of the following methods are available in java.util.concurrent.ConcurrentMap in addition to the methods provided by java.util.Map?

* A. boolean remove(Object key, Object value)
    Note that Java 8 has added this method as a default method in the Map interface.

    Removes the entry for a key only if currently mapped to a given value. This is equivalent to
``` txt
    if (map.containsKey(key) && map.get(key).equals(value)) {
        map.remove(key);
        return true;
    } else return false;
```
    except that the action is performed atomically.

* B. boolean remove(Object key)
    The remove method returns Object not boolean.
    
* C. V putIfAbsent(K key, V value)
    Note that Java 8 has added this method as default method in Map interface.
    
    If the specified key is not already associated with a value,
    this method associates it with the given value. This is equivalent to

```txt
    if (!map.containsKey(key))
    return map.put(key, value);
    else
    return map.get(key);
```

    except that the action is performed atomically.
    Returns:
    the previous value associated with the specified key, or null if there was no mapping for the key.
    (A null return can also indicate that the map previously associated null with the key,
        if the implementation supports null values.)
        
* D. Object removeIfPresent(Object key)
    There is no such method in Map or in ConcurrentMap.
    
* E. boolean replace(K key, V oldValue, V newValue)
    Note that Java 8 has added this method as default method in Map interface.
    Replaces the entry for a key only if currently mapped to a given value. This is equivalent to
```
    if (map.containsKey(key) && map.get(key).equals(oldValue)) {
        map.put(key, newValue);
        return true;
    } else return false;
``` 

    except that the action is performed atomically.

    Returns: true if the value was replaced

* F. None of the above.

ConcurrentMap is important for the exam.
You should go the API description for this interface. In short:

It is a Map providing atomic versions of putIfAbsent, remove, and replace methods.
Memory consistency effects: As with other concurrent collections,
actions in a thread prior to placing an object into a ConcurrentMap
as a key or value happen-before actions subsequent
to the access or removal of that object from the ConcurrentMap in another thread.
You may want to check out the free video by Dr.
Sean Kennedy explaining this question: https://youtu.be/i6z31PUk0Bg
(Correct F)
    