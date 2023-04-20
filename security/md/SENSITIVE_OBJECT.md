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