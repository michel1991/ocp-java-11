##### When adding a new service provider, which of these do you need to recompile?
* A. Consumer
* B. Service locator
* C. Existing service providers
* D. Service provider interface
* E. None of the above

One of the benefits of services is not having to recompile
existing code when adding a new implementation.
This makes option E the correct answer.

##### How many service providers are allowed to implement
##### a service provider interface and have the consumer reference the first one?
* A. Exactly one
* B. Exactly two
* C. One or two
* D. One or more
* E. None of the above

There can be multiple service providers
for a single service provider interface, making option D the correct answer.

### What is true about a service provider module? (Choose all that apply.)
* A. It contains the interface that implementations must provide
* B. It contains exactly one implementation of the interface.
* C. It contains one or more implementations of the interface.
* D. It can be changed without recompiling any other modules.
* E. It must have a provides directive.
* F. It must have a uses directive.

A service provider interface declares the interface rather than a service provider,
making option A incorrect.
Each service provider is allowed to provide only one service provider implementation,
making option B correct and option C incorrect.
One of the benefits of services is being able to change
the service provider dynamically, making option D correct.
Finally, a service provider interface uses while a service provider provides,
making option E correct and option F incorrect.
