#### Fill in the blanks with the only option that makes
#### this statement false: A(n) ______________ can access ______________
#### of the enclosing class in which it is defined.
* A. static nested class, static members
* B. static nested class, instance members
* C. member inner class, static members
* D. member inner class, instance members
* E. local class, instance members from within an instance method
* F. anonymous class, instance members from within an instance method

A static nested class cannot access instance members
of the enclosing class, making option B correct.
The rest of the options form true statements.

#### Which of the following statements about nested classes are correct? (Choose three.)
* A. An anonymous class can declare that it implements multiple interfaces.
* B. All nested classes can contain constant variables.
* C. A local class can declare that it implements multiple interfaces.
* D. A member inner class can contain static methods.
* E. A static nested class can contain static methods.
* F. A local class can access all local variables prior to its declaration within a method.

Options B, C, and E are valid statements about nested classes.
An anonymous class can declare only one supertype, either a class or an interface,
making option A incorrect. A member inner class cannot contain static methods,
making option B incorrect.
A local class can access only final and effectively final local variables,
making option F incorrect. (Correct B, C, E)

#### Which statements concerning the relation between a non-static inner class and its outer class instances are true?
* A. Member variables of the outer instance are always accessible to inner instances, regardless of their accessibility modifiers.
* B. Member variables of the outer instance can always be referred to using only the variable name within the inner instance.
    This is possible only if that variable is not shadowed by another variable in inner class.
* C. More than one inner instance can be associated with the same outer instance.
* D. An inner class can extend its outer class.
* E. A final outer class cannot have any inner classes.
    There is no such rule.
(correct A, C, D)

#### Which of the following statements are true?
* A. Non-static nested classes must have either default or public accessibility.
    Non-static nested classes (except method local classes), can have any type of accessibility.
* B. Non-static nested classes cannot contain static members.
    They can if the static variable is also made final.
* C. Methods in all nested classes can be declared static.
    Not in non-static inner classes.
* D. All nested classes can be declared static.
    Local (i.e. inside a method) nested classes cannot be declared static.
* E. A static nested class can contain a non - static inner class.


A top level class is a class that is not a nested class.
A nested class is any class whose declaration occurs within the body of another class or interface.
An inner class is a nested class that is not explicitly or implicitly declared static.

Nested classes are divided into two categories: static and non-static.
Nested classes that are declared static are simply called static nested classes.
Non-static nested classes are called inner classes.

Further, a static nested class is behaviorally a top-level class
that has been nested in another top-level class for packaging convenience.

Inner classes can declare a static members only if it is a constant (i.e. final).
To create a class variable for an inner class, the programmer must place the desired variable
in an enclosing class. It is helpful at this point to abuse the terminology somewhat, and say,
loosely, that the static keyword always marks a "top-level" construct (variable, method or class),
which is never subject to an enclosing instance. This shows why an inner class cannot declare a static member,
because the entire body of the inner class is in the scope of one or more enclosing instances.

Declaring a nested class static only means that instances of the class are created without having an outer instance.
It does not put any limits on whether the members of the class can be static or not.

(correct E)


### What classes can a non-static nested class extend ?
### (Provided that the class to be extended is visible and is not final.)

* A. Only the encapsulating class.
* B. Any top level class.
* C. Any class.
* D. It depends on whether the inner class is defined in a method or not.
* E. None of the above.

In general, there is no restriction on what a nested class may or may not extend.
FYI, a nested class is any class whose declaration occurs within the body of another class or interface.
A top level class is a class that is not a nested class.
An inner class is a nested class that is not explicitly or implicitly declared static.
(Correct C)

