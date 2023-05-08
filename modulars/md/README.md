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
When running a Java program,
you pass just the name of the class without the .class extension.


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
The java.lang is a trick since that is a package
that is imported by default in a class rather than a module.


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

The module-info.java file is used to declare a module.
You must memorize the name of this file.

##### Given the diagram in the previous question, what could we add to module-info.java
##### in com.duck to allow the com.park package to reference the Duckling class,
##### but not allow the Egg class to reference the Duckling class?
* A. exports com.duckling;
* B. exports com.duckling from com.park;
* C. exports com.duckling to com.park;
* D. exports com.park from com.duckling;
* E. exports com.park to com.duckling;
* F. None of the above

It is not possible to provide access outside
the module while also limiting access within the com.duck module.
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
The jar file format is most common. The JMOD jmod format is used as well.
Therefore, option D is correct.

#### Which is both part of the service and has a provides directive?
* A. Consumer
* B. Service locator
* C. Service provider
* D. Service provider interface
* E. None of the above

Only the service provider has a provides directive.
Since it is not part of the service, option E is the correct answer.

#### Given the diagram, which is a default module?
* A. dog.bark
* B. dog.fluffy
* C. dog.hair
* D. dog.husky
* E. None of the above

[image](./images/dog.hair_automatic_module.jpg)
You need to know about three types of modules for the exam: automatic, named, and unnamed.
There is no such thing as a default module.
The question was trying to trick you, and option E is correct.

#### What is a benefit of using modules? (Choose three.)
* A. Ability to reuse code
* B. Clearer dependency management
* C. Improved performance
* D. Multithreading support
* E. Platform independence
* F. Unique package enforcement

Options A, D, and E are incorrect because they are benefits of Java even without modules.
Option B is correct because the module-info file clarifies dependencies.
Option C is correct because a smaller deployment package can be faster.
Finally, option F is correct because the module
system prevents the same package from being used from multiple JAR files.

#### Which statements are true about the requires directive? (Choose two.)
* A. Changing it to a requires direct directive is always allowed.
* B. Changing it to a requires direct directive is never allowed.
* C. Changing it to a requires direct directive is sometimes allowed.
* D. Including requires java.base is allowed, but redundant.
* E. Including requires java.base is never allowed.
* F. Including requires java.base is sometimes needed to change the meaning of a file.

There is not a requires direct directive, making option B correct.
If the requires transitive directive where used in the answer options instead,
option A would be the answer, since it represents a superset of the functionality.
Additionally, option D is correct because java.base is implied whether you specify it or not.
