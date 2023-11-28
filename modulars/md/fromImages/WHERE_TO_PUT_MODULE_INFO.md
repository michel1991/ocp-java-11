### Consider the following directory structure and the files contained in the directories:
[image](images/javaTest.png)

* A. There should be a module-info.java file in the src directory for it to be a valid module definition.
* B. The foo.bar directory is a valid source module definition.
    The root directory of a source module definition must have module-info.java.
* C. There should be a module-info.java file in the foo.bar directory for it to be a valid source module definition.
* D. There should be a module.java file in the foo directory for it to be a valid module definition.
* E. There should be a module-info.java file in the bar directory for it to be a valid source module definition.
* F. There should be a module.java file in the foo.bar directory for it to be a valid module definition.

As per JEP 261:
Each module definition is either:
    1.  A module artifact, i.e., a modular JAR file or a JMOD file containing a compiled module definition, or else
    or
    2. An exploded-module directory whose name is, by convention, the module's name
    and whose content is an "exploded" directory tree corresponding to a package hierarchy.

In the latter case the directory tree can be a compiled module definition,
populated with individual class and resource files and a module-info.class file at the root or,
at compile time, a source module definition, populated with individual source files
and a module-info.java file at the root.
