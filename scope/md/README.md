#### What does the following print? Which of the following
#### variables are always in scope for the entire program once defined?

* A. Package variables
* B. Class variables
* C. Instance variables
* D. Local variables

There is no such thing as package variables, so option A is incorrect.
Option C is incorrect as the variable is only in scope within a specific instance of the class.
Option D is also incorrect as the variable is only in scope for a single method that it is defined in.
Option B is the only correct answer as class variables are in scope within the program.

#### Given the following method signature, which classes cannot call it?

```java
 protected void run(String government)
```
* A. All classes in other packages
* B. All classes in the same package
* C. Subclasses in a different package
* D. Subclasses in the same package

The protected modifier allows access to the same package and subclasses,
which are options B, C, and D. Therefore, the correct answer is option A.

#### Fill in the blanks: The ___________________ access modifier allows access to everything
#### the ___________________ access modifier does and more. (Choose three.)
* A. package-private, protected
* B. package-private, public
* C. protected, package-private
* D. protected, public
* E. public, package-private
* F. public, protected

The public access modifier is the broadest, making options E and F correct.
Package-private access limits references to those in the same package.
The protected access modifier adds on subclass access, making option C correct.
