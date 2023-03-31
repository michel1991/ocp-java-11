### Which statements about an optional annotation are correct? (Choose all that apply.)
* A. The annotation declaration always includes a default value.
* B. The annotation declaration may include a default value.
* C. The annotation always includes a value.
* D. The annotation may include a value.
* E. The annotation must not include a value.
* F. None of the above

An optional annotation element is one that is declared with a default value
that may be optionally replaced when used in an annotation.
For these reasons, options A and D are correct.

### What modifier is used to mark that an annotation element is required?
*  A. optional
*  B. default
*  C. required
*  D. *
*  E. None of the above

In an annotation, an optional element is specified with the default modifier,
followed by a constant value.
Required elements are specified by not providing a default value.
Therefore, the lack of the default term indicates the element is required.
For this reason, option E is correct.

### What modifier is used to mark an annotation element as optional?
*  A. optional
*  B. default
*  C. required
*  D. value
*  E. case
*  F. None of the above

The default modifier along with a value is used to mark
an annotation element as optional, as opposed to required.

### Which of the following are permitted for an annotation element default value? (Choose three.)
*  A. ""
*  B. (int)1_000.0
*  C. new String()
*  D. Integer.valueOf(3).intValue()
*  E. null
*  F. Integer.MAX_VALUE

An annotation element can include a default value if it is a non-null constant expression.
Options A, B, and F fulfill this criteria.
Option C is incorrect because it creates a new object.
Option D is incorrect because it uses method calls.
Option E is incorrect because null is not permitted.