##### Suppose you have a module that contains a class with a call to exports(ChocolateLab.class).
##### Which part of the module service contains this class?
* A. Consumer
* B. Service locator
* C. Service provider
* D. Service provider interface
* E. None of the above

The service locator contains a load() method, not an exports() method, making option E the answer.

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

This question is tricky. The service provider must have a uses directive, but that is on the service provider interface.
No modules need to specify requires on the service provider since that is the implementation.

###### Suppose you have separate modules for a service provider interface,
###### service provider, service locator, and consumer.
###### Which statements are true about the directives
###### you need to specify? (Choose all that apply.)
* A. The consumer must use the requires directive.
* B. The consumer must use the uses directive.
* C. The service locator must use the requires directive.
* D. The service locator must use the uses directive.

Option A and C are correct because both the consumer
and the service locator depend on the service provider interface.
Additionally, option D is correct because
the service locator must specify that it uses the service provider interface to look it up.

###### Suppose you have separate modules for a service provider interface,
###### service provider, service locator, and consumer.
###### If you add a second service provider module,
###### how many of these modules do you need to recompile?
A. Zero
B. One
C. Two
D. Three
E. Four

Since this is a new module, you need to compile the new module.
However, none of the existing modules needs to be recompiled,
making option A correct.
The service locator will see the new service
provider simply by having the new service provider on the module path.

##### Suppose you have separate modules for a service provider interface,
##### service provider, service locator, and consumer.
##### If you change the implementation of the service provider,
##### how many of these modules do you need to re-compile?
* A. Zero
* B. One
* C. Two
* D. Three
* E. Four

Since the service provider itself is changing, it needs to be re-compiled.
However, none of the other modules does, making option B correct.

###### Suppose you have separate modules for a service provider interface,
###### service provider, service locator, and consumer.
###### Which modules need to specify a requires directive
###### on the service provider interface?
* A. Service locator
* B. Service provider
* C. Consumer
* D. Consumer and service locator
* E. Consumer and service provider
* F. Service locator and service provider
* G. Consumer, service locator, and service provider
* H. None of the above

The service provider interface needs to be available to all three, making option G correct.
The service provider needs to implement the interface. The service locator needs it to look up the interface.
The consumer needs it to call methods on the interface.

###### Suppose you have separate modules for a service provider interface,
###### service provider, service locator, and consumer.
###### If you add a new abstract method to the service provider interface
###### and call it from the consumer module, how many of these modules do you need to re-compile?
* A. Zero
* B. One
* C. Two
* D. Three
* E. Four

Since you are changing the service provider interface,
you have to re-compile it. Similarly, you need to re-compile the service provider
because it now needs to implement the new method.
The consumer module needs to be re-compiled as well since the code has changed to call the new method.
Therefore, three modules need to be re-compiled, and option D is correct.
The service locator does not need to be re-compiled since it simply looks up the interface.
For more information, see Chapter 6.

##### Suppose you have separate modules for a service provider interface,
##### service provider, service locator, and consumer.
##### If you add a second service provider module, how many of these modules do you need to recompile?
*  A. Zero
*  B. One
*  C. Two
*  D. Three
*  E. Four

Since this is a new module, you need to compile the new module.
However, none of the existing modules needs to be recompiled,
making option A correct.
The service locator will see the new service
provider simply by having the new service provider on the module path.