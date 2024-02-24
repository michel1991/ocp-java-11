#### Identify correct statements about the modular JDK.

* A. Modular JDK allows modular as well as non-modular applications to co-exist.

* B. Modular JDK facilitates aggressive API deprecation.
    Although Java 9 has enhanced @Deprecation annotation to better manage API deprecation, it has nothing to do with modularization.

* C. With modular JDK it is possible to assemble and optimize a set of modules and their dependencies into a custom runtime image.
    This is done using the jlink tool, which was introduced in JDK 9. It can generate a
    custom Java runtime that only contains the modules that are required for a given application.
    jlink enables developers to move away from a centralized Java runtime, with all the associated
    issues of ensuring the correct version is installed, to one runtime per application (or service if you are using a microservices architecture).

* D. Modular JDK allows a module to export a package only to a specific module as well.
This is done using qualified exports. For example, in the following module-info,
module A exports the internal.utils package only to module B:
```
 module A {
    exports internal.utils to B;
}
```

* E. The foundational APIs of the Java SE platform are in java.lang module.
    They are in java.base module. This module is always read by all other modules and therefore,
    there no need to add "requires java.base;" clause in any module-info.
    This module exports a lot of packages. Important ones are:
    java.io, java.lang, java.math, java.net, java.nio, java.security,
    java.time, java.util, java.util.concurrent, and java.util.function.
    The full list can be seen here: http://cr.openjdk.java.net/~mr/jigsaw/ea/module-summary.html
    
    Note that "fundamental APIs" and "core packages" mean the same thing. You may see either of the phrases in the exam.




Correct(A, C, D)