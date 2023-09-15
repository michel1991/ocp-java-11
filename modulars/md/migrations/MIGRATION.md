### Which statements are true about migration? (Choose all that apply.)
* A. Bottom-up migration involves automatic modules.
* B. Bottom-up migration involves unnamed modules.
* C. Bottom-up migration involves both the classpath and module path.
* D. Top-down migration involves automatic modules.
* E. Top-down migration involves unnamed modules.
* F. Top-down migration involves both the classpath and module path.

Top-down migration starts with putting all JARs
on the module path as automatic modules, making option D correct.
Bottom-up migration starts with leaving all JARs on
the classpath as unnamed modules, making options B and C correct.


##### Which are true statements about the diagram
##### and scenario in the previous question? (Choose two.)
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

##### Which are true statements about types of migration? (Choose three.)
* A. All modules are immediately moved to the module path in a bottom-up migration.
* B. All modules are immediately moved to the module path in a top-down migration.
* C. Modules migrate before the modules that depend on them in a bottom-up migration.
* D. Modules migrate before the modules that depend on them in a top-down migration.
* E. Modules that are not yet named modules are automatic modules in a bottom-up migration.
* F. Modules that are not yet named modules are automatic modules in a top-down migration

A top-down migration starts by moving all the modules to the module path as automatic modules,
making options B and F correct.
A bottom-up migration moves each module after all modules
it depends on have been migrated, making option C correct.

##### Which statements are true? (Choose two.)
* A. A bottom-up migration has more steps involving the classpath than a top-down migration.
* B. A top-down migration has more steps involving the classpath than a bottom-up migration.
* C. Both types of migration have the same number of steps involving the classpath.
* D. A bottom-up migration has unnamed modules on the module path
* E. A top-down migration has unnamed modules on the module path.
* F. Neither migration type has unnamed modules on the module path.

A bottom-up migration leaves unnamed modules on the classpath
until they are migrated to the module path, making option A correct and option D incorrect.
A top-down migration immediately moves all modules to the module path as automatic
modules making options B and E incorrect. Therefore, option F is the other correct answer.

### Which are true statements about the majority of steps in migrating to a modular application? (Choose two.)
* A. In a bottom-up migration, automatic modules turn into named modules.
* B. In a bottom-up migration, named modules turn into automatic modules.
* C. In a bottom-up migration, unnamed modules turn into named modules.
* D. In a top-down migration, automatic modules turn into named modules.
* E. In a top-down migration, named modules turn into automatic modules.
* F. In a top-down migration, unnamed modules turn into named modules.

A fully modular application has all named modules, making options B and E incorrect.
A bottom-up migration starts out with unnamed modules, making option C correct.
By contrast, a top-down migration starts by making all modules automatic modules, making option D correct.


