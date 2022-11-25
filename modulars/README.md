# Which are true statements? (Choose all that apply.)
* A. An automatic module exports all packages to named modules.
* B. An automatic module exports only the specified packages to named modules
* C. An automatic module exports no packages to named modules.
* D. An unnamed module exports only the named packages to named modules.
* E. An unnamed module exports all packages to named modules.
* F. An unnamed module exports no packages to named modules.

An automatic module exports all packages, making option A correct.
An unnamed module is not available to any modules on the module path.
Therefore, it doesn’t export any packages, and option F is correct.

# Which of the following options does not have a one-character shortcut in any of the commands studied in this chapter? (Choose all that apply.)
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

# Which options are valid on the jar command without considering module options? (Choose all that apply.)
* A. -c
* B. -C
* C. -cp
* D. -d
* E. -f
* F. -p

When creating a jar file, you use the options -cf or -cvf, making options A and E correct. It also allows the specification of a directory using -C, making option B correct.
Options D and E are incorrect because -d and -p are used for modules.

# Suppose you have a module named com.vet. Where could you place the following module-info.java file to create a valid module?

```java
public module com.vet {
    exports com.vet;
    }
```
* A. At the same level as the com folder
* B. At the same level as the vet folder
* C. Inside the vet folder

If this were a valid module-info.java file, it would need to be placed at the root directory of the module, which is option A.
However, a module is not allowed to use the public access modifier. Option D is correct because the provided file does not compile regardless of placement in the project.
For more information, see Chapter 11.

# What is true about a service provider module? (Choose all that apply.)
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

# Which of the following statements are correct? (Choose all that apply.)
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

# Which of the following statements are true in a module-info.java file? (Choose all that apply.)
A. The opens keyword allows the use of reflection.
B. The opens keyword declares an API is called.
C. The use keyword allows the use of reflection.
D. The use keyword declares an API is called.
E. The uses keyword allows the use of reflection.
F. The uses keyword declares an API is called.
G. The file can be empty (zero bytes).
Options C and D are incorrect because there is no use keyword.
Options A and F are correct because opens is for reflection and uses declares an API that consumes a service.
Option G is also correct as the file can be completely empty. This is just something you have to memorize.

# Which are true statements? (Choose all that apply.)
A. An automatic module exports all packages to named modules.
B. An automatic module exports only the specified packages to named modules.
C. An automatic module exports no packages to named modules.
D. An unnamed module exports only the named packages to named modules.
E. An unnamed module exports all packages to named modules.
F. An unnamed module exports no packages to named modules.
An automatic module exports all packages, making option A correct.
An unnamed module is not available to any modules on the module path.
Therefore, it doesn’t export any packages, and option F is correct.

# Which of the following statements are true? (Choose all that apply.)
A. Modules with cyclic dependencies will not compile.
B. Packages with a cyclic dependency will not compile.
C. A cyclic dependency always involves exactly two modules.
D. A cyclic dependency always involves three or more modules.
E. A cyclic dependency always involves at least two requires statements.
F. An unnamed module can be involved in a cyclic dependency with an automatic module
A cyclic dependency is when a module graph forms a circle.
Option A is correct because the Java Platform Module System does not allow cyclic dependencies between modules.
No such restriction exists for packages, making option B incorrect.
A cyclic dependency can involve two or more modules that require each other, making option E correct, while options C and D are incorrect.
Finally. Option F is incorrect because unnamed modules cannot be referenced from an automatic module.

# Which command can you run to determine whether you have any code in your JAR file that depends on unsupported internal APIs and does not suggest an alternative?
A. jdeps -internal-jdk
B. jdeps --internaljdk
C. jdeps --internal-jdk
D. jdeps -s
E. jdeps -unsupported
F. jdeps –unsupportedapi
G. jdeps –unsupported-api
H. None of the above

Option D is correct because it prints jdk.unsupported but does not print a table with a suggested alternative.
Option C is incorrect because it does print a suggested alternative.
Options A, B, E, F, and G are incorrect because those options do not exist.


# What is true of a module containing a file named module-info.java with the following contents? (Choose all that apply.)
```java
module com.food.supplier {}
```
A. All packages inside the module are automatically exported.
B. No packages inside the module are automatically exported.
C. A main method inside the module can be run.
D. A main method inside the module cannot be run since the class is not exposed.
E. The module-info.java file contains a compiler error.
F. The module-info.java filename is incorrect.

Packages inside a module are not exported by default, making option B correct and option A incorrect.
Exporting is necessary for other code to uses the packages;
it is not necessary to call the main method at the command line, making option C correct and option D incorrect.
The module-info.java file has the correct name and compiles, making options E and F incorrect.

# Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. Which module(s) need to specify a requires directive on the service provider?
A. Service locator
B. Service provider interface
C. Consumer
D. Consumer and service locator
E. Consumer and service provider
F. Service locator and service provider interface
G. Consumer, service locator, and service provider interface
H. None of the above

This question is tricky. The service provider must have a uses directive, but that is on the service provider interface.
No modules need to specify requires on the service provider since that is the implementation.

# Suppose module puppy depends on module dog and module dog depends on module animal. Which two lines allow module puppy to access the animal.behavior package in module animal? (Choose two.)
```java
    module animal {
       exports animal.behavior to dog;
    }
    module dog {
        _______ animal;  // line S
    }
    module puppy {
            _______ dog;     // line T
   }
```
A. require on line S
B. require on line T
C. requires on line S
D. requires on line T
E. require transitive on line S
F. require transitive on line T
G. requires transitive on line S
H. requires transitive on line T

Options A, B, E, and F are incorrect because they refer to keywords that don’t exist.
The requires transitive keyword is used when specifying a module to be used by the requesting module and any other modules that use the requesting module.
Therefore, dog needs to specify the transitive relationship, and option G is correct.
The module puppy just needs to require dog, and it gets the transitive dependencies, making option D correct.

# Which statement is true about the jdeps command? (Choose all that apply.)
A. It can provide information about dependencies on the class level only.
B. It can provide information about dependencies on the package level only.
C. It can provide information about dependencies on the class or package level.
D. It can run only against a named module.
E. It can run against a regular JAR.

The jdeps command provides information about the class or package level depending on the options passed, making option C correct.
It is frequently used to determine what dependencies you will need when converting to modules. This makes it useful to run against a regular JAR, making option E correct.

# Which are true of the --module-path option? (Choose all that apply.)
A. It is an option on the javac command.
B. It is an option on the java command.
C. It is an option on the jar command.
D. It is an option on the jdeps command.
E. It has a short form of -m.
F. It has a short form of -p.

Options A, B, and D are correct because the -module-path option is available on javac, java, and jdeps.
Option F is correct because -p is equivalent for the javac and java commands. The jdeps command does not allow the short form.

