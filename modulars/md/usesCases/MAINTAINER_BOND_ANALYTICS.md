### You are the maintainer of a library packaged as bondanalytics.jar,
### which is used by several groups in your company. It has the following
### two packages that are used by other applications:
### com.abc.bonds
### com.abc.bonds.analytics
### You want to modularize this jar with least impact to others. What will you do?

* A. Split the jar into two modules - one exporting com.abc.bonds package and another exporting com.abc.bonds.analytics package.
    Although it is technically possible but it will impact others because they will now be required to use two jars instead of one.
* B. Just add module-info.java to the jar with exports clauses for both the packages.
    For example:
```java
module bondanalytics{
    exports com.abc.bonds;
    exports com.abc.bonds.analytics;
}
``` 

* C. Just add an empty module-info.java to the jar.
    If you don't export a package then other modular jars cannot access classes from this jar.
* D. It cannot be modularized without impacting existing non-modular applications that use it.
    A modular jar can still be used like a regular jar. So, any non-modular application
    can use a modularized jar by putting that jar in the classpath just like any other jar.
