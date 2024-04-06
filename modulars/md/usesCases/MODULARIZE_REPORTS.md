#### Your group has an existing application (reports.jar) that uses a library (analytics.jar) from another group in your company.
#### Both - the application and the library - use a JDBC driver packaged in ojdbc8.jar.
#### Which of the following options describes the steps that will be required to modularize your application?

* A.
    1. Convert analytics.jar and ojdbc8.jar into automatic modules
    2. Convert reports.jar into a named module.
    3. Add requires clauses for analytics and ojdbc8 in reports.jar in its module-info.java.
   
* B    
    1. Modularize analytics.jar and ojdbc8.jar into modules by adding module-info.java to these jars.
    2. Convert reports.jar into a named module.
    3. Add requires clauses for all packages contained in analytics.jar and ojdbc8.jar that are directly referred
      to by classes in reports.jar in its module-info.java.
   
    Modularizing third party jars on your own is not a good idea because then you will have to keep doing
    that whenever you get an updated version of the third party jar.
    You can simply use third party jars as automatic modules without doing anything.
    Also, requires clauses are used to specify modules (not packages).

* C. 
    1. Convert reports.jar into a named module.
    2. Add requires clauses for analytics and ojdbc8 modules in reports.jar in its module-info.java.
    3. Use analytics.jar and ojdbc8.jar as unnamed modules.
    Classes in unnamed modules cannot be accessed by a named module.

* D. 
    1. Convert ojdbc8.jar into automatic module.
    2. Convert analytics.jar into a named module by adding module-info.java to it. In this module-info,
      export all packages that are used by reports.jar and add requires clauses for all packages of ojdbc.jar that are used by analytics.jar.
    3. Convert reports.jar into a named module. Add requires clause for analytics module in reports's module-info.java.
 

If a module directly uses classes from another jar, then that jar has to be converted into a module (either named or automatic).
So, if you want to modularize reports.jar, then analytics.jar and ojdbc8.jar must also be converted into a module.
Since these two jars are not controlled by you, they can be converted into automatic modules.
module-info for reports.jar must have requires clauses for the two automatic modules (whose names will be analytics and ojdbc8).
Since an automatic module is allowed to access classes from all other modules, nothing special needs to be done for analytics.jar.
It will be able to access all classes from ojdbc.jar.

Correct(A)