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