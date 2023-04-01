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

##### What statements are most accurate about the ServiceLoader class? (Choose two.)
* A. load() does not take any parameters.
* B. load() takes the class type as a parameter.
* C. When looping through the results of load(), you need to call the get() method on Provider.
* D. When using the results of load() in a Stream, you need to call the get() method on Provider.

The method call of ServiceLoader.load(Poodle.class),
takes a parameter making option B correct and option A incorrect.
When using a Stream, you call Provider::get, making option D the other answer.
Option C is incorrect because you don’t need to call the get() method when using a loop.

##### Which line of code belongs in a service locator?
* A. ServiceLoader˂Mouse˃ sl = ServiceLoader.load(Mouse.class);
* B. ServiceLoader˂Mouse˃ sl = ServiceLoader.loader(Mouse.class);
* C. ServiceLoader˂Mouse˃ sl = ServiceLoader.lookup(Mouse.class);
* D. ServiceLocator˂Mouse˃ sl = ServiceLoader.load(Mouse.class);
* E. ServiceLocator˂Mouse˃ sl = ServiceLoader.loader(Mouse.class);
* F. ServiceLocator˂Mouse˃ sl = ServiceLoader.lookup(Mouse.class);

The service locator contains a ServiceLoader call to the load() method to look up the service loader, which is option A.
