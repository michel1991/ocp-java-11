#### The following diagram shows input arguments being used in three functional interface methods of unknown type.
#### Which three functional interfaces, inserted in order from left to right, could be used to complete the diagram?

```
    A.DoubleBinaryOperator
    ToDoubleBiFunction<Integer,Double>
    UnaryOperator<Integer>

    B. BinaryOperator<Double>
    BiFunction<Integer,Integer,Double>
    UnaryOperator<Integer>

    C.Function<Double,Integer>
    BiFunction<Integer,Integer,Double>
    DoubleToIntFunction

    D.BiFunction<Integer,Double,Integer>
    BinaryOperator<Integer>
    IntUnaryOperator

    E. None of the above
```

[image](./int_double_int.jpg). 
 First, options A and B are incorrect because the second functions
 for both return a double or Double value, respectively.
 Neither of these values can be sent to a UnaryOperator˂Integer˃ without an explicit cast.
 Next, option C is incorrect.
 The first functional interface Function˂Double,Integer˃ takes only one input,
 but the diagram shows two inputs for the first functional interface.
That leaves us with option D. The first functional interface
BiFunction˂Integer,Double,Integer˃ takes an int, which can be implicitly autoboxed to Integer,
and a Double and returns an Integer. The next functional interface, BinaryOperator˂Integer˃,
takes two Integer values and returns an Integer value.
Finally, this Integer value can be implicitly unboxed and sent to IntUnaryOperator, returning an int.
Since these behaviors match our diagram, option D is the correct answer.