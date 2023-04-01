##### A class in which of the following parts of a module service
##### should include a method call to load(ChocolateLab.class)
##### that would allow callers to use it?
* A. Consumer
* B. Service locator
* C. Service provider
* D. Service provider interface
* E. None of the above

The service locator contains a load() method, making option B correct.

#### Which is a benefit of ServiceLoader?
*  A. It allows you to add functionality without recompiling the application.
*  B. It allows you to load a service written in C++.
*  C. It is an interface.
*  D. When implementing a service, it references the ServiceLoader.

Option A is correct because ServiceLoader allows you to make your application extensible.
A service can be added without recompiling the entire application.
It is a class, but the service provider implementation does not reference it,
making options C and D incorrect. Option B is not a feature of Java.