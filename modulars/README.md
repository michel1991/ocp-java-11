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