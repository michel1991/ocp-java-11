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

