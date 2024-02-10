#### Your application is packaged in myapp.jar and depends on a jar named datalayer.jar,
#### which in turn depends on mysql-connector-java-8.0.11.jar.
#### You have modularized myapp without waiting for datalayer and mysql driver
#### to be modularized and the following are the contents of myapp's module-info:

```
  module abc.myapp{
      requires datalayer;
    }
``` 


#### Assming that com.abc.myapp.Main is the main class
#### of your application that you want to execute, which of the following commands will successfully launch your application?

* A. java -classpath
       mysql-connector-java-8.0.11.jar;datalayer.jar;myapp.jar com.abc.myapp.Main
This is the old way to execute a non-modular app. You can still use it to execute a modular app.

* B. java -module-path
       mysql-connector-java-8.0.11.jar;datalayer.jar;myapp.jar com.abc.myapp.Main

* C. java -p mysql-connector-java-8.0.11.jar;datalayer.jar;myapp.jar
           -m com.abc.myapp.Main

* D. java -p mysql-connector-java-8.0.11.jar;datalayer.jar;myapp.jar
           -m abc.myapp/com.abc.myapp.Main
Remember that, in addition to getting access to all packages in unnamed module (i.e. classes on the classpath),
an automatic module exports all its packages and is allowed to read all packages exported by other modules.
Thus, if you put datalayer and mysql jars also on the module path,
datalayer will still be able to access classes from mysql jar.

* E. java -cp mysql-connector-java-8.0.11.jar -p datalayer.jar;myapp.jar
           -m abc.myapp/com.abc.myapp.Main

Remember that a named module cannot access classes from the unnamed module
(unless the named module is an automatic module).
Now, myapp says it "requires" datalayer module. Thus, datalayer.jar must be put on module-path
so that myapp can access it. Since datalayer is not modularlized,
it will be loaded as an automatic module and will be allowed to access
classes loaded from classpath. Thus, the mysql jar can be put on the classpath.

Note:
--module-path is same as -p
--module is same as -m
-classpath is same as -cp

(Correct A, D, E)

Top Down Approach for modularzing an application

While modularizing an app in a top-down approach, you need to remember the following points -

1. Any jar file can be converted into an automatic module by simply putting that jar on the module-path instead of the classpath.
Java automatically derives the name of this module from the name of the jar file.

2. Any jar that is put on classpath (instead of module-path) is loaded as a part of the "unnamed" module.

3. An explicitly named module (which means, a module that has an explicitly defined name in its module-info.java file)
can specify dependency on an automatic module just like it does for any other module i.e.
by adding a requires <module-name>; clause in its module info but it cannot do so for
the unnamed module because there is no way to write a requires clause without a name.
In other words, a named module can access classes present
in an automatic module but not in the unnamed module.

4. Automatic modules are given access to classes in the unnamed module
(even though there is no explicitly defined module-info and requires clause in an automatic module).
In other words, a class from an automatic module will be able
to read a class in the unnamed module without doing anything special.

5. An automatic module exports all its packages and is allowed to read all packages exported by other modules.
Thus, an automatic module can access: all packages of all other automatic modules + all packages
exported by all explicitly named modules + all packages of the unnamed module (i.e. classes loaded from the classpath).


Thus, if your application jar A directly uses a class from another jar B,
then you would have to convert B into a module (either named or automatic).
If B uses another jar C, then you can leave C on the class path if B hasn't yet been migrated into a named module.
Otherwise, you would have to convert C into an automatic module as well.

Note:
There are two possible ways for an automatic module to get its name:
1. When an Automatic-Module-Name entry is available in the manifest, its value is the name of the automatic module.
2. Otherwise, a name is derived from the JAR filename (see the ModuleFinder JavaDoc for the derivation algorithm)
- Basically, hyphens are converted into dots and the version number part is ignored.
So, for example, if you put mysql-connector-java-8.0.11.jar on module path, its module name would be mysql.connector.java
