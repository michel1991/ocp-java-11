### Which are true statements about a package in a JAR on the module path containing a module-info file? (Choose all that apply.)
*  A. It is possible to make it available to all other modules on the classpath.
*  B. It is possible to make it available to all other modules on the module path.
*  C. It is possible to make it available to exactly one other specific module on the classpath.
*  D. It is possible to make it available to exactly one other specific module on the module path.
*  E. It is possible to make sure it is not available to any other modules on the classpath.
*  F. It is possible to make sure it is not available to any other modules on the module path.

Since the JAR is on the classpath, it is a named module.
The module-info file can use the exports directive to allow visibility into zero, one, or more packages to other modules, making options B, D, and F correct.
Further, all unnamed modules on the classpath can access all packages in the module, making option A correct.

### Which modules are on the module path?
A. Automatic only
B. Named only
C. Unnamed only
D. Automatic and named
E. Automatic and unnamed
F. Named and unnamed

Unnamed modules are on the classpath. Option D is correct because automatic and named modules are on the module path.