#### Identify correct statements about java modules.

* A. module-info.java may be placed inside any folder of the module.
It must be placed in the root directory of a module.
For example, if you are defining a module named com.xyz.hr, then you must keep module-info.java inside com.xyz.hr folder.

* B. module-info.java must not be empty.
module-info.java cannot be empty and, at a minimum, it must specify the name of the module.
For example, the following are the complete contents of a valid module-info.java file:

```
    module com.xyz.hr{
    }

It defines a module named com.xyz.hr.
Observe that the above module definition is empty. That is, it does not have any clause inside the { }. This is valid.
```

* C. If module-info.java is absent, then the module name is inferred from the directory name in which the source code resides.
If you are creating a module, then module-info.java must be present.
There is a way to create an automatic module but is is created using the name of the jar file in which the classes reside.

* D. module-info.java is compiled into module-info.class by the compiler.
 
* E. module-info.java always belongs to the default package.
module-info defines a module. A module does not depend or belong to any package. Packages belong to a module.

correct(B, D)
