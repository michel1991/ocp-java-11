### Consider the following code appearing in a module-info.java
```
 module com.amazing.movies{ //1
   exports com.amazing.movies; //2
   exports com.amazing.movies to com.amazing.rentals;//3
   requires transitive com.amazing.customer;//4
}

``` 

Identify correct statements.

* A. This is a valid module info.
* B. This is an invalid module info because the name of the module and the name of a package that it exports are the same.
* C. This is an invalid module info because line marked //3 uses incorrect syntax.

* D. This is an invalid module info because lines marked //2 and //3 are in conflict.
You cannot have duplicate statements in a module info. Lines marked //2 and //3
are exporting the same module in different ways and are therefore in conflict. One of them must be removed.

* E. This is an invalid module info because lines marked //3 and //4 use incorrect syntax.
Line marked //4  is valid.

Correct(D)

Note that the exports-to clause exports a package to a specific list of modules. For example, if you have :

exports com.acme.db to com.acme.dto, com.acme.service;

then only the classes in com.acme.dto and com.acme.service modules will be allowed to access the classes in package com.acme.db.

The modules after the to clause have to be listed explicitly. You can't use * to mean all modules.
If you want to expose a package to all modules, just leave the to clause.

The requires-transitive clause means that if any module that requires
this module will also automatically require (hence, will be able to read, without explicitly requiring it)
the module mentioned in the requires transitive clause. For example, if you have :

```
 module com.amazing.app{
   requires transitive com.amazing.customer;//4
}
```



then any module that contains requires com.amazing.app; clause will automatically be able to
read the com.amazing.customer module without any additional requires clause.
