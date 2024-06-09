```
  Identify correct statements about following command:

 java -p .\dir1 -cp .\dir2 -m a.b/a.b.c.Main
```

* A. dir1 should have a directory named a.b or a jar file named a.b.jar.
    Since the value given in -p option is a directory, that means, the module could be
   present in dir1 in exploded format also instead of a jar file. Even if the module is packaged in a jar file,
   the name of the jar file need not necessarily be a.b.jar. It can be anything.

* B. If classes from a third party non-modular jar are required by Main, then the third party jar file should be present in dir2 directory.
    If a module requires a third party non-modular jar, then that third party jar file must be added
   to the module-path so that it can be assumed to be an automatic module.
    Further, the module must also add an appropriate requires clause in its module-info.

* C. If the a.b module requires any other module, then that module's jar file must be present in dir1 directory.
    It is not necessary to have a jar file of the module. In this case, dir1 may contain the module in the exploded format also.

* D. Main.class should be present in dir1\a.b\a\b\c directory or, if it is inside a jar, then its path should be \a\b\c.

--
In the given command, classes present on the classpath (i.e. under .\dir2) can be accessed only by an automatic module.
For example, if the module a.b uses an automatic module then that automatic module may access classes stored under .\dir2.
Classes from a.b module cannot access classes on the classpath.

Correct(D)