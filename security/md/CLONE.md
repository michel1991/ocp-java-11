##### Which statements about the clone() method are correct? (Choose two.)
* A. Calling clone() on a class that does not implement Cloneable results in a compiler error.
* B. Calling clone() on a class that does not implement Cloneable results in an exception at runtime.
* C. If a class implements Cloneable and does not override the clone() method, then the code does not compile.
* D. If a class implements Cloneable and does not override the clone() method, then an exception is thrown at runtime.
* E. Overriding the clone() method in a class that implements Cloneableguarantees at least a shallow copy will be performed.
* F. Overriding the clone() method in a class that implements Cloneablemay result in a deep copy.

The clone() method is inherited from the Object class. For this reason,
it can be called on any Object without resulting in a compiler error,
making options A and C incorrect. Option B is correct and defines the default behavior of clone()
if the class does not implement Cloneable. On the other hand,
if a class implements Cloneable but does not override clone(),
then Java will perform a shallow copy by default, making option D incorrect.
Finally, if the class implements Cloneable and overrides clone(),
then the behavior of the clone() method is entirely dependent on the implementation.
For this reason, option F is correct, and option E is incorrect.