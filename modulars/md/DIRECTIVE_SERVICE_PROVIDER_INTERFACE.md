### Suppose you have the following interface in a module named animal.insect.api. What needs to be included in the module-info file for it to be a service provider interface?

```java
    package animal.insect.api.bugs;

    public interface Bug {
        int crawl();
    }
```

*  A. exports animal.insect.api;
*  B. exports animal.insect.api.bugs;
*  C. exports animal.insect.api.bugs.Bug;
*  D. requires animal.insect.api;
*  E. requires animal.insect.api.bugs;
*  F. requires animal.insect.api.bugs.Bug;

This module is a service provider interface.
The only requirement is that the module needs to export the package containing the interface.
In this case, that is the animal.insect.api.bugs package, which matches option B.
