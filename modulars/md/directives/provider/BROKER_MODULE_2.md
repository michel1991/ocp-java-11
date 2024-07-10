### Given:

```
module broker{
  exports org.broker.api;
}

``` 

### The broker module contains org.broker.api.Installer interface, which is implemented by com.foo.AppInstaller class of com.foo module.Which of the following is a valid module definition for  com.foo module?

* A.
```
module com.foo{
  exports broker;
}

``` 

* B.
```
module com.foo{
  provider broker;
}
``` 

* C. 
```
module com.foo{
  requires broker;
  provides org.broker.api;
}
``` 

* D.
```
module com.foo{
  requires broker;
  exports com.foo;
  provides org.broker.api.Installer with com.foo.AppInstaller;
}
``` 


* E.
```
module com.foo{
  exports com.foo;
  provides org.broker.api.Installer with com.foo.AppInstaller;
}
```


You need to remember the following points regarding the module that provides a service:

1. It "requires" the module that defines the service.
2. It must specify that it provides an implementation for the service using the "provides - with" clause.
3. It does not need to export its packages to the outside world. The user of the service is not even aware of the actual implementation class or the module that provides the implementation of the service. There is no restriction on exporting the packages though.

Correct(D)
