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

#### dentify correct statements about the modular JDK.
* A. The base module does not depend on any module while every other module depends on the base module.
* B The set of modules of the modular JDK can be combined to create configurations corresponding to the full Java SE Platform, the full JRE, and the full JDK.
* C The standard modules of the modular JDK are governed by the Java Community Process while non-standard ones are not.
* D. A standard module may contain a standard or non-standard API package but must not export any non-standard package.
A standard module may export a non-standard package but that export must be qualified.

Remember that the modular structure of the JDK implements the following principles:

. Standard modules, whose specifications are governed by the JCP, have names starting with the string "java.".

. All other modules are merely part of the JDK, and have names starting with the string "jdk.".

. A standard module may contain both standard and non-standard API packages.
If a standard module exports a standard API package then the export may be qualified;
if a standard module exports a non-standard API package then the export must be qualified.

. A standard module may depend upon one or more non-standard modules. It must not grant implied readability to any non-standard module.
If it is a Java SE module then it must not grant implied readability to any non-SE module.

. A non-standard module must not export any standard API packages. A non-standard module may grant implied readability to a standard module.
Correct(A, B, C)