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