package collections.tricky.maps.hashMap;
import java.util.*;

/**
  Consider the standard 'put' method of class HashMap.

   public Object put(Object key, Object value);
   
    A. It always returns null.
    B. It always returns value ( i.e. the 2nd parameter).
    C. Neither of key or value can be null otherwise a NullPointerException is thrown.
    D. Key cannot be null but value may be null.
    E. It may throw a DuplicateKeyException.
        There is no such exception!
    F. None of these.
    
   -----------------------------------------------
       If a HashMap already contains an entry for the specified key,
       the element already in this dictionary for that key is returned after modifying the entry to contain the new element.
       There no such exception as DuplicateKeyException.
    
     HashMap allows both - the key and the value to  be null. But Hashtable does not.
    Correct(F)

 */
public class PustMethod {
}