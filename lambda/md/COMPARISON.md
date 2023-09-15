### Which statement about functional interfaces and lambda expressions is not true?
* A. A lambda expression may be compatible with multiple functional interfaces.
* B. A lambda expression must be assigned to a functional interface when it is declared.
* C. A method can return a lambda expression in the form of a functional interface instance.
* D. The compiler uses deferred execution to skip determining whether a lambda expression compiles or not.
* E. All of these are true.

Options A, B, and C are true statements about functional interfaces.
A lambda may be compatible with multiple functional interfaces,
but it must be assigned to a functional interface when it is declared or passed as a method argument.
Also, a method can be created with the return type that matches a functional interface,
allowing a lambda expression to be returned. Option D is the correct answer.
Deferred execution means the lambda expression is not evaluated until runtime,
but it is compiled. Compiler errors in the lambda expression will still prevent the code from compiling.

#### What is a difference between lambdas and method references?
* A. Only one can take a method parameter.
* B. Only one can reference an effectively final local variable.
* C. Only one can make a method call where the method parameter is the hard-coded number 3.
* D. Only one can use deferred execution.
* E. None of the above.

Both lambda and method references can be passed to another method
as a parameter and executed later ruling out options A and D.
One big difference is with a lambda like: () -> s.charAt(3).
The s variable must be final or effectively final variable
in both lambdas and method references, making option
B incorrect. However, there isn’t a way to use
the hard-coded number in a method reference.
Therefore, option C is a difference and the answer.

### Which statement is true?
* A. All lambdas can be converted to method references, and vice versa.
* B. All lambdas can be converted to method references, but not vice versa.
* C. All method references can be converted to lambdas, but not vice versa.
* D. None of the above.

Method references are a shorter way of writing lambdas,
and all method references can be expanded to lambdas.
However, this does not apply in reverse. Consider the lambda: () -˃ s.charAt(n).
The n variable can only be an effectively final variable in lambdas, but not in method references.
Since only method references can always be converted, option C is correct.