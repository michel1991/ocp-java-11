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