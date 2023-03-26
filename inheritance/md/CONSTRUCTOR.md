#### What does the following print?
#### Which of the following statements about no-argument
#### constructors and inheritance are correct? (Choose two.)

* A. The compiler cannot insert a no-argument constructor into an abstract class.
* B. If a parent class does not include a no-argument constructor, a child class cannot declare one.
* C. If a parent class declares constructors but each of them take at least one parameter, then a child class must declare at least one constructor.
* D. The no-argument constructor is sometimes inserted by the compiler.
* E. If a parent class declares a no-argument constructor, a child class must declare a no-argument constructor.
* F. If a parent class declares a no-argument constructor, a child class must declare at least one constructor.

The default no-argument instructor is inserted by the compiler whenever a class, abstract or concrete,
does not declare any constructors. For this reason, option A is incorrect,
and option D is correct. Even if a parent class does not declare a no-argument constructor,
the child class can still declare one, making option B incorrect.
If the parent class does not declare a no-argument constructor (and none is inserted by the compiler),
then the child class must declare at least one constructor, making option C correct.
Without a constructor call, inserting the default no-argument
constructor into the child class would lead to a compiler error on the implicit super() call.
Finally, options E and F are incorrect, as a child
class of a parent with a no-argument constructor is free to declare or not declare any constructors.