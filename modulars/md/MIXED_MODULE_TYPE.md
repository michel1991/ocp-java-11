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