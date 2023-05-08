##### Which of the following are valid method modifiers that cannot
##### be used together in a method declaration? (Choose all that apply.)
* A. null and final
* B. abstract and private
* C. public and private
* D. nonstatic and abstract
* E. private and final
* F. abstract and static
* G. protected and abstract

First, null and nonstatic are not valid method modifiers, making options A and D incorrect.
Options B and F are correct, as abstract methods cannot be marked private or static,
since they then would not be able to be overridden.
Option C is also correct, as you cannot declare two access modifiers on the same method.
Finally, options E and G are two sets of valid modifiers that can be used together
in a method declaration.
Using private with final is allowed, albeit redundant.

##### Which modifiers are implicitly applied to all abstract class methods
##### that do not declare a body? (Choose all that apply.)
* A. public
* B. final
* C. abstract
* D. violatile
* E. synchronized
* F. static
* G. None of the above

If this question was about interfaces, then the correct answers would be options A and C,
as public and abstract are implicitly applied to all interface methods that do not declare a body.
The question is about abstract classes, though, which do not contain any implicit method modifiers,
making option G correct.
Even though an abstract method in an abstract class does not declare a body,
it must still explicitly use the abstract modifier or it will not compile.

### Which modifier pairs can be used together in a method declaration? (Choose all that apply.)
* A. static and final
* B. private and static
* C. static and abstract
* D. private and abstract
* E. abstract and final
* F. private and final

The final modifier can be used with private and static, making options A and F correct.
Marking a private method final is redundant but allowed.
A private method may also be marked static, making option B correct.
Options C, D, and E are incorrect because methods marked static, private,
or final cannot be overridden; therefore, they cannot be marked abstract.

##### Which of the following modifiers can both be applied to a method? (Choose three.)
* A. private and final
* B. abstract and final
* C. static and private
* D. private and abstract
* E. abstract and static
* F. static and protected

An abstract method is one that will be implemented by a subclass.
For this reason, it cannot be combined with final or private,
as both prevent a method from being overridden, making options B and D incorrect.
An abstract method can also not be marked static,
since static members belong to the class level, not an instance, making option E incorrect.
Options A, C, and F are the correct answers.
Note that marking a private method final has no practical implication, although it is allowed.

#### Fill in the blanks: Using the ________ and ________ modifiers together
#### allows a variable to be accessed from any class, without requiring an instance variable.
* A. class, static
* B. default, public
* C. final, package-private
* D. protected, instance
* E. public, static
* F. None of the above

The public modifier allows access from the same class, package, subclass,
or even classes in other packages, while the static modifier
allows access without an instance of the class.
For these reasons, option E is the correct answer.
Option A is incorrect because class is not a modifier; it is a keyword.
Option B is incorrect because the default keyword
is for interface methods and switch statements, not class variables.
Option C is incorrect because final is not related to access,
and package-private prevents access from classes outside the package.
Finally, option D is incorrect because instance is not a Java keyword or modifier.
Further, protected prevents all classes outside the package
other than subclasses from accessing the variable.


