#### Your application consists of two jar files produced by two different teams - accounting-3.2.jar and reporting-5.6.jar.
#### Classes in reporting-5.6.jar uses a class com.abc.account.Account in accounting-3.2.jar while classes in accounting-3.2.jar
#### do not refer to classes from reporting-5.6.jar.
#### The accounting team has decided to modularize their jar.
#### Which of the following would be a valid module-info.java for the new accounting-3.3.jar?

* A.
```java
    module accounting{
requires com.abc.account;
}
``` 


* B.
```java
    module accounting{
export com.abc.account.*;
}
``` 


* C.
```java
  module accounting{
exports com.abc.account;
}
``` 

* D. 
```java
  module accounting{
export com.abc.account;
}
```

* E. 
```java
module accounting{
export com.abc.account.Account;
}
```
 module "exports" packages,  not individual classes

* F. 
```java
  module accounting{
provides com.abc.account;
}
```

```txt
  Note: explanation for F
  A provides clause is used by a module to specify that it implements a particular service . For example, a jdbc driver module may contain:

module com.mysql{
    provides java.sql.Driver with com.abc.jdbc.Driver;
}
```

Correct(C)