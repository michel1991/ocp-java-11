##### Fill in the blanks: The __________ annotation determines whether annotations are discarded at runtime,
##### while the __________ annotation determines whether they are discarded in generated Javadoc.
* A. @Target, @Deprecated
* B. @Discard, @SuppressWarnings
* C. @Retention, @Generated
* D. @Retention, @Documented
* E. @Inherited, @Retention
* F. @Target, @Repeatable
* G. None of the above

The @Retention annotation determines whether annotations are discarded when the code is compiled, at runtime, or not at all.
The presence, or absence, of the @Documented annotation determines whether annotations are discarded within generated Javadoc.
For these reasons, option D is correct.

##### What conditions must be true to declare a repeatable annotation
##### along with its associated containing annotation type? (Choose all that apply.)
* A. The repeatable annotation must be declared with @Repeatable, which includes a value that points to the containing type annotation.
* B. The repeatable annotation must include an element called value().
* C. The repeatable annotation must include an element whose type is a primitive array.
* D. The containing annotation type must be declared with @Repeatable, which includes a value that points to the repeatable annotation.
* E. The containing annotation type must include an element called value().
* F. The containing annotation type must include an element whose type is an array.

Creating a repeatable annotation requires declaring two annotations.
The first, the repeatable annotation, needs to be declared
with @Repeatable and include a value that refers to the containing annotation type.
The second, the containing annotation type,
must include an element named value() that includes an array of the repeatable annotation type.
For these reasons, options A, E, and F are correct.


##### What motivations would a developer have for applying
##### the @FunctionalInterface annotation to an interface? (Choose all that apply.)
* A. To allow the interface to be used in a lambda expression
* B. To provide documentation to other developers
* C. To allow the interface to be used as a method reference
* D. There is no reason to use this annotation.
* E. To trigger a compiler error if the annotation is used incorrectly

The @FunctionalInterface marker annotation is used to document
that an interface is a valid functional interface
that contains exactly one abstract method, making option B correct.
It is also useful in determining whether an interface is a valid functional interface,
as the compiler will report an error if used incorrectly, making option E correct.
The compiler can detect whether an interface
is a functional interface even without the annotation, making options A and C incorrect.

### Which annotations require a value to be applied to a declaration? (Choose all that apply.)
* A. @Retention
* B. @Documented
* C. @FunctionalInterface
* D. @SafeVarargs
* E. @Repeatable
* F. @Deprecated
* G. @SuppressWarnings

@Documented, @FunctionalInterface, and @SafeVarargs are marker annotations and do not take any values.
On the other hand, @Retention requires a RetentionPolicy value, making option A correct.
Likewise, @Repeatable requires a containing annotation type,
and @SuppressWarnings requires a String[] value, making options E and G correct, respectively.
Finally, option F is incorrect.
While @Deprecated may take a since() String value or forRemoval() boolean value, both are optional.

##### Fill in the blanks: When using the @SuppressWarnings annotations,
##### a value of _________________ causes it to ignore issues with generics,
##### while a value of _________________, causes it to ignore code that is marked as outdated.
* A. generic, deprecation
* B. generic, ignore
* C. safetypes, deprecated
* D. safetypes, ignore
* E. unchecked, deprecation
* F. unchecked, deprecated
* G. None of the above

The correct option to ignore issues with generic types is unchecked,
while deprecation is used to ignore code that is marked deprecated, making option E correct.
Most of the other options are not built-in types supported by the compiler.


### Which annotation can cancel out a warning on a method using the @Deprecated API at compile time?
* A. @FunctionalInterface
* B. @Ignore
* C. @IgnoreDeprecated
* D. @Retention
* E. @SafeVarargs
* F. @SuppressWarnings
* G. None of the above

If @SuppressWarnings("deprecation") is applied to a method that is using a deprecated API,
then warnings related to the usage will not be shown at compile time, making option F correct.
Note that there are no built-in annotations called @Ignore or @IgnoreDeprecated.

##### Fill in the blanks: The __________ annotation determines what annotations from a superclass
##### or interface are applied, while the __________ annotation determines
##### what declarations an annotation can be applied to.
* A. @Target, @Retention
* B. @Inherited, @ElementType
* C. @Documented, @Deprecated
* D. @Target, @Generated
* E. @Repeatable, @Element
* F. @Inherited, @Retention
* G. None of the above

The @Inherited annotation determines whether or not annotations
defined in a super type are automatically inherited in a child type.
The @Target annotation determines the location or locations an
annotation can be applied to. Since this was not an answer choice, option G is correct.
Note that ElementType is an enum used by @Target, but it is not an annotation.



### What properties of applying @SafeVarargs are correct? (Choose all that apply.)
* A. By applying the annotation, the compiler verifies that all operations on parameters are safe.
* B. The annotation can be applied to abstract methods.
* C. The annotation can be applied to method and constructor declarations.
* D. When the annotation is applied to a method, the method must contain a varargs parameter.
* E. The annotation can be applied to method and constructor parameters.
* F. The annotation can be applied to static methods.

The @SafeVarargs annotation can be applied to a constructor or private,
static, or final method that includes a varargs parameter.
For these reasons, options C, D, and F are correct.
Option A is incorrect, as the compiler cannot actuallyenforce that the operations are safe.
It is up to the developer writing the method to verify that.
Option B is incorrect as the annotation can be applied only
to methods that cannot be overridden and abstract methods can always be overridden.
Finally, option E is incorrect, as it is applied to the declaration, not the parameters.



##### Which annotations can be added to an existing method declaration but could cause
##### a compiler error depending on the method signature? (Choose all that apply.)
*  A. @Override
*  B. @Deprecated
*  C. @FunctionalInterface
*  D. @Repeatable
*  E. @Retention
*  F. @SafeVarargs

The @Override annotation can be applied to a method but will trigger a compiler error
if the method signature does not match an inherited method, making option A correct.
The annotation @Deprecated can be applied to a method but will not trigger
any compiler errors based on the method signature.
The annotations @FunctionalInterface, @Repeatable,
and @Retention cannot be applied to methods, making these options incorrect.
Finally, @SafeVarargs can be applied to a method but will trigger
a compiler error if the method does not contain a varargs parameter or is able to be overridden
(not marked private, static, or final).

### When using the @Deprecated annotation, what other annotation should be used and why?
*  A. @repeatable, along with a containing type annotation
*  B. @retention, along with a location where the value should be discarded
*  C. @deprecated, along with a reason why and a suggested alternative
*  D. @SuppressWarnings, along with a cause
*  E. @Override, along with an inherited reference

The Javadoc @deprecated annotation should be used, which provides a reason
for the deprecation and suggests an alternative. All of the other answers are incorrect,
with options A and B having the wrong case too. Those annotations should be written
@Repeatable and @Retention since they are Java annotations.

### What statement about marker annotations is correct?
* A. A marker annotation does not contain any elements or constant variables.
* B. A marker annotation does not contain any elements but may contain constant variables.
* C. A marker annotation does not contain any required elements but may include optional elements.
* D. A marker annotation does not contain any optional elements but may include required elements.
* E. A marker annotation can be extended.

A marker annotation is an annotation with no elements.
It may or may not have constant variables, making option B correct.
Option E is incorrect as no annotation can be extended.

### Which statements about the @Overrideannotation are correct? (Choose three.)
* A. It can be optionally specified when a class implements an abstract interface method.
*  B. Adding it to a method may trigger a compiler error.
*  C. It is required whenever a class implements an abstract interface method.
*  D. It can be added to an interface declaration type.
*  E. It can be optionally specified when a method is overridden in a subclass.
*  F. It is required whenever a method is overridden in a subclass.

The @Override annotation is always optional for methods and never required.
For this reason, options A and E are correct, and options C and F are incorrect.
Option B is correct because adding it to a method
that is not actually overriding an inherited method will cause a compiler error.
Option D is incorrect because it can be appliedonly to method declarations.

#### Which statements about annotations are correct? (Choose three.)
* A. Annotations contain data that changes throughout the program execution.
* B. Adding an annotation to a class that already compiles may trigger a compiler error and cause it to fail to compile.
* C. Annotations contain metadata about a Java type.
* D. Annotations cannot be applied to lambda expression variables.
* E. Annotations cannot be applied to other annotations.
* F. Removing all annotations from a class that already compiles will not introduce a compiler error.

Option A is incorrect, as annotations generally contain information
that is constant throughout the program execution.
Option B is correct.
For example, adding an @Override annotation to a method
that is not a valid override will trigger a compiler error.
Option C is also correct and is the primary purpose of annotations.
Options D and E are incorrect, as annotations can be
applied to a variety of types including lambda expression
variables and other annotations. Finally, option F is correct.
Annotations are optional metadata, and removing all of
them from a class does not cause a compiler error.

#### Which annotationcan be applied to an existing annotation
#### X and ensures a class that uses X shows the annotationin itsgenerated Javadoc?
* A. @Documented
* B. @Generated
* C. @JavaDoc
* D. @PreserveAnnotations
* E. @Retention
* F. None of the above

The correct annotation that preserves information about annotations
in generated Javadoc files is @Documented. The rest are incorrect.

##### Which properties of the Clean annotation must be true for the following to compile? (Choose three.)

``` java
 @Clean("Basement") public class House {}
```
* A. The annotation must contain exactly one element.
* B. The annotation must contain an element namedvalue.
* C. The element must not have a default value.
* D. The element may have a default value.
* E. The annotation may contain more than one element.
* F. The annotation must contain an element namedvalues.

An annotation may omit the element name if it contains an element named value,
declared as value(), making option B correct and option F incorrect.
Additionally, it may contain any number of additional elements, provided none of them is required,
making option E correct.
Finally, the element may optionally have a default value, making option D correct.
The other options are incorrect statements that contradict the correct answers.
