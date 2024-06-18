##
```
Which of the following commands can be used to identify class
and module dependencies of a class named test.A
of module named moduleA without executing it?

Assume that all module files are stored in out directory.
Note: Although identifying module dependency is not explicitly
mentioned in the exam objectives, we have seen questions on
the exam that require you to know about the tool that is used
to identify module dependencies.
```

* A. javac  --module-path out --list-dependencies moduleA/test.A

* B. jmod  --module-path out --describe test.A

    ```
         
        The jmod tool is used to package module files into jmod archives.
        You don't need to know about jmod tool for this exam but you may see it as an option.
*       For example,
        
        jmod describe modfile.jmod will print out the modules used by modfile.jmod
        (Observe that there is no - sign before describe)
    ```

* C. javap --module-path out --show-module-resolution test.A
    The javap tool is used to inspect a class file to see its fields and methods.
    You don't need to know javap tool for this exam.

* D. jdeps --module-path out out\moduleA\test\A.class
    ```
            The jdeps tool is used to find out all dependencies of a class file or a jar file.
             It inspects the given class file (or all class files inside a jar files) and finds out all the required
             modules and packages that are referred to by this class or jar file.
            
            You can add module jars and other jars in its search path using --module-path and --classpath options.
    ```

* E. jdeps --module-path out moduleA\test.A

```
           Remember that jdeps needs the path to the file that you want to inspect.
           moduleA\test.A is not the path to the file A.class.
         out\moduleA\test\A.class or c:\test\java\out\moduleB.jar are the kind of paths that can be used for jdeps tool.
``` 

Correct(D)