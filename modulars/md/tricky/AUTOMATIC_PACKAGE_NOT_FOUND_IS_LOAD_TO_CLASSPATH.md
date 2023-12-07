#### Identify correct statements about the Java module system.

* A. If a request is made from an automatic module to load a type whose package
    is not defined in any known module then the module
    system will attempt to load it from the classpath.

* B. The unnamed module can only access types present in the unamed module.
    The unnamed module reads every other module. In other words,
    a class in an unnamed module can access all exported types of all modules.
    
* C. Code from a named module can access classes that are on the classpath.
    A named module cannot access any random class from the classpath.
    If your named module requires access to a non-modular class,
    you must put the non-modular class/jar on module-path and load it as an automatic module.
    Further, you must also put an appropriate "requires" clause in your module-info.
    
* D. If a package is defined in both a named module and the unnamed module then the package in the unnamed module is ignored.

* E. An automatic module cannot access classes from the unnamed module.
    Remember that named modules cannot access classes from the unnamed
    module because it is not possible for a named module to declare dependency on the unnamed module.

    But what if a named module needs to access a class from a non-modular jar? Well,
    you can put the non-modular jar on the module-path, thereby making it an automatic module.
    A named module can declare dependency on an automatic module using the requires clause.

    Now, what if that jar in turn requires access to some other class from another third party non-modular jar? Here,
    the original modular jar doesn't directly access the non-modular jar,
    so it may not be wise to create an automatic module out of
    all such third party jars. This is where the -classpath options is helpful.

    In addition to reading every other named module, an automatic module is also made to read the unnamed module.
    Thus, while running a modular application,
    the classpath option can be used to enable automatic modules to access third party non-modular jars.
    
Bottom Up Approach for modularizing an application
    While modularizing an app using the bottom-up approach, you basically
    need to convert lower level libraries into modular jars before
    you can convert the higher level libraries. For example,
    if a class in A.jar directly uses a class from B.jar, and a class in B.jar
    directly uses a class from C.jar, you need to first modularize C.jar and then B.jar
    before you can modularize A.jar.
    Thus, bottom up approach is possible only when the dependent libraries are modularized already.

Top Down Approach for modularzing an application
    While modularizing an app in a top-down approach, you need to remember the following points -

    1. Any jar file can be converted into an automatic module by simply putting
        that jar on the module-path instead of the classpath.
        Java automatically derives the name of this module from the name of the jar file.
    
    2. Any jar that is put on classpath (instead of module-path)
        is loaded as a part of the "unnamed" module.
    
    3. An explicitly named module (which means, a module that has an explicitly
        defined name in its module-info.java file) can specify dependency on an automatic module
        just like it does for any other module i.e. by adding a requires <module-name>;
        clause in its module info but it cannot do so for the unnamed module because there
        is no way to write a requires clause without a name.  In other words,
        a named module can access classes present in an automatic module but not in the unnamed module.
    
    4. Automatic modules are given access to classes in the unnamed module
        (even though there is no explicitly defined module-info and requires
        clause in an automatic module). In other words,
        a class from an automatic module will be able
        to read a class in the unnamed module without doing anything special.

    5. An automatic module exports all its packages and is allowed
        to read all packages exported by other modules.
        Thus, an automatic module can access: all packages
        of all other automatic modules + all packages exported
        by all explicitly named modules + all packages
        of the unnamed module (i.e. classes loaded from the classpath).

Thus, if your application jar A directly uses a class from another jar B,
then you would have to convert B into a module (either named or automatic).
If B uses another jar C, then you can leave C
on the class path if B hasn't yet been migrated into a named module.
Otherwise, you would have to convert C into an automatic module as well.

Note:
There are two possible ways for an automatic module to get its name:
1. When an Automatic-Module-Name entry is available in the manifest, its value is the name of the automatic module.
2. Otherwise, a name is derived from the JAR filename (see the ModuleFinder JavaDoc for the derivation algorithm) -
    Basically, hyphens are converted into dots and the version number part is ignored.
    So, for example, if you put mysql-connector-java-8.0.11.jar
    on module path, its module name would be mysql.connector.java
(Correct A, D)