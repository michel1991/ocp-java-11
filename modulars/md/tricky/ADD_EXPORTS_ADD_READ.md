### Which of the following statements are correct regarding the module system of Java.


* A. Although not recommended, it is possible to customize what packages a module exports from the command line.

* B. An advantage of java modules functionality is that users of a module cannot alter the list of exported packages of that module.

* C. If a module does not export a package, there is no way to export that package to all other modules from the command line.
It can still be exported using --add-export command line option.

* D. If a module wants to read another module but only temporarily, it can request such access using command line options.

* E. A module can request access to another module temporarily using command line options but only if the target package already exports that package in its module-info.
Even packages that have not been exported in module-info can be made accessible using --add-exports command line option

Correct(A, D)

There are three command line options applicable to javac and java that can be used
for customizing exports and requires configurations of modules temporarily (temporarily means only for that particular command execution).
These are: add-reads, add-exports, and, add-opens. For example,
if you want moduleA to be able to read public packages of moduleB and neither
of the modules have appropriate information in their respective module-info files,
then you can use the following commands to enable such access :

javac --add-reads moduleA=moduleB --add-exports moduleB/com.modB.package1=moduleA ...
java --add-reads moduleA=moduleB --add-exports moduleB/com.modB.package1=moduleA ...

--add-reads moduleA=moduleB implies that moduleA wants to read all exported packages of moduleB.
--add-exports moduleB/com.modB.package1=moduleA implies that moduleB exports package com.modB.package1 to moduleA.

--add-open is used to provide access to private members of classes through reflection but is not required for 1Z0-815 exam.