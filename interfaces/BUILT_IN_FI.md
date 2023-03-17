### A lambda expression for which of the following functional interfaces could be used to return a Double value? (Choose two.)
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

#### The ______________ functional interface has an apply() method while the ______________ functional interface has an applyAsDouble() method. (Choose two.)
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