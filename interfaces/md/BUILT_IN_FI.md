##### A lambda expression for which of the following functional
##### interfaces could be used to return a Double value? (Choose two.)
* A. UnaryOperator
* B. BiPredicate
* C. BiOperator
* D. BiConsumer
* E. BiFunction
* F. BiSupplier

The UnaryOperator and BiFunction return a generic argument,
such as Double, making options A and E correct.
Option B is incorrect because all predicate functions return boolean.
Option C is incorrect because BiOperator does not exist in the java.util.function package.
The correct name is BinaryOperator.
Option D is incorrect because all consumer functions return void.
Finally, option F is incorrect because BiSupplier does not exist in the java.util.function package.
Supplier functions return values, and Java does not support methods with more than one return type

##### The ______________ functional interface has an apply() method
##### while the ______________ functional interface has an applyAsDouble() method. (Choose two.)
* A. BiConsumer
* B. BiFunction
* C. BiPredicate
* D. DoubleConsumer
* E. DoublePredicate
* F. DoubleUnaryOperator

Option B fills in the first blank because BiFunction includes the apply() method.
DoubleUnaryOperator contains the applyAsDouble() method, making option F correct.
For the exam, pay attention to methods that have a different name for primitives.

#### Which statement is not true of Predicate?
*  A. A boolean is returned from the method it declares.
*  B. It is an interface.
*  C. The method it declares accepts two parameters.
*  D. The method it declares is named test.
*  E. All of the above are true.

Predicate is an interface with one method.
The method signature is boolean test(T t).
Option C is the answer because the method accepts one parameter rather than two.

### Which functional interface has three generic types and an apply() method?
* A. BiConsumer
* B. BinaryConsumer
* C. BiPredicate
* D. BinaryPredicate
* E. BiFunction
* F. BinaryFunction

BiFunction takes three generic types. Two are for the parameters, and one is for the return type.
Options B, D, and F aren’t the names of functional interfaces in Java.

#### Identify the correct functional interfaces to fill in this table correctly. (Choose three.)
*  A. Interface X is Predicate.
*  B. Interface X is Supplier.
*  C. Interface Y is Comparator.
*  D. Interface Y is Supplier.
*  E. Interface Z is Consumer.
*  F. Interface Z is Supplier.

[image](./images/fi-return_type.png).
Interface X is tricky. If it returned a boolean primitive,
option A would be correct as Predicate returns a boolean.
However, it returns a wrapper object,
so it has to be a Supplier, making option B the answer instead.
Interface Y and Z are more straightforward as a Comparator and Consumer, respectively.
This makes options C and E the final two answers.

##### Starting with DoubleConsumer and going downward, fill in the missing values for the table.
Functional Interface	         # Parameters in Method Signature
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
On the other hand, ObjDoubleConsumer takes two values,
a generic value and a double, and returns void.
For this reason, option D is correct, and option B is incorrect.

###### Fill in the blank: ______________ is the only functional
###### interface that does not involve double, int, or long.
* A. BooleanSupplier
* B. CharPredicate
* C. FloatUnaryOperator
* D. ShortConsumer
* E. None of the above

BooleanSupplier is the only functional interface that does not involve double, int, or long,
making option A the correct answer.
The rest of the functional interfaces are not found in java.util.function.
Java does not have built-in support for primitive
functional interfaces that include char, float, or short.

##### Which of the following are valid functional interfaces in the java.util.function package? (Choose three.)
* A. BooleanSupplier
* B. CharSupplier
* C. DoubleUnaryOperator
* D. ObjectIntConsumer
* E. ToLongBiFunction
* F. TriPredicate

BooleanSupplier, DoubleUnaryOperator, and ToLongBiFunction are
all valid functional interfaces in java.util.function,
making options A, C, and E correct.
Remember that BooleanSupplier is the only primitive functional interface in the API
that does not use double, int, or long. For this reason,
option B is incorrect, since char is not a supported primitive.
Option D is incorrect because the functional interfaces
that use Object are abbreviated to Obj. The correct name
for this functional interface is ObjIntConsumer.
That leaves option F, which is incorrect.
There is no built-in Predicate interface that takes three values.

##### Which of the following functional interfaces contain an abstract method
##### that returns a primitive value? (Choose all that apply.)
*  A. BooleanSupplier
*  B. CharSupplier
*  C. DoubleSupplier
*  D. FloatSupplier
*  E. IntSupplier
*  F. StringSupplier

Java includes support for three primitive streams, along with numerous
functional interfaces to go with them: int, double, and long.
For this reason, options C and E are correct.
There is one exception to this rule. While there is no BooleanStream class,
there is a BooleanSupplier functional interface, making option A correct.
Java does not include primitive streams or related functional
interfaces for other numeric data types, making options B and D incorrect.
Option F is incorrect because String is not a primitive,
but an object. Only primitives have custom suppliers.

#### Which of the following statements about DoubleSupplier and Supplier˂Double˃ is not true?
* A. Both are functional interfaces.
* B. Both take zero parameters.
* C. Lambdas for both can return a double value.
* D. Lambdas for both cannot return a null value.
* E. One supports a generic type; the other does not.
* F. All of these are true.

Both are functional interfaces in the java.util.function package,
making option A true. Additionally, both lack parameters, making option B true.
The major difference between the two is that Supplier˂Double˃ takes
the generic type Double, while the other does not take any generic
type and instead uses the primitive double.
For this reason, options C and E are true statements.
For Supplier<Double> in option C, remember that the returned
double value can be implicitly autoboxed to Double.
Option D is the correct answer. Lambdas for Supplier<Double>
can return a null value since Double is an object type,
while lambdas for DoubleSupplier cannot; they can only return primitive double values.

###### Which of the following is not a functional interface
###### in the java.util.function package? (Choose two.)
* A. DoublePredicate
* B. LongUnaryOperator
* C. ShortSupplier
* D. ToIntBiFunction
* E. ToStringOperator

The DoublePredicate interface takes a double value and returns a boolean value.
LongUnaryOperator takes a long value and returns a long value.
ToIntBiFunction takes two generic values and returns an int value.
ShortSupplier and ToStringOperator are not built-in functional interfaces.
Recall that Java only includes primitive functional interfaces
that operate on double, int, or long. For this reason, Options C and E are correct.

##### Which functional interface does not have the correct number of generic arguments? (Choose two.)
* A. BiFunction<T,U,R>
* B. BinaryOperator<T, U>
* C. DoubleFunction<T,R>
* D. ToDoubleFunction<T>
* E. ToIntBiFunction<T,U>

The BiFunction interface takes two different generic values and returns a generic value,
taking a total of three generic arguments.
Next, ToDoubleFunction takes exactly one generic value and returns a double value,
requiring one generic argument. The ToIntBiFunction interface
takes two generic values and returns an int value, for a total of two generic arguments.
For these reasons, Options A, D, and E have the correct number of generics.
BinaryOperator<T> takes two parameters of a generic type and returns the same type.
Therefore, only one generic is needed when declaring the type. DoubleFunction<R>
takes a double value and returns a generic result, taking exactly one generic argument, not two.
This makes the answer options B and C.

