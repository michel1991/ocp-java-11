### Which annotations are marker annotations? (Choose all that apply.)
* A. @SafeVarargs
* B. @Override
* C. @Deprecated
* D. @Documented
* E. @SuppressWarnings
* F. @Target
* G. @FunctionalInterface

A marker annotation is one that contains no elements, optional or required.
For this reason, @SafeVarargs, @Override, @Documented, and @FunctionalInterface correct.
The annotations @SuppressWarnings and @Target contain a required element,
making options E and F incorrect.
Option C is also incorrect, as @Deprecated can take optional values.

#### Which of the following are marker annotations? (Choose three.)
*  A. @Target
*  B. @Inherited
*  C. @Override
*  D. @Retention
*  E. @Repeatable
*  F. @Documented

Options B, C, and F are each marker annotations because they do not contain any elements.
Option A is incorrect because @Target requires an ElementType[] value.
Option D is incorrect because @Retention requires a RetentionPolicy value.
Option E is incorrect because @Repeatable requires a Class value.

### What statement about marker annotations is correct?
* A. A marker annotation does not contain any elements or constant variables.
* B. A marker annotation does not contain any elements but may contain constant variables.
* C. A marker annotation does not contain any required elements but may include optional elements.
* D. A marker annotation does not contain any optional elements but may include required elements.
* E. A marker annotation can be extended.

A marker annotation is an annotation with no elements.
It may or may not have constant variables, making option B correct.
Option E is incorrect as no annotation can be extended.

### Which statements about the @Override annotation are correct? (Choose three.)
*  A. It can be optionally specified when a class implements an abstract interface method.
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

#### Which annotationcan be applied to an existing annotation
#### X and ensures a class that uses X shows the annotation in its generated Javadoc?
* A. @Documented
* B. @Generated
* C. @JavaDoc
* D. @PreserveAnnotations
* E. @Retention
* F. None of the above

The correct annotation that preserves information about annotations
in generated Javadoc files is @Documented. The rest are incorrect.