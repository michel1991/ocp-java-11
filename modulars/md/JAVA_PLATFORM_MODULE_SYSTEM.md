#### Which are included in the Java Platform Module System? (Choose three.)
* A. A format for module JARs
* B. A list of all possible modules for Java
* C. A new file format called jdeps
* D. Additional command-line options for Java tools
* E. Decommissioning of the jar format
* F. Partitioning of the JDK into modules


The module system consists of a format for module jars,
not a replacement making option A correct and option E incorrect.
It also divides the JDK into modules, making option F correct.
Since many modules are not part of the JDK,
it cannot provide a complete list as suggested by option B.
Modules can continue to use jar format or alternatively, use the JMOD format.
Option C is tricky because jdeps was added. However, it is a command,
not a file format. This does make option D correct.