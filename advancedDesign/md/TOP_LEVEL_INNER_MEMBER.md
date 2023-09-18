### Which statements about top-level and member inner types are correct? (Choose all that apply.)
* A. A public top-level interface may only be declared in a file that uses the same name as the interface.
* B. An interface may not be declared as a member of a class.
* C. A .java file may contain multiple top-level Java classes and interfaces.
* D. If a member inner class is marked private, it cannot be used outside the class.
* E. A member inner class may only be declared public or default (package-private).
* F. A member inner class cannot be marked abstract.

A .java file may contain multiple top-level classes or interfaces, although only one of them can be public.
If one of the types is public, then the name must match the filename.
For this reason, options A and C are correct.
Option B is incorrect, as a member inner type can be a class or an interface.
Option D is also incorrect, as this applies to all private members of a class.
Option E is incorrect, as that restriction applies to top-level classes, not member inner classes.
Finally, option F is incorrect, as member classes can be abstract or concrete.