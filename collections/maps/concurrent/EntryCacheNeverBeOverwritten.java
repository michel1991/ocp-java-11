package collections.maps.concurrent;
import java.util.concurrent.*;

public class EntryCacheNeverBeOverwritten {
    /**
      Given:
        ConcurrentMap<String, Object> cache = new ConcurrentHashMap<>();
        
        Which of the given statements are correct about the following code fragment:
        
        if(!cache.containsKey(key)) cache.put(key, value);
        
        (Assume that key and value refer to appropriate objects.)
        
        A. This will ensure that an entry in cache will never be overwritten.
                While it looks like it will prevent overwriting an entry, but it is not so.
                 This is because there is no indication that the given line of code obtains an exclusive lock
                 on the cache object and therefore the containsKey and put operation are not atomic.
                 It is possible that while one thread has finished calling containsKey and is about to call put,
                 another thread puts an entry in the map. Thus, the first thread will overwrite the entry.
                 
        B. To ensure that an entry in cache must never be overwritten, this statement should be replaced with:
            cache.putIfAbsent(key, value);
            This method internally checks for the presence of the key and then put the key-value if it not already present in the map.
            Both the operations (i.e. the check and put) are combined in a single method call so that they can be done atomically.
           
         C. To ensure that an entry in cache must never be overwritten, this statement should be replaced with: cache.putAtomic(key, value);
            There is no such method.
            
         D. To ensure that an entry in cache must never be overwritten, this statement should be enclosed in a synchronized block that synchronizes on "this".
            Since there are two independent operations being performed on the object referred to by cache,
            you need to synchronize on the same object referred to by cache. Synchronizing on this may not help if
            the same cache object is exposed in any other class.
            synchronized(cache){
                ...
            } is a possible solution assuming that all access to the cache object is through a synchronized block synchronizing on the same object.
            
          ---------------
          Correct (B)

     */
    public static void main(String... args){
        ConcurrentMap<String, Object> cache = new ConcurrentHashMap<>();
        var key= "name"; var value ="jobs";
        cache.putIfAbsent(key, value);
    }
}