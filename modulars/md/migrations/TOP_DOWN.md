#### For a top-down migration, all modules other
#### than named modules are ________________ modules and on the __________________.
*  A. automatic, classpath
*  B. automatic, module path
*  C. unnamed, classpath
*  D. unnamed, module path
*  E. None of the above

A top-down migration strategy first places all JARs on the module path.
Then it migrates the top-level module to be a named module,
leaving the other modules as automatic modules.
Option B is correct as it matches both of those characteristics.

#### Which best describes a top-down migration? (Choose two.)
* A. The first step is to move all the modules to the module path.
* B. The first step is to move a single module to the module path.
* C. Most steps consist of changing an automatic module to a named module.
* D. Most steps consist of changing an automatic module to a unnamed module.
* E. Most steps consist of changing an unnamed module to an automatic module.
* F. Most steps consist of changing an unnamed module to a named module

Option A is correct because a top-down migration starts
by moving all the modules to the module path as automatic modules.
Then, the migration changes each module from an automatic
module to a named module, making option C the other correct answer