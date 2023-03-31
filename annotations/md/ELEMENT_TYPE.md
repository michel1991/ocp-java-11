### Which of the following are permitted to be used for annotation element type? (Choose three.)
* A. Object
* B. An annotation
* C. Class[]
* D. An enum
* E. Double
* F. var

An annotation element type must be a primitive type, a String, a Class, an enum,
another annotation, or an array of any of these types.
For this reason, options B, C, and D are correct.
Option A is incorrect because Object is not supported.
While primitives are supported, wrappers are not, making option E incorrect.
Option F is also incorrect as local variable type inference with var is not permitted,
even if a default value is provided.