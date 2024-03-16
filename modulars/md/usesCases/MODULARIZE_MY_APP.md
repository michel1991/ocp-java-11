### You are trying to modularize an existing application that uses a few Apache open source jar files.
### Some of those jar files have been modularized but some have not. Details of such jar files are as follows:

```
commons-beanutils-1.9.jar

commons-collections4-4.0.jar
   (Automatic-Module-Name: org.apache.commons.collections4)

commons-lang3-3.6.jar
   (Automatic-Module-Name: org.apache.commons.lang3)

commons-text-1.2.jar
   (Automatic-Module-Name: org.apache.commons.text)

``` 

What should the module-info file for your application contain?

* A.
```
module myapp{
  requires commons.beanutils-1.9;
  requires commons.collections4-4.0;
  requires commons.lang3-3.6;
  requires commons.text-1.2;
}
``` 


*   B.
```
 module myapp{
    requires commons.beanutils-1.9;
    requires commons.collections4-4.0;
    requires commons.lang3-3.6;
    requires commons.text-1.2;
}
``` 


* C
```
module myapp {
   requires commons.beanutils;
   requires commons.collections4;
   requires commons.lang3;
   requires commons.text;
}
``` 


* D
```
module myapp{
  requires commons.beanutils;
  requires org.apache.commons.collections4;
  requires org.apache.commons.lang3;
  requires org.apache.commons.text;
}
``` 

When you use a non modular jar file as an automatic module, the name of the jar file is used to formulate the module name for that module.
You need to know the following two basic rules while deriving this name from the file name:

1. The dashs are converted to dots and the version information and the file extension present in the file name are ignored.
Therefore, for example, the module name for commons-beanutils-1.9.jar  will be commons.beanutils.

2. If the jar file's manifest contains the Automatic-Module-Name entry, then that value is used as the module name
(the name of the jar file is ignored completely).
Therefore, in the given problem statement, module name for commons-collections4-4.0.jar will be org.apache.commons.collections4.
(Correct D)