package modulars;
// package animal.insect.lookup; (initial in test)
//import animal.insect.api.bugs.Bug; (initial in test)
import java.util.function.*;
import java.util.stream.*;
import java.util.*;
import java.util.ServiceLoader.Provider;

/**
   Suppose you have the following class in a module named animal.insect.lookup,
   the service provider interface from question 56,
   and the service provider from question 57.
   What needs to be included in the module-info file besides
   an exports directive for it to be a service locator? (Choose two.)
   
    A. provides animal.insect.lookup;
    B. provides animal.insect.lookup.InsectFinder;
    C. requires animal.insect.api.bugs;
    D. requires animal.insect.api.Bug;
    E. uses animal.insect.api.bugs;
    F. uses animal.insect.api.bugs.Bug;
    
    This module is a service locator. It needs three directives: exports, requires, and uses.
    The requires directive specifies the module it depends on, which is option C.
    The uses directive specifies the service provider interface it references, which is option F.
 */
class Bug{
    
}

public class InsectFinderServiceLoader {
    public static List<Bug> findAllBugs() {
        return ServiceLoader.load(Bug.class)
         .stream()
         .map(ServiceLoader.Provider::get)
         .collect(Collectors.toList());
    }
 
}