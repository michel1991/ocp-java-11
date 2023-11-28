#### Suppose you have the following class in a module named animal.insect.impl.
#### Which two most likely go in the module-info of the service locator? (Choose two.)

```java
    package animal.insect.impl;

    import animal.insect.api.bugs.Bug;

    public class Worm implements Bug {
        @Override
        public int crawl() {
            return 1;
        }
    }
```

* A. requires animal.insect.api.bugs;
* B. requires animal.insect.api.bugs.Bug;
* C. requires animal.insect.impl;
* D. uses animal.insect.api.bugs;
* E. uses animal.insect.api.bugs.Bug;
* F. uses animal.insect.api.bugs.Bug with animal.insect.impl.Worm;

This question is tricky because the service provider code is shown,
but the question asks about the service locator, and you need
to infer information about the service provider interface.
The requires directive is option A due to process of elimination.
Option B is incorrect because the requires directive references
a module name rather than an interface.
Option C is incorrect because we need the service provider interface module,
and it refers to the service provider module.
Option E is easier, since the uses directive works with an interface name.


###### Suppose you are writing a class that calls ServiceLoader and is trying
###### to look up the Dragon implementation.
###### Which line of code needs to be in your module-info.java?

``` java
    package magic;
    public interface Magic {
        String getPower();
    }

    package dragon;
    import magic.*;

    public class Dragon implements Magic {
        public String getPower() {
            return "breathe fire";
        }
    }

```
* A. uses dragon;
* B. uses dragon.Dragon;
* C. uses magic.Magic;
* D. uses dragon.Dragon as magic.Magic;
* E. uses dragon.Dragon with magic.Magic;
* F. None of the above

A service locator specifies the interface name, making option C correct.
Note that options D and E are trying to trick you by mixing
up the provides directive syntax with the uses directive syntax.

#### Which clause(s) are used by a module definition that uses a service?

* A. exports
* B. provides
    This is used by the provider module to specify the service interface and
    the implementing class that implements the service interface. For example,
    provides org.printservice.api.Print with com.myprinter.PrintImpl
* C. uses
    A uses clause is used by the module that uses a service. For example,
    uses org.printservice.api.Print;
* D. implements
    This is not a valid clause in module-info.
* E. requires
    The module that uses a service must require the module that defines the service interface.
```java
/*  For example, if an abc.print module implements an org.printing.Print
     service interface defined in PrintServiceAPI module using com.abc.PrintImpl class,
     then this is how its module-info should look:
*/

module abc.print{
    requires PrintServiceAPI; //required
    //because this module defines the service interface org.printing.Print

    provides org.printing.Print with com.abc.PrintImpl;
}

//A module named customer that uses Print service may look like this:

module customer{
    requires PrintServiceAPI; //required
    //because this module defines the service interface org.printing.Print

    uses org.printing.Print; //specifies that this module uses this service

    //observe that abc.print module is not required.
}


```

Correct(C, E)

