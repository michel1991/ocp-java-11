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

#### Identify correct statements about the modular JDK.
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


#### Identify correct statements about the modular JDK.
* A. The foundational APIs of the Java SE platform are found in java.base module.

    As per https://docs.oracle.com/en/java/javase/11/docs/api/java.base/module-summary.html
    java.base module defines the "foundational APIs" of the Java SE Platform. The exam also uses the term "core packages" for the same.

* B. The modular JDK is composed of two modules - the java module and the jdk module.

    There are several modules in the Java SE platform. These modules are categorized into two categories - java se and jdk.
    These two are not really modules but just names of two categories.

    Java SE
    The Java Platform, Standard Edition (Java SE) APIs define the core Java platform for general-purpose computing.
    These APIs are in modules whose names start with java. It contains modules such as: java.base, java.logging, java.sql, java.desktop,
    java.xml, and java.se.

    JDK
    The Java Development Kit (JDK) APIs are specific to the JDK and will not necessarily be available
    in all implementations of the Java SE Platform. These APIs are in modules whose names start with jdk.
    It contains modules such as: jdk.accessibility, jdk.javadoc, jdk.jartool, jdk.jlink, and jdk.net.

* C. JDK is divided into a set of modules that can be combined at compile time, build time, and run time into a variety of configurations.

* D. The modular JDK is divided of two kinds of modules - the standard modules and the non-standard modules.
    The modular structure of the JDK implements the following principles:
    1. Standard modules, whose specifications are governed by the JCP, have names starting with the string "java.".

    2. All other modules are merely part of the JDK, and have names starting with the string "jdk.".



The base module, which is named as java.base, defines and exports all of the platform’s core packages, including the module system itself:

``` txt
    module java.base {
        exports java.io;
        exports java.lang;
        exports java.lang.annotation;
        exports java.lang.invoke;
        exports java.lang.module;
        exports java.lang.ref;
        exports java.lang.reflect;
        exports java.math;
        exports java.net;
        ...
    }
```

The base module is always present. Every other module depends implicitly upon the base module, while the base module depends upon no other modules.

The remaining platform modules share the “java.” name prefix and are likely to include, e.g., java.sql for database connectivity,
java.xml for XML processing, and java.logging for logging. Modules that are not defined
in the Java SE 9 Platform Specification but instead specific to the JDK will, by convention, share the “jdk.”
Correct(A, C, D)
