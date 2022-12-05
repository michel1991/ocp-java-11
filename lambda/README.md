
# Which statements about effectively final variables are true? (Choose all that apply.)
A. The value of an effectively final variable is not modified after it is set.
B. A lambda expression can reference effectively final variables.
C. A lambda expression can reference final variables.
D. If the final modifier is added, the code still compiles.
E. Instance variables can be effectively final.
F. Static variables can be effectively final.
Effectively final refers to local variables whose value is not changed after it is set.
For this reason, option A is correct, and options E and F are incorrect. Options B and C are correct, as lambda expressions can access final and effectively final variables.
Option D is also correct and is a common test for effectively final variables.

# Which of the following are valid lambdas that can be assigned to a variable of type Consumer<String>? (Choose all that apply.)
    A. s -> System.out.println(s)
    B. final s -> System.out.println(s)
    C. var s -> System.out.println(s)
    D. (final s) -> System.out.println(s)
    E. (final String s) -> System.out.println(s)
    F. (final var s) -> System.out.println(s)
    G. (var s) -> System.out.println(s)
    H. None of the above

Option A is correct because it is the simplest lambda syntax.
Options B and D are incorrect because the final modifier must precede a type.
While var can replace the type, option C is invalid because the parentheses around the type and variable are missing.
Options E, F, and G are valid because they specify a type and an optional final modifier.

# Which statements about effectively final variables are true? (Choose all that apply.)
A. The value of an effectively final variable is not modified after it is set.
B. A lambda expression can reference effectively final variables.
C. A lambda expression can reference final variables.
D. If the final modifier is added, the code still compiles.
E. Instance variables can be effectively final.
F. Static variables can be effectively final.

Effectively final refers to local variables whose value is not changed after it is set.
For this reason, option A is correct, and options E and F are incorrect.
Options B and C are correct, as lambda expressions can access final and effectively final variables.
Option D is also correct and is a common test for effectively final variables.