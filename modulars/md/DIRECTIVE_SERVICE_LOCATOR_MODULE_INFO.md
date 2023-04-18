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