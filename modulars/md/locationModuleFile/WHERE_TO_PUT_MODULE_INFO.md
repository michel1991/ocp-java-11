### Consider the following directory structure and the files contained in the directories:
[image](images/javaTest.png)

* A. There should be a module-info.java file in the src directory for it to be a valid module definition.
* B. The foo.bar directory is a valid source module definition.
    The root directory of a source module definition must have module-info.java.
* C. There should be a module-info.java file in the foo.bar directory for it to be a valid source module definition.
* D. There should be a module.java file in the foo directory for it to be a valid module definition.
* E. There should be a module-info.java file in the bar directory for it to be a valid source module definition.
* F. There should be a module.java file in the foo.bar directory for it to be a valid module definition.

As per JEP 261: (https://openjdk.org/jeps/261)
Each module definition is either:
    1.  A module artifact, i.e., a modular JAR file or a JMOD file containing a compiled module definition, or else
    or
    2. An exploded-module directory whose name is, by convention, the module's name
    and whose content is an "exploded" directory tree corresponding to a package hierarchy.

In the latter case the directory tree can be a compiled module definition,
populated with individual class and resource files and a module-info.class file at the root or,
at compile time, a source module definition, populated with individual source files
and a module-info.java file at the root.
correct response is C

### Given the following contents of module-info.java,

```
module enthu.finance{
  exports com.enthu.Reports;
  requires enthu.utils;
}

```


Select correct statements.

* A. Module name is finance.
      Module name is enthu.finance.

* B. com.enthu.Reports is the name of the class that this module exports.
    Remember that only packages can be exported, not individual classes. Therefore, com.enthu.Reports
    is would be the name of the package that this module exports.

* C.  This module depends on enthu.utils package.
 Remember that dependency is always on modules, not on individual classes or packages. Therefore, enthu.utils must be a module name

* D. This file must be present in enthu.finance directory if the source code is to be compiled using the --module-source-path option.

* F. Other modules that depend on this module will be able to access com.enthu.Reports package as well as enthu.utils package.
  Only the packages mentioned in exports clauses of the module-info are made accessible to other modules.

Correct(D)

