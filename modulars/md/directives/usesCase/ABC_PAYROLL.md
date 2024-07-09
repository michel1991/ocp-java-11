### You are creating a abc.payroll module that makes its two classes -  com.abc.payroll.Hourly and com.abc.payroll.Yearly - available to all other modules for use. Which of the following files correctly defines this module?

* A.
```java
    module abc.payroll{
      exports com.abc.payroll.*;
    }
```

It is not possible to export classes in a module. You can only export a package in an exports clause. (Explanation)

* B
```
    module abc.payroll{
      exports com.abc.payroll to all;
    }
```
Since both the classes belong to com.abc.payroll package, exporting this package is the only option. (Explanation)

* C.
```
    module abc.payroll{
      exports com.abc.payroll to all;
    }
```

The "exports - to" clause is used to define a qualified export, which means you want to make a package accessible only to those particular modules mentioned after the to clause. But "all" is not valid here. You must specify a module name for a qualified export. For example, if you want to make this package accessible only to com.abc.internal1 and com.abc.internal2modules, then you would write - exports com.abc.payroll to com.abc.internal1, com.abc.internal2;

The modules specified in the to clause are referred to as "friends" of the current module. (Explanation)

* D.
```
    module abc.payroll{
      exports com.abc.payroll.Hourly, com.abc.payroll.Yearly;
    }
``` 

You can have only one package per exports clause. (Explanation)

* E.
```
    module abc.payroll{
      exports com.abc.payroll.Hourly;
      exports com.abc.payroll.Yearly;
    }
```

Correct(B)