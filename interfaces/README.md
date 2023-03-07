### Given a public static interface method, what is the best reason to modify it to be private?
* A. Reduces code duplication
* B. Backward compatibility
* C. Improves encapsulation
* D. Polymorphism
* E. Supports overloaded operators

The primary reason to make any public method private is to improve encapsulation, making option B the correct answer.
Option A is a close second choice, as it is one of the reasons to use private interface methods, but that applies only when adding a new method.
If the method already exists, making it private does not reduce code duplication. The rest of the options do not apply to private interface methods.

### Which statements about the final modifier are correct? (Choose all that apply.)
* A. Instance and static variables can be marked final.
* B. A variable is effectively final if it is marked final.
* C. The final modifier can be applied to classes and interfaces.
* D. A final class cannot be extended.
* E. An object that is marked final cannot be modified.
* F. Local variables cannot be declared with type var and the final modifier.

Instance and static variables can be marked final, making option A correct.
Effectively final means a local variable is not marked final but whose value does not change after it is set, making option B incorrect.
The final modifier can be applied to classes, but not interfaces, making option C incorrect.
Remember, interfaces are implicitly abstract, which is incompatible with final.
Option D is correct, as the definition of a final class is that it cannot be extended.
Option E is incorrect, as final refers only to the reference to an object, not its contents.
Finally, option F is incorrect, as var and final can be used together.


### What modifiers are implicitly applied to all interface methods that do not declare a body? (Choose all that apply.)
* A. protected
* B. public
* C. static
* D. void
* E. abstract
* F. default

A method that does not declare a body is by definition abstract, making option E correct.
All abstract interface methods are assumed to be public, making option B correct.
Interface methods cannot be marked protected, so option A is incorrect.
Interface methods can be marked static or default, although if they are, they must provide a body, making options C and F incorrect.
Finally, void is a return type, not a modifier, so option D is incorrect.

### Which functional interface has three generic types and an apply() method?
* A. BiConsumer
* B. BinaryConsumer
* C. BiPredicate
* D. BinaryPredicate
* E. BiFunction
* F. BinaryFunction

BiFunction takes three generic types. Two are for the parameters, and one is for the return type. Options B, D, and F aren’t the names of functional interfaces in Java.

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
Option E is incorrect, as a method can’t be marked both protected and private. Finally, interfaces can include both private and private static methods, making option F correct.

### What are some advantages of using default interface methods? (Choose all that apply.)
*  A. Automatic resource management
*  B. Improve performance at runtime
*  C. Better exception handling
*  D. Backward compatibility
*  E. Highly concurrent execution
*  F. Convenience in classes implementing the interface

Java added default methods primarily for backward compatibility.
Using a default method allows you to add a new method to an interface without having to recompile a class that used an older version of the interface.
For this reason, option D is correct.
Option F is also correct, as default methods in some APIs offer a number of convenient methods to classes that implement the interface.
The rest of the options are not related to default methods.


### Which modifiers are implicitly applied to all interface variables? (Choose all that apply.)
* A. protected
* B. final
* C. transient
* D. default
* E. const
* F. static
* G. None of the above

All interface variables are assumed to be public, static, and final, making options B and F correct.
The other modifiers, while all Java keywords, cannot be applied to interface variables. Note that const is an unused keyword in Java.

### What are some advantages of using private interface methods? (Choose all that apply.)
* A. Improve polymorphism
* B. Improve performance at runtime
* C. Reduce code duplication
* D. Backward compatibility
* E. Encapsulate interface implementation
* F. Portability

You can reduce code duplication by moving shared code from default or static methods into a private or private static method.
For this reason, option C is correct. Option E is also correct, as making interface methods private means users of the interface do not have access to them.
The rest of the options are not related to private methods, although backward compatibility does apply to default methods.

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

### Which of the following are the best reasons for creating a default interface method? (Choose two.)
*  A. Allow interface methods to be overloaded.
*  B. Add backward compatibility to existing interfaces.
*  C. Give an interface the ability to create final methods.
*  D. Allow an interface to define a method at the class level.
*  E. Improve code reuse among classes that implement the interface.
*  F. Improve encapsulation of the interface.

One of the motivations for adding default interface methods to Java was for backward compatibility.
These methods allow developers to update older classes with a newer version of an interface without breaking functionality in the existing classes,
making option B correct. Option E is also correct, as classes implementing the interface can share common methods.
Option A is incorrect, as interface methods can already be overloaded.
Option C is incorrect because methods in interfaces cannot be marked final.
Option D sounds plausible, but could be accomplished with static interface methods alone.
Option F is incorrect as that statement only applies to private interface methods.

### Which of the following can include a static method in its definition? (Choose three.)
*  A. Interface
*  B. Anonymous class
*  C. Abstract class
*  D. Member inner class
*  E. Local class
*  F. static nested class

Both abstract classes and interfaces can include static methods, so options A and C are correct.
Of all the nested class types, only static nested classes can include static methods, making option F correct,
and options B, D, and E incorrect.

