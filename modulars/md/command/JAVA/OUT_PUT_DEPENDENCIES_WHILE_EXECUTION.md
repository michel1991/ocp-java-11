### Which of the following command line options can be used to find out all the dependencies of a module while execution?
### Note: Although identifying module dependency is not explicitly mentioned in the exam objectives,
### we have seen questions on the exam that require you to know about this.

* A. --show-module-resolution
----------------------------
This option shows all the dependencies of a module and how they are resolved while execution of a class.
For example, lets say you have a moduleA that requires moduleB and moduleB requires moduleC. Now, if you run the following command:

java --module-path out --show-module-resolution --module moduleA/test.A

the following output is produced:

root moduleA file://C:/test/java/out/moduleA/
moduleA requires moduleB file://C:/test/java/out/moduleB/
moduleB requires moduleC file://C:/test/java/out/moduleC/
java.base binds java.xml.crypto jrt:/java.xml.crypto
...
...
java.rmi requires java.logging jrt:/java.logging
test.A


Observe the top three lines of the output. They show how moduleA, moduleB, and moduleC are resolved.

* B. --show-module-dependencies
    There is no such option.

* C. --list-dependencies
    There is no such option.

* D. --list-deps
    There is no such option.

* E. --describe
    There is no such option in java command. But it is there in jmod, where it prints module details for a jmod file. For example:
    
    jmod describe jmods/ma.jmod
    Observe that there are no hypens (or dashes or minus sign) before describe.

* F. --describe-module
The --describe-module option shows the information given in the module-info of a particular module.
It does not traverse the dependency graph.For example, if moduleA requires moduleB and moduleB requires moduleC,
then the command java --describe-module moduleA will only show moduleB.

Correct(A)
