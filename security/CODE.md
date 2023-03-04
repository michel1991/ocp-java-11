### The following code prints false. What is true about the clone() method?
``` java
    Wombats original = new Wombats();
    original.names = new ArrayList<>();
    Wombats cloned = (Wombats) original.clone();
    System.out.println(original.getNames() == cloned.getNames());
```
* A. It creates a deep copy.
* B. It creates a narrow copy.
* C. It creates a shallow copy.
* D. It creates a wide copy.

A shallow copy does not create copies of the nested objects, making option C incorrect.
Options B and D are incorrect because narrow and wide copies are not terms.
Option A is the answer because a deep copy does copy the nested objects.
In this case, a new List is created in cloned, containing the same contents and making it a different object than the List in original.

### What is this class an example of?
```
import java.util.*;
public class Nightclub {
    private List˂String˃ approved = // IMPLEMENTATION OMITTED
    private List˂String˃ rejected = // IMPLEMENTATION OMITTED
    public booleancheckAccess(String name) {
        var grantAccess =approved.contains(name)
        ||rejected.contains(name);
        return grantAccess;
    }}
```

* A. Turquoiselist
* B. Whitelist
* C. Orangelist
* D. Blacklist
* E. Both blacklist and whitelist
* F. None of the above

The method only grants someone access if they appear in either the approved or rejected list.
The combined data set forms a conceptual whitelist, making option B correct.
The variable names chosen were meant to be tricky.
If the code was checked to block people from the rejected list as well, then it would be both a whitelist and blacklist implementation.