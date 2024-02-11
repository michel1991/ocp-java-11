### Identify correct statements about Java platform module system.


* A. A module is a set of packages that make sense being grouped together and is designed for reuse.

* B. The module system ensures that code that is internal to a platform implementation is not accessible from outside the implementation.

* C. The  module system uses only two phases - compile time and run time - for building an application.
Besides compile time and run time, the module system adds the notion of "link time", which is an optional
phase between the two in which a set of modules can be assembled and optimized into a custom run-time image.
The benefit of this phase is that the size of the resulting  application is reduced because only those
classes that are actually used are included in the application artifacts.

* D. All classes in a module are concealed and cannot be accessed by code from other modules. Only interfaces are visibile outside the package.
What is visibile and what not visible to the outside world is controlled by the module developer
through the information that he provides in module-info.java. He can choose to export any member
of a module through exports clauses in module-info.java file of the module.

Nothing is exported by default. I.e.
if a module’s declaration contains no exports clauses then it will not export any types at all to any other modules.
Correct(A, B)