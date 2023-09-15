##### Which are true statements about referencing variables from a lambda? (Choose two.)
* A. Instance and static variables can be used regardless of whether effectively final.
* B. Instance and local variables can be used regardless of whether effectively final.
* C. Instance variables and method parameters must be effectively final to be used.
* D. Local variables and method parameters must be effectively final to be used.
* E. Local and static variables can be used regardless of whether effectively final.
* F. Method parameters and static variables can be used regardless of whether effectively final.

A lambda can reference any instance variable, static variable,
or lambda parameter that is in scope, making option A correct.
Lambdas require local variables and method parameters
to be effectively final in order to use them, making option D the other correct answer.

#### Which of the following are valid lambdasthat can be assigned
#### to a variable of type Consumer<String>? (Choose all that apply.)
* A. s -> System.out.println(s)
* B. final s -> System.out.println(s)
* C. var s -> System.out.println(s)
* D. (final s) -> System.out.println(s)
* E. (final String s) -> System.out.println(s)
* F. (final var s) -> System.out.println(s)
* G. (var s) -> System.out.println(s)
* H. None of the above

Option A is correct because it is the simplest lambda syntax.
Options B and D are incorrect because the final modifier must precede a type.
While var can replace the type, option C is invalid
because the parentheses around the type and variable are missing.
Options E, F, and G are valid because they specify a type and an optional final modifier.

###### Which of the following lambda expressions can be passed
###### to a function of Predicate<String> type? (Choose all that apply.)
* A. () -> s.isEmpty()
* B. s -> s.isEmpty()
* C. String s -> s.isEmpty()
* D. (String s) -> s.isEmpty()
* E. (s1) -> s.isEmpty()
* F. (s1, s2) -> s1.isEmpty()

Predicate<String> takes a parameter list of one parameter using the specified type.
Options A and F are incorrect because they specify the wrong number of parameters.
Option C is incorrect because parentheses are required around the parameter list when the type is specified.
Option E is incorrect because the name used in the parameter list does not match the name used in the body.

##### Which of the following are valid lambdas that can be
##### assigned to a variable of type Consumer<String>? (Choose all that apply.)
* A. s -> System.out.println(s)
* B. final s -> System.out.println(s)
* C. var s -> System.out.println(s)
* D. (final s) -> System.out.println(s)
* E. (final String s) -> System.out.println(s)
* F. (final var s) -> System.out.println(s)
* G. (var s) -> System.out.println(s)

Option A is correct because it is the simplest lambda syntax.
Options B and D are incorrect because the final modifier must precede a type.
While var can replace the type, option C is
invalid because the parentheses around the type and variable are missing.
Options E, F, and G are valid because they specify a type and an optional final modifier.

### Starting with DoubleConsumer and going downward, fill in the missing values for the table.
[image](images/fi_parameters_in_method.png)
Functional Interface	# Parameters in Method Signature
DoubleConsumer
IntFunction
LongSupplier
ObjDoubleConsumer

*  A. 0, 1, 1, 1
*  B. 0, 1, 0, 2
*  C. 0, 2, 1, 2
*  D. 1, 1, 0, 2
*  E. 1, 1, 1, 1
*  F. None of the above

Remember that all Supplier interfaces take zero parameters.
For this reason, the third value in the table is 0, making options A, C, and E incorrect.
Next, DoubleConsumer and IntFunction each take one value, double and int, respectively.
On the other hand, ObjDoubleConsumer takes two values, a generic value and a double, and returns void.
For this reason, option D is correct, and option B is incorrect.

### Which functional interface returns a primitive value?
* A. BiPredicate
* B. CharSupplier
* C. LongFunction
* D. UnaryOperator
* E. TriDoublePredicate
* F. None of the above

Option A is the correct answer because BiPredicate takes two generic
types and returns a primitive boolean value. Option B is incorrect,
since CharSupplier does not exist in java.util.function.
Option C is also incorrect, since LongFunction takes a
primitive long value and returns a generic type.
Remember, Java only includes primitive functional interfaces that operate on double, int, or long.
Option D is incorrect because UnaryOperator takes a generic type and returns a generic value.
Finally, option E is incorrect because TriDoublePredicate is not a built-in functional interface.

###### Fill in the blanks: The ______________ functional interface
###### does not take any inputs, while the ______________ functional interface does not return any data.
* A. IntConsumer, LongSupplier
* B. IntSupplier, Function
* C. Supplier, DoubleConsumer
* D. UnaryOperator, Consumer
* E. None of the above

The Supplier functional interface does not take any inputs,
while the Consumer functional interface does not return any data.
This behavior extends to the primitive versions of the functional interfaces, making option C the correct answer.
Option A is incorrect because IntConsumer takes a value, while LongSupplier returns a value.
Options B and D are incorrect because Function and UnaryOperator both take an input and produce a value.

### Which statements about stateful lambda expressions are correct? (Choose two.)
*  A. Stateful lambda expressions should be avoided on both serial and parallel streams.
*  B. Stateful lambda expressions should be avoided on only serial streams.
*  C. Stateful lambda expressions should be avoided on only parallel streams.
*  D. One way to avoid modifying a List with a stateful lambda expression is to use a concurrent collection.
*  E. One way to avoid modifying a List with a stateful lambda expression is to use a collector that outputs a List.
*  F. One way to avoid modifying a List with a stateful lambda expression is to use a synchronized list.

Stateful lambda expressions should be avoided with both serial
and parallel streams because they can lead to unintended side effects,
making option A correct.
A common way to remove a stateful lambda expression
that modifies a List is to have the stream operation output a new List.
For this reason, option E is correct.
Options D and F are incorrect because while
a concurrent or synchronized list may make the stream operation thread-safe,
they are still stateful lambda expressions.
