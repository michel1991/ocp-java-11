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

Which annotation can cancel out a warning on a method using the @Deprecated API at compile time?

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