### Which statements are true about migration? (Choose all that apply.)
* A. Bottom-up migration involves automatic modules.
* B. Bottom-up migration involves unnamed modules.
* C. Bottom-up migration involves both the classpath and module path.
* D. Top-down migration involves automatic modules.
* E. Top-down migration involves unnamed modules.
* F. Top-down migration involves both the classpath and module path.

Top-down migration starts with putting all JARs on the module path as automatic modules, making option D correct.
Bottom-up migration starts with leaving all JARs on the classpath as unnamed modules, making options B and C correct.

### For a bottom-up migration, all modules other than named modules are ________________ modules and on the __________________.
* A. automatic, classpath
* B. automatic, module path
* C. unnamed, classpath
* D. unnamed, module path
* E. None of the above

A bottom-up migration strategy leaves all JARs on the classpath until they are migrated.
Then it migrates the lowest-level module to be a named module, leaving the other modules as unnamed modules.
Option C is correct as it matches both of those characteristics.

### For a top-down migration, all modules other than named modules are ________________ modules and on the __________________.
* A. automatic, classpath
*  B. automatic, module path
*  C. unnamed, classpath
*  D. unnamed, module path
*  E. None of the above

A top-down migration strategy first places all JARs on the module path.
Then it migrates the top-level module to be a named module, leaving the other modules as automatic modules.
Option B is correct as it matches both of those characteristics.

#### Which best describes a top-down migration? (Choose two.)
* A. The first step is to move all the modules to the module path.
* B. The first step is to move a single module to the module path.
* C. Most steps consist of changing an automatic module to a named module.
* D. Most steps consist of changing an automatic module to a unnamed module.
* E. Most steps consist of changing an unnamed module to an automatic module.
* F. Most steps consist of changing an unnamed module to a named module

Option A is correct because a top-down migration starts by moving all the modules to the module path as automatic modules.
Then, the migration changes each module from an automatic module to a named module, making option C the other correct answer

#### Which are true statements about the diagram and scenario in the previous question? (Choose two.)
* A. butterfly is an automatic module.
* B. butterfly is a named module.
* C. butterfly is an unnamed module.
* D. caterpillar is an automatic module.
* E. caterpillar is a named module.
* F. caterpillar is an unnamed module.

[image](images/butterfly_caterpillar.jpg)
In a bottom-up migration, the lowest-level modules are migrated
to named modules on the module path first.
This makes option E one of the answers.
The modules that remain on the classpath are unnamed modules, making option C the other answer.

##### This diagram shows the second step of a migration to modules. What type of migration is this?
* A. Bottom-up.
* B. Side-to-side.
* C. Top-down.
* D. There is not enough information to determine which type it is.

[image](images/butterfly_caterpillar.jpg)
There is no such thing as a side-to-side migration, ruling out option B.
In a top-down migration, all modules are moved to the module path first,
making option C incorrect. In a bottom-up migration,
modules are moved, starting with those without dependencies.
Therefore, option A is correct.
