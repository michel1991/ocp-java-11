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
The annotations @SuppressWarnings and @Target contain a required element, making options E and F incorrect.
Option C is also incorrect, as @Deprecated can take optional values.

#### Which of the following are marker annotations? (Choose three.)
*  A. @Target
*  B. @Inherited
*  C. @Override
*  D. @Retention
*  E. @Repeatable
*  F. @Documented

Options B, C, and F are each marker annotations because they do not contain any elements.
Option A is incorrect because @Targetrequires anElementType[] value.
Option D is incorrect because @Retentionrequires aRetentionPolicy value.
Option E is incorrect because @Repeatable requires a Class value.