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

#### Java Module system achieves which of the following objectives for a Java project?

* A. It encapsulates the project.

* B. It encapsulates the packages.

* C. It provides a central repository for keeping classes.
    The Java module system does not attempt to be a repository.
    It merely provides a way to encapsulate tthe packages.

* D. It enables a project to manage multiple versions of dependencies.
    The Java module system does not attempt to solve versioning issues.

* E. It provides a reliable mechanism to let components of an application specify their dependencies on each other.
    A java module specifies the packages that other modules can use using
    the exports and exports to clauses and it defines its dependencies
    on other modules using the requires and requires transitive clauses in its module-info.

* F. It provides a way to specify services and declare dependence on such services.
    The Java module system allows a module to specify
    the services that it provides using the provides
    clause and it allows a module to declare its dependency on services using the uses clause.

    Note: provides and uses clauses are not on the
    Part 1 exam but you may see these clauses mentioned in the incorrect options.

The specific goals of the module system are to provide:
1. Reliable configuration, to replace the brittle,
    error-prone class-path mechanism with a means
    for program components to declare explicit dependences upon one another, along with,
2. Strong encapsulation, to allow a component
    to declare which of its public types are accessible to other components, and which are not.
(B, E, F)