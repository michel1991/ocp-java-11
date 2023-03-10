##### Suppose you have the following class in a module named animal.insect.lookup,
##### the service provider interface from question 56, and the service provider from question 57.
##### What needs to be included in the module-info file besides an exports directive for it to be a service locator? (Choose two.)


```java
    package animal.insect.lookup;

    import animal.insect.api.bugs.Bug;
    import java.util.List;
    import java.util.ServiceLoader;
    import java.util.stream.Collectors;

    public class InsectFinder {
        public static List˂Bug˃ findAllBugs() {
            return ServiceLoader.load(Bug.class)
            .stream()
            .map(ServiceLoader.Provider::get)
            .collect(Collectors.toList());
        }
    }

```
* A. provides animal.insect.lookup;
*  B. provides animal.insect.lookup.InsectFinder;
*  C. requires animal.insect.api.bugs;
*  D. requires animal.insect.api.Bug;
*  E. uses animal.insect.api.bugs;
*  F. uses animal.insect.api.bugs.Bug;

This module is a service locator. It needs three directives: exports, requires, and uses.
The requires directive specifies the module it depends on, which is option C.
The uses directive specifies the service provider interface it references, which is option F.

### Suppose you have the following class in a module named animal.insect.impl. Which two most likely go in the module-info of the service locator? (Choose two.)

```java
    package animal.insect.impl;

    import animal.insect.api.bugs.Bug;

    public class Worm implements Bug {
        @Override
        public int crawl() {
            return 1;
        }
    }
```

* A. requires animal.insect.api.bugs;
* B. requires animal.insect.api.bugs.Bug;
* C. requires animal.insect.impl;
* D. uses animal.insect.api.bugs;
* E. uses animal.insect.api.bugs.Bug;
* F. uses animal.insect.api.bugs.Bug with animal.insect.impl.Worm;

This question is tricky because the service provider code is shown,
but the question asks about the service locator, and you need to infer information about the service provider interface.
The requires directive is option A due to process of elimination.
Option B is incorrect because the requires directive references a module name rather than an interface.
Option C is incorrect because we need the service provider interface module, and it refers to the service provider module.
Option E is easier, since the uses directive works with an interface name.