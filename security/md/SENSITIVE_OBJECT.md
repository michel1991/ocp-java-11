#### Which techniques best prevent sensitive
#### objects from being manipulated by an attacker
#### who wants to create a malicious subclass? (Choose three.)
* A. Add finalto the class declaration.
* B. Setprotectedas the access level for all method declarations.
* C. Add final to all method declarations.
* D. Add finalto all instance variable declarations.
* E. Add finalto all constructors.
* F. Setprivateas the access level for all constructors.

The best way to protect a sensitive class is to prevent
the class from being extended or prevent any of its methods from being overridden.
Options A and C accomplish this. Option F also is appropriate.
By marking all constructors private, onlystatic methods
that the class controls can be used to obtain instances of the object.
Options B and D are incorrect because they do not prevent methods
from being overridden that could change the behavior of the class.
Option E is incorrect because constructors cannot be marked final.

### What are two motivations for marking a class final? (Choose two.)
*  A. Guarantee behavior of a class
*  B. Allow the class to be extended
*  C. Improve security
*  D. Support polymorphism
*  E. Improve performance
*  F. Ensure the contents of the class are immutable

Marking a class final tends to improve security by guaranteeing
the behavior of a class is not replaced by overridden methods at runtime.
For this reason, options A and C are correct.
Option B is incorrect and is the opposite of what marking a class final does.
Options D and E are incorrect and have nothing to do with marking a class final.
Option F is incorrect as the contents of the class can still be changed,
even if the class is marked final.

##### Which techniques can prevent an attacker from creating a top-level subclass
##### that overrides a method called from the constructor? (Choose all that apply.)
* A. Adding final to the class
* B. Adding final to the method
* C. Adding transient to the class
* D. Adding transient to the method
* E. Making the constructor private
* F. None of the above

Options A and E are correct because they prevent subclasses
from being created outside the class definition.
Option B is also correct because it prevents overriding the method.
Options C and D are incorrect because transient
is a modifier for variables, not classes or methods.
