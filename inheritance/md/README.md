### Which statements about top-level types and member inner classes are correct? (Choose all that apply.)
* A. A member inner class can be marked final.
* B. A top-level type can be marked protected.
* C. A member inner class cannot be marked public since that would make it a top-level class.
* D. A top-level type must be stored in a .java file with a name that matches the class name.
* E. If a member inner class is marked private, then it can be referenced only in the outer class for which it is defined.

An inner class can be marked abstract or final,just like a regular class, making option A correct.
A top-level type, such as a class, interface, or enum,
can only be marked public or default (package-private), making option B incorrect.
Option C is incorrect, as a member inner class can be marked public,
and this would not make it a top-level class.
A .java file may contain multiple top-level classes, making option D incorrect.
The precise rule is that there is at most one public top-level type,
and that type is used in the file name.
Finally, option E is correct. When a member inner class is marked private,
it behaves like any other private members
and can be referenced only in the class in which it is defined.

#### Which statements about instance keywords are correct? (Choose two.)
* A. The that keyword can be used to read public members in the direct parent class.
* B. The this keyword can be used to read all members declared within the class.
* C. The super keyword can be used to read all members declared in a parent class.
* D. The that keyword can be used to read members of another class.
* E. The this keyword can be used to read public members in the direct parent class.
* F. The super keyword can be used in static methods.

There is no that keyword, so options A and D are incorrect.
Option B is correct, as this can access all members declared within the class.
Option C is incorrect, as only inherited members can be accessed.
For example, private members declared in a parent class cannot be accessed using super.
Option E is correct, as this allows access to members declared in the class and those inherited from a parent.
Finally, option F is incorrect, as static methods do not have access to this or super references.


