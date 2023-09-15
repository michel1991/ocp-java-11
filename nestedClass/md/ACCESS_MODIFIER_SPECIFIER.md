### Which access modifiers can be applied to member inner classes? (Choose all that apply.)
* A. static
* B. public
* C. default (package-private)
* D. final
* E. protected
* F. private

Member inner classes, including both classes and interfaces, can be marked with any
of the four access modifiers: public, protected, default (package-private), or private.
For this reason, options B, C, E, and F are correct.
Options A and D are incorrect as static and final are not access modifiers.

### Which of the following class types cannot be marked final or abstract?
* A. static nested class.
* B. Local class.
* C. Anonymous class.
* D. Member inner class.
* E. All of the above can be marked final or abstract.

While an anonymous class can extend another class or implement an interface,
it cannot be declared final or abstract since it has no class definition.
For this reason, option C is correct.
The other classes may be declared final or abstract since they have a class definition.

#### A local class can access which type of local variables? (Choose two.)
* A. final
* B. private
* C. effectively final
* D. static
* E. default
* F. const

A local class can access final or effectively final local variables,
making options A and C the correct answer. Local variables cannot be marked private or static,
making options B and D incorrect.
Options E and F are also incorrect, as those are not valid variable modifiers.
