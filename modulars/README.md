#Which are true statements? (Choose all that apply.)
* A. An automatic module exports all packages to named modules.
* B. An automatic module exports only the specified packages to named modules
* C. An automatic module exports no packages to named modules.
* D. An unnamed module exports only the named packages to named modules.
* E. An unnamed module exports all packages to named modules.
* F. An unnamed module exports no packages to named modules.

An automatic module exports all packages, making option A correct.
An unnamed module is not available to any modules on the module path.
Therefore, it doesn’t export any packages, and option F is correct.

#Which of the following options does not have a one-character shortcut in any of the commands studied in this chapter? (Choose all that apply.)
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

#Which options are valid on the jar command without considering module options? (Choose all that apply.)
* A. -c
* B. -C
* C. -cp
* D. -d
* E. -f
* F. -p

When creating a jar file, you use the options -cf or -cvf, making options A and E correct. It also allows the specification of a directory using -C, making option B correct.
Options D and E are incorrect because -d and -p are used for modules.

#Suppose you have a module named com.vet. Where could you place the following module-info.java file to create a valid module?

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

