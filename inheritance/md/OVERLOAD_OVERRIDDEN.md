### Which of the following statements about methods are true? (Choose all that apply.)
* A. Overloaded methods must have the same signature.
* B. Overridden methods must have the same signature.
* C. Hidden methods must have the same signature.
* D. Overloaded methods must have the same return type.
* E. Overridden methods must have the same return type.
* F. Hidden methods must have the same return type.

Overloaded methods have the method name but a different
signature (the method parameters differ), making option A incorrect.
Overridden instance methods and hidden static methods must
have the same signature (the name and method parameters must match),
making options B and C correct.
Overloaded methods can have different return types,
while overridden and hidden methods can have covariant return types.
None of these methods are required to use the same return type,
making options D, E, and F incorrect.

### Which of the following statements about overridden methods are true? (Choose all that apply.)
* A. An overridden method must use an access modifier that is the same or less restrictive than the method it overrides.
* B. An overridden method can declare new unchecked exceptions that are not defined in the method it overrides.
* C. An overridden method may refrain from declaring any or all of the exceptions as the method it overrides.
* D. A method overriding another method cannot be marked final.
* E. An overridden method must return the exact same type as the method it overrides.
* F. A method that has a single vararg parameter may be overridden by a method that takes no arguments, as varargs can have zero-or-more parameters.

An overridden method must use an access modifier that is the same
or less (not more) restrictive than the method it inherits, making option A correct.
An overridden method can swallow (refrain from declaring)
or declare new unchecked exceptions as the method it inherits, making options B and C correct.
It may not declare new checked exceptions, though.
Option D is correct as there is no rule that an overridden method cannot be marked final.
Option E is incorrect, as the return type has to be covariant.
In other words, the return type of the overridden method
can be the same or a subtype as the return type of the method it overrides.
Finally, option F is incorrect.
If an overridden method changes the signature (the name and list of parameters) in any way,
then the method is overloaded, not overridden.

##### Which of the following statements about overriding a method are correct? (Choose three.)
* A. The return types must be covariant.
* B. The access modifier of the method in the child class must be the same or narrower than the method in the superclass.
* C. The return types must be the same.
* D. A checked exception thrown by the method in the parent class must be thrown by the method in the child class.
* E. A checked exception thrown by a method in the child class must be the same or narrower than the exception thrown by the method in the parent class.
* F. The access modifier of the method in the child class must be the same or broader than the method in the superclass.

First, the return types of an overridden method must be covariant, making option A correct.
They can be the same, but it is not required, making option C incorrect.
Next, the access modifier must be the same or broader in the child method,
making option B incorrect and option F correct. Option D is
incorrect as an overridden method is not required
to throw a checked exception declared in the parent version of the method.
If it does declare a checked exception,
it cannot be new or broader than the ones declared in the superclass, making option E correct.