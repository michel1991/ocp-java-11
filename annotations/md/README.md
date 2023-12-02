##### Fill in the blanks: The __________ annotation determines whether annotations are discarded at runtime,
##### while the __________ annotation determines whether they are discarded in generated Javadoc.
* A. @Target, @Deprecated
* B. @Discard, @SuppressWarnings
* C. @Retention, @Generated
* D. @Retention, @Documented
* E. @Inherited, @Retention
* F. @Target, @Repeatable
* G. None of the above

The @Retention annotation determines whether annotations are discarded
when the code is compiled, at runtime, or not at all.
The presence, or absence, of the @Documented annotation
determines whether annotations are discarded within generated Javadoc.
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
Option A is incorrect, as the compiler cannot actually enforce that the operations are safe.
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

#### Which annotations will trigger a compiler error if incorrectly
#### applied to a method with no other annotations? (Choose three.)
* A. @Documented
* B. @Deprecated
* C. @SuppressWarnings("unchecked")
* D. @Override
* E. @SuppressWarnings("magic")
* F. @SafeVarargs

@Documented can be applied only to annotations, not methods,
making option A correct. If @Override is applied to a method that is not actually overridden,
a compiler error will ensue, making option D correct.
The @SafeVarargs annotation will trigger
a compiler error if applied to a method without
a vararg parameter or without a final, private,
or static modifier, making option F correct.
The rest of the annotations can be applied
to methods without triggering a compiler error. For option E,
the compiler might not recognize the cause (such as magic), but it will still compile.

### Identify correct statements about annotations.

* A. @SuppressWarnings can be used only on a class, constructor, or a method.
    Actually, it can be used on several things. Its target can be a TYPE,
    FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, and MODULE.
* B. @Override can only be used on instance methods.
* C. @SafeVarargs can only be used on methods.
    It can be used on constructors and methods.
* D. @Deprecated can be used only on a class, constructor, or a method.
    Actually, it can be used on several things. Its target
    can be a CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER,TYPE.
* E. @SuppressWarnings("all") can be used to suppress all warnings from a method or a class.
    Although you can pass any string value to the SuppressWarnings annotation
    (unrecognized values are ignored), the Java specification mandates only
    three values - unchecked, deprecation, and removal.
    Different compilers and IDEs may support other values in addition to these three.

   There is no rule that says the value "all" has to supress all warnings
   (although a compiler or an IDE may do that upon seeing this value.)
(Correct B)

