##### For a bottom-up migration, all modules other
##### than named modules are ________________ modules and on the __________________.
* A. automatic, classpath
* B. automatic, module path
* C. unnamed, classpath
* D. unnamed, module path
* E. None of the above

A bottom-up migration strategy leaves all JARs on the classpath until they are migrated.
Then it migrates the lowest-level module to be a named module,
leaving the other modules as unnamed modules.
Option C is correct as it matches both of those characteristics.