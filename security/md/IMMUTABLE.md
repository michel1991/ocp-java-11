##### Which are requirements for a class to be immutable? (Choose three.)
* A. A private constructor is provided.
* B. Any instance variables are private.
* C. Any instance variables are initialized in a constructor.
* D. Methods cannot be overridden.
* E. There are no setter methods.
* F. Any instance variables are marked final.

An immutable class can have public constructors, so option A is incorrect.
Options B, D, and E make up the requirements for an immutable class.
Option D can be fulfilled by making the class final or marking the methods final.
Option C is incorrect because instance variables can still be declared with a value or set by an instance initializer.
Option F is also incorrect.
While it is common to mark instance variables final, as long as there is no way
for them to be changed after the constructor is executed, the class can still be considered immutable.

#### How do you change the value of an instance variable in an immutable class?
* A. Call the setter method.
* B. Remove the final modifier and set the instance variable directly.
* C. Create a new instance with an inner class.
* D. Use a method other than Option A, B, or C.
* E. You can’t.

By definition, you cannot change the value of an instance variable in an immutable class.
There are no setter methods, making option A incorrect.
While option B would allow you to set the value, the class would no longer be immutable.
Option C is incorrect because that would not modify the original instance.
Option E is correct. If you are an advanced developer,
you might know that you can use reflection to change the value.
Don’t read into questions like this on the exam.
Reflection isn’t on the exam, so you can pretend it doesn’t exist.