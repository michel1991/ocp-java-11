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