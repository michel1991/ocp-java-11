##### Which are true of a JAR file that has only one module-info.class file,
##### placed in the META-INF directory? (Choose two.)
* A. It is an automatic module if on the classpath.
* B. It is an automatic module if on the module path.
* C. It is a named module if on the classpath.
* D. It is a named module if on the module path.
* E. It is an unnamed module if on the classpath.
* F. It is an unnamed module if on the module path.

Option E is correct because all modules on the classpath are unnamed modules.
On the module path, we can have automatic or named modules.
In this case, it is an automatic module because there is no module-info.class
at the root of the JAR. Having that file in another directory is ignored.
This makes option B the other answer.

##### Which are true statements? (Choose two.)
* A. Code on the classpath can reference code in automatic, named, and unnamed modules.
* B. Code on the classpath can reference code in named modules, but not automatic and unnamed modules.
* C. Code on the classpath can reference code in automatic and named modules, but not unnamed modules.
* D. Code on the module path can reference code in automatic, named, and unnamed modules.
* E. Code on the module path can reference code in named modules, but not automatic and unnamed modules.
* F. Code on the module path can reference code in automatic and named modules, but not unnamed modules.

Code on the classpath has not yet been migrated to modules
and can reference any code in the application.
This is true whether that code is in automatic, named, or unnamed modules, matching option A.
Code on the module path operates in a stricter
world and cannot reference code on the classpath.
Since unnamed modules cannot be accessed in this situation, option F is the second answer.