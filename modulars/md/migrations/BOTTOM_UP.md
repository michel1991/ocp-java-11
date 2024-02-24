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

### Your application is packaged in myapp.jar and depends on a jar named datalayer.jar,
### which in turn depends on mysql-connector-java-8.0.11.jar. The following packages exist in these jars:
```
myapp.jar:   com.abc.myapp
datalayer.jar: com.abc.datalayer
mysql-connector-java-8.0.11.jar:  com.mysql.jdbc
```

### You want to use bottom up approach for migrating your app to a modular app.
### Which of the following is required before you can do this?

* A. Mysql driver jar and datalayer.jar must first be converted into modular jars.
    In this case, mysql-connector-java-8.0.11.jar would have to become modular first, then datalayer.jar.

    In the top down approach, on the other hand, you would directly make myapp.jar modular by including a module-info
    and adding requires datalayer; clause. You would create an automatic module for datalayer.jar by simply
    placing it on module-path (instead of classpath). You would leave mysql jar on the classpath so that datalayer could access it.

* B. datalayer.jar must first be converted into modular jar. The mysql jar need not be converted.
* C. The mysql jar must first be converted into modular jar. The datalayer.jar need not be converted.
* D. Neither datalayer nor mysql driver need to be converted into modular jars.

(Correct A)

Bottom Up Approach for modularizing an application

While modularizing an app using the bottom-up approach, you basically need to convert lower
level libraries into modular jars before you can convert the higher level libraries. For example,
if a class in A.jar directly uses a class from B.jar, and a class in B.jar directly uses a class from C.jar,
you need to first modularize C.jar and then B.jar before you can modularize A.jar.

Thus, bottom up approach is possible only when the dependent libraries are modularized already