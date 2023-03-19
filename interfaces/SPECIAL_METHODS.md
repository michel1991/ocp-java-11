### What does the following print? Which of the following are the best reasons for creating a private interface method? (Choose two.)

*  A. Add backward compatibility to existing interfaces.
*  B. Provide an implementation that a class implementing the interface can override.
*  C. Increase code reuse within the interface.
*  D. Allow interface methods to be inherited.
*  E. Improve encapsulation of the interface.
*  F. Allow static methods to access instance methods.

Options A and B are incorrect and describe properties of default interface methods.
Option C is correct and one of the primary reasons to add a private interface method.
Option D is not a property of private interface methods.
Option E is also correct, as private interface methods are not exposed to classes implementing the interface.
Option F is a nonsensical statement.

### Which statements about default and private interface methods are correct? (Choose all that apply.)
* A. A default interface method can be declared private.
* B. A default interface method can be declared public.
* C. A default interface method can be declared static.
* D. A private interface method can be declared abstract.
* E. A private interface method can be declared protected.
* F. A private interface method can be declared static.

A default interface method is always public, whether you include the identifier or not, making option B correct and option A incorrect.
Interfaces cannot contain default static methods, making option C incorrect.
Option D is incorrect, as private interface methods are not inherited and cannot be marked abstract.
Option E is incorrect, as a method can’t be marked both protected and private.
Finally, interfaces can include both private and private static methods, making option F correct.

### What does the following print? How many rows of the following table contain an error?

Interface member	Optional modifier(s)	   Required modifier(s)
Private method	     private	              -
Default method	     public	                 default
Static method	     public static	          -
Abstract method	      public	               abstract

* A. Zero
* B. One
* C. Two
* D. Three
* E. Four

The first row is incorrect as the private modifier is required for private interface methods.
The second row is correct.
The third row is also incorrect because the static modifier is required,
not optional, for static interface methods.
The public modifier is optional, though, as the static method is implicitly public without it.
The last row is incorrect as the abstract modifier can be implied if the method does not declare a body.
Since three rows contain an error, option D is correct.

##### How many rows of the following table contain an error?
[image](./images/interfaces-modifiers.png)
*  A. Zero
*  B. One
*  C. Two
*  D. Three
*  E. Four

The second row is incorrect, as private methods belong to an instance, not the class.
The fourth row is also incorrect, as default methods require a method body.
The rest of the rows are correct, making option C correct.