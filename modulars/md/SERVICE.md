##### Which is true about a service? (Choose two.)
* A. Changing the service provider interface always requires recompiling the service provider.
* B. Changing the service provider interface sometimes requires recompiling the service provider.
* C. Changing the service provider interface never requires recompiling the service provider.
* D. If the service provider interface references other classes in the method signatures, they are considered part of the service.
* E. If the service provider interface references other classes in the method signatures, they are not considered part of the service.

Option B is correct because it depends on the change.
If a method is added to the service provider interface
or a public method is changed, the service providers must be recompiled.
However, if a change is made that does not affect the service provider,
such as a new static method, recompilation is not needed.
Option D is also correct because return types and parameter
types are considered part of the service.

### Which of the following pairs make up a service?
* A. Consumer and service locator
* B. Consumer and service provider interface
* C. Service locator and service provider
* D. Service locator and service provider interface
* E. Service provider and service provider interface

A service consists of the service provider interface
and logic to look up implementations using a service locator.
This makes option D correct.
Make sure you know that the service provider itself is the implementation,
which is not considered part of the service.

##### Which are considered part of a service?
* A. Classes referenced by the implementation, but not the interface
* B. Classes referenced by the interface, but not the implementation
* C. Classes referenced by either the implementation or the interface
* D. None of the above

A service is comprised of the interface, any classes the interface references,
and a way to look up implementations of the interface.
It does not include the implementation. This makes option A the correct answer.

#### Which two would be best to combine into a single module?
* A. Consumer and service locator
* B. Consumer and service provider
* C. Consumer and service provider interface
* D. Service locator and service provider interface
* E. Service locator and service provider
* F. Service provider and service provider interface

The consumer is generally separate ruling out options A, B, and C.
The service provider is decoupled from the service provider interface ruling out option F.
It is most logical to combine the service locator
and service provider interface because neither
has a direct reference to the service provider. Therefore, option D is correct.
