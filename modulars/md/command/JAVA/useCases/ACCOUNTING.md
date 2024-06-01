```
    Your application consists of two jar files produced by two different teams - accounting-3.2.jar
    and reporting-5.6.jar. Classes in reporting-5.6.jar uses classes from com.abc.accounts
    package in accounting-3.2.jar while classes in accounting-3.2.jar do not refer to classes from reporting-5.6.jar.
    
    The application is currently launched using the following command:
    java -classpath accounting-3.2.jar;reporting-5.6.jar com.abc.reporting.Main
    
    The accounting team has decided to modularize the new version of their jar but the reporting team hasn't.
    
    Which of the following commands can be used to launch the reporting application using the new version of accounting jar?
```

* A. java -classpath accounting-3.3.jar;reporting-5.6.jar com.abc.reporting.Main
        Since the structure of a modular jar is same as a regular jar, it can still be used in the old manne

* B.
```
java -classpath reporting-5.6.jar --module-path accounting-3.3.jar;
com.abc.reporting.Main
```
     
  (explanation)
Since the Main class is loaded from reporting jar, which is not a modular jar,
the JVM does not know which modules are required by this class. So, even though accounting jar is on the module-path,
it will not be loaded and so, classes from accounting jar will not be found.

You will need to use --add-modules option to make it work but this option is not in scope for the exam.

* C. java  --module-path accounting-3.3.jar;reporting-5.6.jar com.abc.reporting.Main

* D.
    ```
    java  --module-path accounting-3.3.jar;reporting-5.6.jar
            --add-modules accounting
            --module reporting/com.abc.reporting.Main
        (Assume that the module name in accounting-3.3.jar is accounting.)
    ```
     (Explanation D)
    By putting reporting jar on module path, we are essentially converting it into an automatic module
    (which means it is now a module with name reporting and with no requires clause.).
    Since an automatic module is allowed to read all exported packages of other named modules,
    classes in the reporting module will be able to access exported packages of the accounting module.
    
    Further, since reporting.jar is an automatic module, it doesn't have any module-info and so,
    java cannot determine the modules that it requires and so, java does not automatically
    load the modules contained in other jars present on module-path (even though those modules are readable) to classes in reporting.jar.
    We need to tell java to load the accounting module present in accounting-3.3.jar by using the --add-modules option.



Correct(A, D)
