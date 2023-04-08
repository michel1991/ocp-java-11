### What is true about a service provider module? (Choose all that apply.)
* A. It contains the interface that implementations must provide
* B. It contains exactly one implementation of the interface.
* C. It contains one or more implementations of the interface.
* D. It can be changed without recompiling any other modules.
* E. It must have a provides directive.
* F. It must have a uses directive.

A service provider interface declares the interface rather than a service provider,
making option A incorrect.
Each service provider is allowed to provide only one service provider implementation,
making option B correct and option C incorrect.
One of the benefits of services is being able to change
the service provider dynamically, making option D correct.
Finally, a service provider interface uses while a service provider provides,
making option E correct and option F incorrect.

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
Option A is correct because the Java Platform Module System
does not allow cyclic dependencies between modules.
No such restriction exists for packages, making option B incorrect.
A cyclic dependency can involve two or more modules that require each other,
making option E correct, while options C and D are incorrect.
Finally. Option F is incorrect because unnamed modules cannot
be referenced from an automatic module.


### Which of the following are true? (Choose all that apply.)
*  A. javac compiles a .class file into a .java file.
*  B. javac compiles a .java file into a .bytecode file.
*  C. javac compiles a .java file into a .class file.
*  D. java accepts the name of the class as a parameter.
*  E. java accepts the filename of the .bytecode file as a parameter.
*  F. java accepts the filename of the .class file as a parameter.

Java puts source code in .java files and bytecode in .class files.
It does not use a .bytecode file.
When running a Java program, you pass just the name of the class without the .class extension.


##### Suppose you have the commands javac, java, and jar.
##### How many of them support a --show-module-resolution option?
* A. 0
* B. 1
* C. 2
* D. 3

The java command uses this option to print information when the program loads.
You might think jar does the same thing since it runs a program too.
Alas, this parameter does not exist on jar.


### Which commands take a --describe-module parameter? (Choose all that apply.)
* A. javac
* B. java
* C. jar
* D. jdeps
* E. jmod
* F. None of the above

Options B and C are correct because the -d (--describe-module)
option can be passed when to the java and jar commands.


#### Suppose you have a project with one package named magic.wand and another project with one package named magic.potion.
#### These projects have a circular dependency, so you decide to create a third project named magic.helper.
#### The magic.helper module has the common code containing a package named magic.util. For simplicity,
#### let’s give each module the same name as the package.
#### Which of the following need to appear in your module-info files? (Choose all that apply.)
* A. exports magic.potion; in the potion project
* B. exports magic.util; in the magic helper project
* C. exports magic.wand; in the wand project
* D. requires magic.util; in the magic helper project
* E. requires magic.util; in the potion project
* F. requires magic.util; in the wand project

Since the new project extracts the common code,
it must have an exports directive for that code, making option B correct.
The other two modules do not have to expose anything.
They must have a requires directive to be able to use the exported code,
making options E and F correct.



### Which of the following is an advantage of the Java Platform Module System?
*  A. A central repository of all modules
*  B. Encapsulating packages
*  C. Encapsulating objects
*  D. No defined types
*  E. Platform independence

Option B is correct since modules allow you to specify
which packages can be called by external code.
Options C and E are incorrect because they are provided
by Java without the module system.
Option A is incorrect because there is not a central repository of modules.
Option D is incorrect because Java defines types.


##### Which option best fills in the blanks in the following statements:
##### In the module-info file, a module that wants to use code in another module specifies
##### the directive ________. By contrast, the module that wants
##### to allow other modules to use its code specifies the directive ___________.
* A. exports and requires
* B. exports and uses
* C. exposes and requires
* D. exposes and uses
* E. requires and exports
* F. requires and exposes
* G. None of the above

The two most common directives are exports and requires.
The module that wants to expose one or more packages uses the exports directive.
The requires directive is used by the module that wants to use code in another one.


###### You have a project that has two packages named jellyfish.sting and jellyfish.swim.
###### Suppose you were tasked with modularizing the project with the requirement
###### that both packages be available for other Java projects.
###### Which statements are true about your module-info file? (Choose all that apply.)
* A. You can write a combined statement: exports jellyfish.
* B. You must have two separate exports directives.
* C. Since you intend both packages to be available, you don’t need to specify an exports directive.
* D. Since you intend both packages to be available, you don’t need to write a module-info file.
* E. The name jellyfish is good for the module.
* F. The name jellyfish-module is good for the module.
* G. None of the above

Each package being made available needs to have a separate exports directive, making option B correct.
Omitting the module-info file entirely or having one with exports directives means calling modules are not
allowed to reference any of the packages. Therefore, options C and D are correct.
Option A will not compile since there is not matching package name.
Option E is correct as the module name matches the common prefix.
Option F is incorrect because identifiers are not allowed to have a dash.

### Which would you expect to see when describing any module?
* A. requires java.base mandated
* B. requires java.core mandated
* C. requires java.lang mandated
* D. requires mandated java.base
* E. requires mandated java.core
* F. requires mandated java.lang
* G. None of the above

When running java with the -d option, all the required modules are listed.
Additionally, the java.base module is listed since it is included automatically.
The line ends with mandated, making option A correct.
The java.lang is a trick since that is a package that is imported by default in a class rather than a module.


### Using the diagram, which boxes represent the consumer and service locator, respectively?
[image](images/find_consumer_service_locator.jpg)
* A. W and X
* B. W and Z
* C. X and Y
* D. X and Z
* E. Y and Z
* F. None of the above

The consumer depends on the service provider interface and service locator,
but not the service provider.
Only W has two arrows starting from it so it must be the consumer.
This rules out options C, D, and E.
The service locator references the service provider interface directly
and the service provider indirectly,
making the service locator Z and option B the answer.

##### The service locator and service provider interface share a module.
##### Which boxes represent the consumer and service provider, respectively?
[image](images/x_z_share_module.jpg)
* A. X and Y
* B. X and Z
* C. Y and Z
* D. Z and Z
* E. Z and Y
* F. None of the above

The consumer needs to depend on the shared module, making it X.
The shared module then has to be Z, and the service provider has to be Y.
This makes option A correct.

##### Suppose we have the packages in the diagram.
##### What could we add to the module-info.java in com.duck
##### to allow the com.park module to reference the Duckling
##### class but not allow the com.bread module to do the same?

[image](images/com.duck_com.park.jpg)
*  A. exports com.duckling;
*  B. exports com.duckling from com.park;
*  C. exports com.duckling to com.park;
*  D. exports com.park from com.duckling;
*  E. exports com.park to com.duckling;
*  F. None of the above

Option A is incorrect because it exports the package to all modules.
Option C is correct because it limits package sharing to the com.park module.
Option E is incorrect because a package must be exported from the module that contains it.
Options B and D are incorrect because from is not valid syntax.

#### What is a benefit of using modules? (Choose two.)
*  A. Better access control
*  B. Custom Java builds
*  C. Elimination of JAR files
*  D. Fewer .java files needed in your application
*  E. Not necessary to specify types of local variables
*  F. Write once, run anywhere

Option A is correct because modules provide a mechanism to export specific packages.
This creates module-level access since some packages can be used only in a module.
Option B is correct because jlink allows creating a distribution
with just the parts of the JDK that are needed.
Option C is not correct because modules are usually distributed as a JAR file.
Option D is incorrect because modules actually require one extra file: module-info.java.
Option E is incorrect because var can be used with or without modules.
Finally, option F is incorrect because “write once,
run anywhere” is a core benefit of Java independent of modules.



##### Imagine you are working with another team to build an application.
##### You are developing code that uses a class that the other team has not finished writing yet.
##### You want to allow easy integration once the other team’s code is complete.
##### Which statements would meet this requirement? (Choose two.)

* A. An abstract class is best.
* B. An interface is best.
* C. Either of an abstract class or interface would meet the requirement.
* D. The methods should be protected.
* E. The methods should be public.
* F. The methods should be static.

The key here is understanding which of these features of
Java allow one developer to build their application around another developer’s code,
even if that code is not ready yet. For this problem, an interface is the best choice.
If the two teams agree on a common interface, one developer can write code that uses the interface,
while another developer writes code that implements the interface.
Assuming neither team changes the interface, the code can
be easily integrated once both teams are done. For these reasons,
option B is correct. Interfaces expose methods using the public keyword,
making option E the other answer.

#### What is the name of a file that declares a module?
* A. mod.java
* B. mod-data.java
* C. mod-info.java
* D. module.java
* E. module-data.java
* F. module-info.java

The module-info.java file is used to declare a module. You must memorize the name of this file.

##### Given the diagram in the previous question, what could we add to module-info.java
##### in com.duck to allow the com.park package to reference the Duckling class,
##### but not allow the Egg class to reference the Duckling class?
* A. exports com.duckling;
* B. exports com.duckling from com.park;
* C. exports com.duckling to com.park;
* D. exports com.park from com.duckling;
* E. exports com.park to com.duckling;
* F. None of the above

It is not possible to provide access outside the module while also limiting access within the com.duck module.
Options A and C are tempting because they do provide access in com.park.
However, they do not prevent the Egg class in the com.egg package from accessing
the com.duckling package. Remember that the com.egg package is in the com.duck module,
so the access cannot be restricted. Therefore, option F is correct.

##### What file formats are legal for a module to be distributed?
* A. jar
* B. jmod
* C. zip
* D. jar and jmod
* E. jar and zip
* F. jmod and zip
[image](./images/doubleConsumerIntFunctionLongSupplierObjDoubleConsumer.png)
The jar file format is most common. The JMOD jmod format is used as well.
Therefore, option D is correct.
