#### Which of these statements concerning the use of modifiers are true?

* A. By default (i.e. no modifier) the member is only accessible to classes in the same package and subclasses of the class.
    No, the member will be accessible only within the package.
* B. You cannot specify visibility of local variables.
    They are always only accessible within the block in which they are declared.
* C. Local variable always have default accessibility.
    A local variable (aka automatic variable) means a variable declared in a method.
    They don't have any accessibility. They are accessible only from the block they are declared in.
    Remember, they are not initialized automatically. You have to initialize them explicitly.
* D. Local variables can be declared as private.
* E. Local variables can only be declared as public.

You cannot apply any modifier except final to a local variable, i.e.,
you cannot make them transient, volatile, static, public, and private.
But you can apply access modifiers (public, private and protected) and final, transient, volatile, and static to instance variables.
You cannot apply native and synchronized to any kind of variable.
(correct B)
