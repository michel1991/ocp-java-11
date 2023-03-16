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