# Which of the following are true statements about a class Camel with a single instance variable List<String> species? (Choose all that apply.)
    A. If Camel is well encapsulated, then it must have restricted extensibility.
    B. If Camel is well encapsulated, then it must be immutable.
    C. If Camel has restricted extensibility, then it must have good encapsulation.
    D. If Camel has restricted extensibility, then it must be immutable.
    E. If Camel is immutable, then it must have good encapsulation.
    F. If Camel is immutable, then it must restrict extensibility.

    Option A is incorrect because good encapsulation requires private state rather than declaring the class final.
    Option B is incorrect because the well-encapsulated Camel class can have a getter that exposes the species variable to be modified.
    Options C and D are incorrect because a class can be final while having public variables and be mutable.
    Option E is correct because methods that expose species could change it, which would prevent immutability.
    Option F is correct because you cannot enforce immutability in a subclass.

 # Which of the following statements are correct? (Choose all that apply.)
    A. The return value of an assignment operation expression can be void.
    B. The inequality operator (!=) can be used to compare objects.
    C. The equality operator (==) can be used to compare a boolean value with a numeric value.
    D. During runtime, the && and | operators may cause only the left side of the expression to be evaluated.
    E. The return value of an assignment operation expression is the value of the newly assigned variable.
    F. In Java, 0 and false may be used interchangeably.
    G. The logical complement operator (!) cannot be used to flip numeric values.

The return value of an assignment operation in the expression is the same as the value of the newly assigned variable.
For this reason, option A is incorrect, and option E is correct.
Option B is correct, and the equality (==) and inequality (!=) operators can both be used with objects.
Option C is incorrect, as boolean and numeric types are not comparable with each other.
For example, you can’t say true == 3 without a compilation error.
Option D is incorrect, as only the short-circuit operator (&&) may cause only the left side of the expression to be evaluated.
The (|) operator will cause both sides to be evaluated.
Option F is incorrect, as Java does not accept numbers for boolean values.
Finally, option G is correct, as you need to use the negation operator (-) to flip or negate numeric values, not the logical complement operator (!).
