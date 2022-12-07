# Given a zoo management system, which of the following is best stored using an annotation?
A. The number of animals currently in the zoo
B. The names of each animal
C. The number of visitors to the zoo each year
D. The number of people who bought tickets to the zoo on a given day
E. The number of animals that can fit in an enclosure

Annotations should include metadata (data about data) that is relatively constant, as opposed to attribute data, which is part of the object and can change frequently.
The number of animals in the zoo, their names, and the guests of the zoo can change throughout the day, so that information is best stored as part of the data.
The number of animals that can fit in an enclosure defines a rule about the enclosure.
It does not include how many animals are actually in each enclosure; therefore, it is appropriate metadata and best served using an annotation.

# Fill in the blanks: The __________ annotation determines whether annotations are discarded at runtime, while the __________ annotation determines whether they are discarded in generated Javadoc.
A. @Target, @Deprecated
B. @Discard, @SuppressWarnings
C. @Retention, @Generated
D. @Retention, @Documented
E. @Inherited, @Retention
F. @Target, @Repeatable
G. None of the above

The @Retention annotation determines whether annotations are discarded when the code is compiled, at runtime, or not at all.
The presence, or absence, of the @Documented annotation determines whether annotations are discarded within generated Javadoc.
For these reasons, option D is correct.

# What conditions must be true to declare a repeatable annotation along with its associated containing annotation type? (Choose all that apply.)
A. The repeatable annotation must be declared with @Repeatable, which includes a value that points to the containing type annotation.
B. The repeatable annotation must include an element called value().
C. The repeatable annotation must include an element whose type is a primitive array.
D. The containing annotation type must be declared with @Repeatable, which includes a value that points to the repeatable annotation.
E. The containing annotation type must include an element called value().
F. The containing annotation type must include an element whose type is an array.

Creating a repeatable annotation requires declaring two annotations.
The first, the repeatable annotation, needs to be declared with @Repeatable and include a value that refers to the containing annotation type.
The second, the containing annotation type, must include an element named value() that includes an array of the repeatable annotation type.
For these reasons, options A, E, and F are correct.

# Which annotation can cancel out a warning on a method using the @Deprecated API at compile time?

A. @FunctionalInterface
B. @Ignore
C. @IgnoreDeprecated
D. @Retention
E. @SafeVarargs
F. @SuppressWarnings
If @SuppressWarnings("deprecation") is applied to a method that is using a deprecated API,
then warnings related to the usage will not be shown at compile time, making option F correct.
Note that there are no built-in annotations called @Ignore or @IgnoreDeprecated.

# What properties must be true to use an annotation with an element value, but no element name? (Choose all that apply.)
A. The element must be named values().
B. The element must be required.
C. The annotation declaration must not contain any other elements.
D. The annotation must not contain any other values.
E. The element value must not be array.
F. None of the above
To use an annotation with a value but not element name, the element must be declared with the name value(), not values(), making option A incorrect.
The value() annotation may be required or optional, making option B incorrect.
The annotation declaration may contain other elements, provided none is required, making option C incorrect.
Option D is correct, as the annotation must not include any other values. Finally, option E is incorrect, as this is not a property of using a value() shorthand.

# Which statements about an optional annotation are correct? (Choose all that apply.)
A. The annotation declaration always includes a default value.
B. The annotation declaration may include a default value.
C. The annotation always includes a value.
D. The annotation may include a value.
E. The annotation must not include a value.
F. None of the above
An optional annotation element is one that is declared with a default value that may be optionally replaced when used in an annotation.
For these reasons, options A and D are correct.

# What motivations would a developer have for applying the @FunctionalInterface annotation to an interface? (Choose all that apply.)
A. To allow the interface to be used in a lambda expression
B. To provide documentation to other developers
C. To allow the interface to be used as a method reference
D. There is no reason to use this annotation.
E. To trigger a compiler error if the annotation is used incorrectly
The @FunctionalInterface marker annotation is used to document that an interface is a valid functional interface that contains exactly one abstract method, making option B correct.
It is also useful in determining whether an interface is a valid functional interface, as the compiler will report an error if used incorrectly, making option E correct.
The compiler can detect whether an interface is a functional interface even without the annotation, making options A and C incorrect.

# Which annotations require a value to be applied to a declaration? (Choose all that apply.)
A. @Retention
B. @Documented
C. @FunctionalInterface
D. @SafeVarargs
E. @Repeatable
F. @Deprecated
G. @SuppressWarnings
@Documented, @FunctionalInterface, and @SafeVarargs are marker annotations and do not take any values.
On the other hand, @Retention requires a RetentionPolicy value, making option A correct.
Likewise, @Repeatable requires a containing annotation type, and @SuppressWarnings requires a String[] value, making options E and G correct, respectively.
Finally, option F is incorrect. While @Deprecated may take a since() String value or forRemoval() boolean value, both are optional.

# Fill in the blanks: When using the @SuppressWarnings annotations, a value of _________________ causes it to ignore issues with generics, while a value of _________________, causes it to ignore code that is marked as outdated.
A. generic, deprecation
B. generic, ignore
C. safetypes, deprecated
D. safetypes, ignore
E. unchecked, deprecation
F. unchecked, deprecated
G. None of the above

The correct option to ignore issues with generic types is unchecked, while deprecation is used to ignore code that is marked deprecated, making option E correct.
Most of the other options are not built-in types supported by the compiler.

# Which annotations are marker annotations? (Choose all that apply.)
A. @SafeVarargs
B. @Override
C. @Deprecated
D. @Documented
E. @SuppressWarnings
F. @Target
G. @FunctionalInterface

A marker annotation is one that contains no elements, optional or required.
For this reason, @SafeVarargs, @Override, @Documented, and @FunctionalInterface correct.
The annotations @SuppressWarnings and @Target contain a required element, making options E and F incorrect.
Option C is also incorrect, as @Deprecated can take optional values.

# Suppose you have separate modules for a service provider interface, service provider, service locator, and consumer. Which statements are true about the directives you need to specify? (Choose all that apply.)
A. The consumer must use the requires directive.
B. The consumer must use the uses directive.
C. The service locator must use the requires directive.
D. The service locator must use the uses directive.

Option A and C are correct because both the consumer and the service locator depend on the service provider interface.
Additionally, option D is correct because the service locator must specify that it uses the service provider interface to look it up.

# Which annotations require a value to be applied to a declaration? (Choose all that apply.)
A. @Retention
B. @Documented
C. @FunctionalInterface
D. @SafeVarargs
E. @Repeatable
F. @Deprecated
G. @SuppressWarnings

@Documented, @FunctionalInterface, and @SafeVarargs are marker annotations and do not take any values.
On the other hand, @Retention requires a RetentionPolicy value, making option A correct.
Likewise, @Repeatable requires a containing annotation type, and @SuppressWarnings requires a String[] value, making options E and G correct, respectively.
Finally, option F is incorrect. While @Deprecated may take a since() String value or forRemoval() boolean value, both are optional.

# Which annotation can cancel out a warning on a method using the @Deprecated API at compile time?
A. @FunctionalInterface
B. @Ignore
C. @IgnoreDeprecated
D. @Retention
E. @SafeVarargs
F. @SuppressWarnings
G. None of the above

If @SuppressWarnings("deprecation") is applied to a method that is using a deprecated API,
then warnings related to the usage will not be shown at compile time, making option F correct.
Note that there are no built-in annotations called @Ignore or @IgnoreDeprecated.


