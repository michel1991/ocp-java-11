## Nb: command to display info is (java -X, java --help-extra)

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

#### Suppose the consumer, service locator, service provider,
#### and service provider interface are each in separate modules.
##### Which of the following best describes the following module-info file?

``` java
    module nature.tree {
        provides nature.sapling.Tree with nature.tree.Maple
    }
```

* A. Consumer
* B. Service locator
* C. Service provider
* D. Service provider interface
* E. None of the above


The Maple class is intended to be an implementation of the Tree interface.
However, this interface needs to be accessible.
This module is missing a requires nature.sapling;
statement, making option E the correct answer.



#### Which of the following is true of the following module declaration?
``` java
1: module com.mammal {
    2:    exports com.mammal.cat;
    3:    exports com.mammal.mouse to com.mice;
    4:    uses com.animal;
    5: }

``` 
* A. The first line that fails to compile is line 1.
* B. The first line that fails to compile is line 2.
* C. The first line that fails to compile is line 3.
* D. The first line that fails to compile is line 4.
* E. The code compiles.

This is a correct module-info file.
It exports the com.mammal.cat package to any modules that want to use it.
By contrast, it exports the com.mammal.mouse package to only one other module.
Finally, it demonstrates the uses directive.
Since the code is correct, option E is the answer.
    
##### Fill in the blank with code that belongs in a service provider.
```java
    String cheese = ServiceLoader.load(Mouse.class)
        .stream ()
        .map(______________)
        .map(Mouse::favoriteFood)
        .findFirst()
        .orElse("");
```
* A. Mouse.get()
* B. Mouse::get
* C. Provider.get()
* D. Provider::get
* E. None of the above

The service provider does not have code to look up the service, making option E correct.

