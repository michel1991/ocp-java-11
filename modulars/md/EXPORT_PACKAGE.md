#### Which of the following statements are correct regarding the module system of Java.

* A. A module can access all public classes of another module.
    public classes of only the packages that are exported by a module become accessible.

* B. A module can access all public classes of another module if it declares that it requires the other module.
    The other module has to export its packages first. Merely stating that a module requires another module is not sufficient.

* C. A module can access all public classes of another module if those classes are exported by the other module.
    A module can export only packages (not individual classes).
    Public classes of the packages that are exported can then be accessed by other modules.

* D. A module can access public classes of only those packages of another module that the other module exports.

* E. A module can access another module if both are in the same folder.
    This option doesn't make any sense because every module resides in its own independent folder.
    Two modules cannot reside in the same folder.

Here are a few things that you must remember about modules -
1. A module can export only packages (not individual types(classes/interfaces/enums).
    All public types of exported packages can be accessed by other modules.
2. To export a package, a module must write an exports clause for that package in its module-info.java
    For example, in the following module-info.java, module com.foo.bar exports com.foo.bar.alpha package to others.
    This means other modules can access all public types of com.foo.bar.alpha package.

```java
    module com.foo.bar {
        exports com.foo.bar.alpha;
    }
``` 


3. To access another module's exported packages, a module must specify that it
requires the other module using the requires clause. For example,
in the following module-info.java, module com.foo.app specifies
that it requires module com.foo.bar. It can therefore
access all public types of all the packages that are exported by module com.foo.bar.
```java
    module com.foo.app {
        requires com.foo.bar;
    }
``` 

Correct(D)
    