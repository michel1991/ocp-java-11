### Which are true statements about a package in a JAR on the classpath containing a module-info file? (Choose all that apply.)
*  A. It is possible to make it available to all other modules on the classpath.
*  B. It is possible to make it available to all other modules on the module path.
*  C. It is possible to make it available to exactly one other specific module on the classpath.
*  D. It is possible to make it available to exactly one other specific module on the module path.
*  E. It is possible to make sure it is not available to any other modules on the classpath.

Since the JAR is on the classpath, it is treated as a regular unnamed
module even though it has a module-info file inside.
Remember from learning about top-down migration that modules
on the module path are not allowed to refer to the classpath,
making options B, and D incorrect.
The classpath does not have a facility to
restrict packages, making option A correct and options C and E incorrect.

#### Which modules are on the classpath?
*  A. Automatic only
*  B. Named only
*  C. Unnamed only
*  D. Automatic and named
*  E. Automatic and unnamed
*  F. Named and unnamed

Option C is correct because only unnamed modules are on the classpath.