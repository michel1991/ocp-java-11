##
```
    You are trying to compile your module named mycompany.finance.
    You have put all the source files for your module in src directory.
    However, your module requires a mycompany.utils module,
    which is delivered by another team of your company in the form of mycompany.utils.jar file.
     You have kept this jar in libs directory.
    
    Which of the following commands can be used to compile your module?
```

* A. javac --module-source-path src -classpath libs/mycompany.utils.jar --module src

* B. javac --module-source-path src -p libs/mycompany.utils.jar -d out -m mycompany.finance
```
    1. -p is a short form for --module-path and is used to specify the location of modules required by the module that you are trying to compile.
If a module is packaged in a jar file, then you must specify the path of the jar file (or its parent directory).
If the required module is in exploded format, you can specify the parent directory of the module's directory.
    
    2. -m is a short form for --module and is used to specify the module name of the module that you want to compile.
``` 

* C. javac -source-path src -classpath libs -d out --module mycompany.finance
```
-sourcepath and -classpath options are used when you want to compile non-modular code. If you want to compile a module, then --module-source-path and -d options are required.

```

* D. javac --module-source-path src -m libs -d out -s mycompany.finance

* E.javac -s src -p libs -d out -m mycompany.finance
        -s is not a valid option.

Correct(B)