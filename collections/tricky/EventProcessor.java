package tricky;
import java.util.*;

/**
 * Given:
    A. super.processEvents(events.values());
    events.values() method of Map returns a Collection containing all the values containied in that Map.
    
    B. super.processEvents(events);
    Remember that Map and Collection are unrelated interfaces, so, you cannot pass a Map where a Collection is required.
    
    C. events.forEach( (k, v)->processEvents(v));
    The lambda expression being passed to forEach is syntactically correct. However, the type of v is Object
    and there is no processEvents method available that can accept an Object.
    
    D. processEvents(events.values());
    Observe that processEvents method of MapEventProcessor does not override the processEvents
    of EventProcessor (their parameters are different). So, there is no need to use super. syntax to invoke EventProcessor's
    processEvent method as done in option 1.
    
    E. processEvents(new List(events.values));
    A List is indeed a Collection but List is an interface. It cannot be instantiate
    
    Correct(A, D)
 */
public class EventProcessor{
    public void processEvents(Collection c){
        c.forEach(o -> System.out.println(o));
    }
}

class MapEventProcessor extends EventProcessor{
    public void processEvents(Map events){
       // *INSERT CODE HERE*
        super.processEvents(events.values());
        processEvents(events.values());
    }
}
