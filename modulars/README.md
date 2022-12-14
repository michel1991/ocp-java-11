### Which are true statements? (Choose all that apply.)
* A. An automatic module exports all packages to named modules.
* B. An automatic module exports only the specified packages to named modules
* C. An automatic module exports no packages to named modules.
* D. An unnamed module exports only the named packages to named modules.
* E. An unnamed module exports all packages to named modules.
* F. An unnamed module exports no packages to named modules.

An automatic module exports all packages, making option A correct.
An unnamed module is not available to any modules on the module path.
Therefore, it doesn’t export any packages, and option F is correct.

### Which of the following options does not have a one-character shortcut in any of the commands studied in this chapter? (Choose all that apply.)
* A. describe-module
* B. list-modules
* C. module
* D. module-path
* E. show-module-resolution
* F. summary

Option A is incorrect because describe-module has the d equivalent.
Option C is incorrect because module has the m equivalent.
Option D is incorrect because module-path has the p equivalent. Option F is incorrect because summary has the s equivalent.
Options B and E are the correct answers because they do not have equivalents.

### Which options are valid on the jar command without considering module options? (Choose all that apply.)
* A. -c
* B. -C
* C. -cp
* D. -d
* E. -f
* F. -p

When creating a jar file, you use the options -cf or -cvf, making options A and E correct. It also allows the specification of a directory using -C, making option B correct.
Options D and E are incorrect because -d and -p are used for modules.

### What is true about a service provider module? (Choose all that apply.)
* A. It contains the interface that implementations must provide
* B. It contains exactly one implementation of the interface.
* C. It contains one or more implementations of the interface.
* D. It can be changed without recompiling any other modules.
* E. It must have a provides directive.
* F. It must have a uses directive.

A service provider interface declares the interface rather than a service provider, making option A incorrect.
Each service provider is allowed to provide only one service provider implementation, making option B correct and option C incorrect.
One of the benefits of services is being able to change the service provider dynamically, making option D correct.
Finally, a service provider interface uses while a service provider provides, making option E correct and option F incorrect.

### Which of the following statements are correct? (Choose all that apply.)
* A. The jar command allows adding exports as command-line options.
* B. The java command allows adding exports as command-line options.
* C. The jdeps command allows adding exports as command-line options.
* D. Adding an export at the command line is discouraged.
* E. Adding an export at the command line is recommended.

The java command has an --add-exports option that allows exporting a package at runtime. However, it is not encouraged to use it, making options B and D the answer.

# An automatic module name is generated if one is not supplied. Which of the following JAR filename and generated automatic module name pairs are correct? (Choose all that apply.)
* A. emily-1.0.0.jar and emily
* B. emily-1.0.0-SNAPSHOT.jar and emily
* C. emily_the_cat-1.0.0.jar and emily_the_cat
* D. emily_the_cat-1.0.0.jar and emily-the-cat
* E. emily.$.jar and emily
* F. emily.$.jar and emily.
* G. emily.$.jar and emily..

Any version information at the end of the JAR filename is removed, making options A and B correct.
Underscores (_) are turned into dots (.), making options C and D incorrect.
Other special characters like a dollar sign ($) are also turned into dots.
However, adjacent dots are merged, and leading/trailing dots are removed. Therefore, option E is correct.

### Which of the following statements are true in a module-info.java file? (Choose all that apply.)
*  A. The opens keyword allows the use of reflection.
*  B. The opens keyword declares an API is called.
*  C. The use keyword allows the use of reflection.
*  D. The use keyword declares an API is called.
*  E. The uses keyword allows the use of reflection.
*  F. The uses keyword declares an API is called.
*  G. The file can be empty (zero bytes).

Options C and D are incorrect because there is no use keyword.
Options A and F are correct because opens is for reflection and uses declares an API that consumes a service.
Option G is also correct as the file can be completely empty. This is just something you have to memorize.

### Which are true statements? (Choose all that apply.)
*  A. An automatic module exports all packages to named modules.
*  B. An automatic module exports only the specified packages to named modules.
*  C. An automatic module exports no packages to named modules.
*  D. An unnamed module exports only the named packages to named modules.
*  E. An unnamed module exports all packages to named modules.
*  F. An unnamed module exports no packages to named modules.

An automatic module exports all packages, making option A correct.
An unnamed module is not available to any modules on the module path.
Therefore, it doesn’t export any packages, and option F is correct.

### Which of the following statements are true? (Choose all that apply.)
*  A. Modules with cyclic dependencies will not compile.
*  B. Packages with a cyclic dependency will not compile.
*  C. A cyclic dependency always involves exactly two modules.
*  D. A cyclic dependency always involves three or more modules.
*  E. A cyclic dependency always involves at least two requires statements.
*  F. An unnamed module can be involved in a cyclic dependency with an automatic module

A cyclic dependency is when a module graph forms a circle.
Option A is correct because the Java Platform Module System does not allow cyclic dependencies between modules.
No such restriction exists for packages, making option B incorrect.
A cyclic dependency can involve two or more modules that require each other, making option E correct, while options C and D are incorrect.
Finally. Option F is incorrect because unnamed modules cannot be referenced from an automatic module.

### Which command can you run to determine whether you have any code in your JAR file that depends on unsupported internal APIs and does not suggest an alternative?
*  A. jdeps -internal-jdk
*  B. jdeps --internaljdk
*  C. jdeps --internal-jdk
*  D. jdeps -s
*  E. jdeps -unsupported
*  F. jdeps –unsupportedapi
*  G. jdeps –unsupported-api
*  H. None of the above

Option D is correct because it prints jdk.unsupported but does not print a table with a suggested alternative.
Option C is incorrect because it does print a suggested alternative.
Options A, B, E, F, and G are incorrect because those options do not exist.


### What is true of a module containing a file named module-info.java with the following contents? (Choose all that apply.)
```java
module com.food.supplier {}
```
*  A. All packages inside the module are automatically exported.
*  B. No packages inside the module are automatically exported.
*  C. A main method inside the module can be run.
*  D. A main method inside the module cannot be run since the class is not exposed.
*  E. The module-info.java file contains a compiler error.
*  F. The module-info.java filename is incorrect.

Packages inside a module are not exported by default, making option B correct and option A incorrect.
Exporting is necessary for other code to uses the packages;
it is not necessary to call the main method at the command line, making option C correct and option D incorrect.
The module-info.java file has the correct name and compiles, making options E and F incorrect.

### Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. Which module(s) need to specify a requires directive on the service provider?
*  A. Service locator
*  B. Service provider interface
*  C. Consumer
*  D. Consumer and service locator
*  E. Consumer and service provider
*  F. Service locator and service provider interface
*  G. Consumer, service locator, and service provider interface
*  H. None of the above

This question is tricky. The service provider must have a uses directive, but that is on the service provider interface.
No modules need to specify requires on the service provider since that is the implementation.


### Which statement is true about the jdeps command? (Choose all that apply.)
*  A. It can provide information about dependencies on the class level only.
*  B. It can provide information about dependencies on the package level only.
*  C. It can provide information about dependencies on the class or package level.
*  D. It can run only against a named module.
*  E. It can run against a regular JAR.

The jdeps command provides information about the class or package level depending on the options passed, making option C correct.
It is frequently used to determine what dependencies you will need when converting to modules. This makes it useful to run against a regular JAR, making option E correct.

### Which are true of the --module-path option? (Choose all that apply.)
*  A. It is an option on the javac command.
*  B. It is an option on the java command.
*  C. It is an option on the jar command.
*  D. It is an option on the jdeps command.
*  E. It has a short form of -m.
*  F. It has a short form of -p.

Options A, B, and D are correct because the -module-path option is available on javac, java, and jdeps.
Option F is correct because -p is equivalent for the javac and java commands. The jdeps command does not allow the short form.

### For a top-down migration, all modules other than named modules are ________________ modules and on the __________________.
* A. automatic, classpath
*  B. automatic, module path
*  C. unnamed, classpath
*  D. unnamed, module path
*  E. None of the above

A top-down migration strategy first places all JARs on the module path.
Then it migrates the top-level module to be a named module, leaving the other modules as automatic modules.
Option B is correct as it matches both of those characteristics.

### Which options are valid on the java command without considering module options? (Choose all that apply.)
*  A. -c
*  B. -C
*  C. -cp
*  D. -d
*  E. -f
*  F. -p

When running a program using java, you specify the classpath with -cp, making option C correct.
Options D and E are incorrect because -d and -p are used for modules.
Options A and B are not valid options on the java command.

### Which of the following are true? (Choose all that apply.)
*  A. javac compiles a .class file into a .java file.
*  B. javac compiles a .java file into a .bytecode file.
*  C. javac compiles a .java file into a .class file.
*  D. java accepts the name of the class as a parameter.
*  E. java accepts the filename of the .bytecode file as a parameter.
*  F. java accepts the filename of the .class file as a parameter.

Java puts source code in .java files and bytecode in .class files. It does not use a .bytecode file.
When running a Java program, you pass just the name of the class without the .class extension.

### Which are valid modes for the jmod command? (Choose all that apply.)
*  A. add
*  B. create
*  C. delete
*  D. describe
*  E. extract
*  F. list
*  G. show

This is another question you just have to memorize.
The jmod command has five modes you need to be able to list: create, extract, describe, list, and hash.
The hash operation is not an answer choice. The other four are making options B, D, E, and F correct.

### Suppose you have the commands javac, java, and jar. How many of them support a --show-module-resolution option?
* A. 0
* B. 1
* C. 2
* D. 3

The java command uses this option to print information when the program loads.
You might think jar does the same thing since it runs a program too. Alas, this parameter does not exist on jar.

### Fill in the blanks so this command to run the program is correct:
java
_______ zoo.animal.talks/zoo/animal/talks/Peacocks
_______ modules

*  A. -d and -m
*  B. -d and -p
*  C. -m and -d
*  D. -m and -p
*  E. -p and -d
*  F. -p and -m
*  G. None of the above

The -m or --module option is used to specify the module and class name.
The -p or -module-path option is used to specify the location of the modules.
Option D would be correct if the rest of the command were correct.
However, running a program requires specifying the package name with periods (.) instead of slashes.
Since the command is incorrect, option G is correct.

### Which two are required in any module? (Choose two.)
*  A. A file named module.java
*  B. A file named moduleInfo.java
*  C. A file named module-info.java
*  D. A file named module_info.java
*  E. Zero or more packages
*  F. One or more packages

All modules must contain a module-info.java file in the root directory, making option C correct.
Additionally, a module is not allowed to be empty. There must be at least one package. making option F the second correct answer.

### Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. If you add a second service provider module, how many of these modules do you need to recompile?
*  A. Zero
*  B. One
*  C. Two
*  D. Three
*  E. Four

Since this is a new module, you need to compile the new module.
However, none of the existing modules needs to be recompiled, making option A correct.
The service locator will see the new service provider simply by having the new service provider on the module path.

### Which of the following modules contains the java.sql package? (Choose all that apply.)
*  A. java.base;
*  B. java.database;
*  C. java.jdbc;
*  D. java.sql;
*  E. None of the above

Sorry. You just need to memorize this. The java.sql package is in the java.sql module, making option D correct. It just so happens to have the same name.

### Which module is available to your named module without needing a requires directive?
* A. java.all
*  B. java.base
*  C. java.default
*  D. java.lang
*  E. None of the above

Option B is correct because java.base is provided by default. It contains the java.lang package among others.

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

### Which are true statements about a package in a JAR on the classpath containing a module-info file? (Choose all that apply.)
*  A. It is possible to make it available to all other modules on the classpath.
*  B. It is possible to make it available to all other modules on the module path.
*  C. It is possible to make it available to exactly one other specific module on the classpath.
*  D. It is possible to make it available to exactly one other specific module on the module path.
*  E. It is possible to make sure it is not available to any other modules on the classpath.

Since the JAR is on the classpath, it is treated as a regular unnamed module even though it has a module-info file inside.
Remember from learning about top-down migration that modules on the module path are not allowed to refer to the classpath, making options B, and D incorrect.
The classpath does not have a facility to restrict packages, making option A correct and options C and E incorrect.


### For a bottom-up migration, all modules other than named modules are ________________ modules and on the __________________.
* A. automatic, classpath
* B. automatic, module path
* C. unnamed, classpath
* D. unnamed, module path
* E. None of the above

A bottom-up migration strategy leaves all JARs on the classpath until they are migrated.
Then it migrates the lowest-level module to be a named module, leaving the other modules as unnamed modules.
Option C is correct as it matches both of those characteristics.

### Which commands take a --describe-module parameter? (Choose all that apply.)
* A. javac
* B. java
* C. jar
* D. jdeps
* E. jmod
* F. None of the above

Options B and C are correct because the -d (--describe-module) option can be passed when to the java and jar commands.

### Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. If you change the implementation of the service provider, how many of these modules do you need to re-compile?
* A. Zero
* B. One
* C. Two
* D. Three
* E. Four

Since the service provider itself is changing, it needs to be re-compiled. However, none of the other modules does, making option B correct.

### Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. If you add a second service provider module, how many of these modules do you need to recompile?
A. Zero
B. One
C. Two
D. Three
E. Four

Since this is a new module, you need to compile the new module. However, none of the existing modules needs to be recompiled, making option A correct.
The service locator will see the new service provider simply by having the new service provider on the module path.

### Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. Which statements are true about the directives you need to specify? (Choose all that apply.)
* A. The consumer must use the requires directive.
* B. The consumer must use the uses directive.
* C. The service locator must use the requires directive.
* D. The service locator must use the uses directive.

Option A and C are correct because both the consumer and the service locator depend on the service provider interface.
Additionally, option D is correct because the service locator must specify that it uses the service provider interface to look it up.

### A(n) ________________ module can reference classes in a(n) _______________ module. Assume the package is exported as needed. (Choose all that apply.)
* A. automatic, named
* B. automatic, unnamed
* C. named, automatic
* D. named, unnamed
* E. unnamed, automatic
* F. unnamed, named
* G. None of the above

Named modules can read only from the module path, making option C correct and option D incorrect.
Unnamed modules can read only from the classpath, making options E and F incorrect.
Automatic modules can read from either the classpath or the module path, making options A and B correct.

### Which of the following pairs make up a service?
* A. Consumer and service locator
* B. Consumer and service provider interface
* C. Service locator and service provider
* D. Service locator and service provider interface
* E. Service provider and service provider interface

A service consists of the service provider interface and logic to look up implementations using a service locator.
This makes option D correct. Make sure you know that the service provider itself is the implementation, which is not considered part of the service.

### Which statements are true about migration? (Choose all that apply.)
* A. Bottom-up migration involves automatic modules.
* B. Bottom-up migration involves unnamed modules.
* C. Bottom-up migration involves both the classpath and module path.
* D. Top-down migration involves automatic modules.
* E. Top-down migration involves unnamed modules.
* F. Top-down migration involves both the classpath and module path.

Top-down migration starts with putting all JARs on the module path as automatic modules, making option D correct.
Bottom-up migration starts with leaving all JARs on the classpath as unnamed modules, making options B and C correct.

### Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. Which modules need to specify a requires directive on the service provider interface?
* A. Service locator
* B. Service provider
* C. Consumer
* D. Consumer and service locator
* E. Consumer and service provider
* F. Service locator and service provider
* G. Consumer, service locator, and service provider
* H. None of the above

The service provider interface needs to be available to all three, making option G correct.
The service provider needs to implement the interface. The service locator needs it to look up the interface.
The consumer needs it to call methods on the interface.

#### Suppose you have a project with one package named magic.wand and another project with one package named magic.potion. These projects have a circular dependency, so you decide to create a third project named magic.helper. The magic.helper module has the common code containing a package named magic.util. For simplicity, let’s give each module the same name as the package. Which of the following need to appear in your module-info files? (Choose all that apply.)
* A. exports magic.potion; in the potion project
* B. exports magic.util; in the magic helper project
* C. exports magic.wand; in the wand project
* D. requires magic.util; in the magic helper project
* E. requires magic.util; in the potion project
* F. requires magic.util; in the wand project

Since the new project extracts the common code, it must have an exports directive for that code, making option B correct.
The other two modules do not have to expose anything. They must have a requires directive to be able to use the exported code, making options E and F correct.

### A(n) ________________ module always contains a module-info file, while a(n) _______________ module always exports all its packages to other modules.
* A. automatic, named
* B. automatic, unnamed
* C. named, automatic
* D. named, unnamed
* E. unnamed, automatic
* F. unnamed, named
* G. None of the above

Only named modules are required to have a module-info file, ruling out options A, B, E, and F.
Unnamed modules are not readable by any other types of modules, ruling out option D.
Automatic modules always export all packages to other modules, making the answer option C.
For more information, see Chapter 6.

### Which of the following would be a legal module name? (Choose all that apply.)
* A. com.book
* B. com-book
* C. com.book$
* D. com-book$
* E. 4com.book
* F. 4com-book

Module names look a lot like package names. Each segment is separated by a period (.)
and uses characters valid in Java identifiers.
Since identifiers are not allowed to begin with numbers, options E and F are incorrect.
Dashes (-) are not allowed either, ruling out options B and D.
That leaves options A and C as the correct answers.

### What can be created using the Java Platform Module System that could not be created without it? (Choose all that apply.)
*  A. JAR file
*  B. JMOD file
*  C. Smaller runtime images for distribution
*  D. Operating system specific bytecode
*  E. TAR file
*  F. None of the above

Option A is incorrect because JAR files have always been available regardless of the JPMS.
Option D is incorrect because bytecode runs on the JVM and is not operating system specific by definition.
While it is possible to run the tar command, this has nothing to do with Java, making option E incorrect.
Option B is one of the correct answers as the jmod command creates a JMOD file.
Option C is the other correct answer because specifying dependencies is one of the benefits of the JPMS.

