### Which functional interface(s) would you use if you need a function that always returns the same type as the type of its input(s)?
* A.
    Function
    A Function's return type can be different from its input but it is possible to use Function where the input type and return type are same.
    For example, Function<Integer, Integer> f;
    
    public interface Function<T,R>
    Represents a function that accepts one argument and produces a result.
    This is a functional interface whose functional method is apply(T ).
    
    This option is marked incorrect because of the word "always" in the problem statement.

* B. UnaryOperator
public interface UnaryOperator<T> extends Function<T,T>
Represents an operation on a single operand that produces a result of the same type as its operand.
This is a specialization of Function for the case where the operand and result are of the same type

* C. Supplier
    It doesn't take any argument.
    
    public interface Supplier<T>
    Represents a supplier of results.
    There is no requirement that a new or distinct result be returned each time the supplier is invoked.
    
    This is a functional interface whose functional method is get().

* D. Predicate
    It always returns a boolean.
    public interface Predicate<T>
    Represents a predicate (boolean-valued function) of one argument.
    This is a functional interface whose functional method is test(Object)

* E. BinaryOperator
    public interface BinaryOperator<T>
    extends BiFunction<T,T,T>
    Represents an operation upon two operands of the same type, producing a result of the same type as the operands.
   This is a specialization of BiFunction for the case where the operands and the result are all of the same type.
    This is a functional interface whose functional method is BiFunction.apply(T, T).

* F. Consumer
It doesn't return anything.

* G. BiConsumer
public interface BiConsumer<T,U>
Represents an operation that accepts two input arguments and returns no result.
This is the two-arity specialization of Consumer. Unlike most other functional interfaces, BiConsumer is expected to operate via side-effects.
This is a functional interface whose functional method is accept(T, U).

Correct(B, E)