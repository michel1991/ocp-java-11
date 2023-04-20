##### Suppose you have a module that contains a class with a call to exports(ChocolateLab.class).
##### Which part of the module service contains this class?
* A. Consumer
* B. Service locator
* C. Service provider
* D. Service provider interface
* E. None of the above

The service locator contains a load() method,
not an exports() method, making option E the answer.

##### Suppose you have separate modules for a service provider interface,
##### service provider, service locator, and consumer.
##### Which module(s) need to specify a requires directive on the service provider?
*  A. Service locator
*  B. Service provider interface
*  C. Consumer
*  D. Consumer and service locator
*  E. Consumer and service provider
*  F. Service locator and service provider interface
*  G. Consumer, service locator, and service provider interface
*  H. None of the above

This question is tricky. The service provider must have a uses directive,
but that is on the service provider interface.
No modules need to specify requires on the service provider since that is the implementation.

#### Suppose the consumer, service locator, service provider,
#### and service provider interface are each in separate modules.
#### Which of the following best describes the following module-info file?

```java
    module nature.tree{
        requires nature.sapling;
    }

```

* A. Consumer
* B. Service locator
* C. Service provider
* D. Service provider interface
* E. None of the above

A consumer requires both the service locator and service provider interface.
A service locator and service provider interface need to have an exports statement.
A service provider needs a provides directive.
Since none of them matches, option E is the correct answer.


