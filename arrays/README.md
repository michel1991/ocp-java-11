#### Which of the options in the graphic best represent the blocks variable?
```java
char[][] blocks = new char[][] {
    { 'a', 'b', 'c' }, { 'd' }, { 'e', 'f' } };
```

* A. Option A
* B. Option B
* C. Option C
* D. Otion D

[image](./images/graphic_best.jpg).
Options A, C, and D represent 3×3 2D arrays.
Option B best represents the array in the code.
It shows there are three different arrays of different lengths.

#### Which of these four pairs of declarations
#### can point to an array that is different from the others?
* A. int[][][][] nums1a, nums1b;
* B. int[][][] nums2a[], nums2b;
* C. int[][] nums3a[][], nums3b[][];
* D. int[] nums4a[][][], numbs4b[][][];

All of the variables except nums2b point to a 4D array.
Don’t create a 4D array in practice; it’s confusing.
The options show that the brackets, [],
can be before or after the variable in any combination.
Option B is the answer because nums2b points to a 3D array.
It has only three pairs of brackets before the variable and none after.
By comparison, nums2a has three pairs
of brackets before the variable and the fourth pair of brackets after.

##### Which statement is true?
* A. You can always change a method signature from call(String[] arg) to call(String... arg) without causing a compiler error in the calling code.
* B. You can always change a method signature from call(String... arg) to call(String[] arg) without causing a compiler error in the existing code.
* C. Both of the above.
* D. Neither of the above.

From within a method, an array parameter and a varargs parameter are treated the same.
From the caller, an array parameter is more restrictive.
Both types can receive an array.
However, only a varargs parameter is allowed to automatically turn individual parameters into an array.
Therefore, the answer is option A.

### Is it possible to create arrays of length zero?

* A. Yes, you can create arrays of any type with length zero.
    Java allows arrays of length zero to be created.  Here is an example:
    int[] zeroLengthArray1 = new int[0];
    System.out.println(zeroLengthArray1.length); // will print 0
    String[] zeroLengthArray2 = new String[0];
    System.out.println(zeroLengthArray2.length); // will print 0
* B. Yes, but only for primitive datatypes.
* C. Yes, but only for arrays of object references.
* D. Yes, and it is same as a null array.
    A null pointer is different from an array of length zero.
    A reference being null or pointing to null means it is not pointing to anything at all.
    But an array of length zero is a valid object. Thus, a reference pointing to such an array is not pointing to null.
    For example, if you have int[] intArr = new int[0]; then (intArr == null) is false.
* E. No, arrays of length zero do not exist in Java.

Example: When a Java program is run without any program arguments, the String[] args argument to main() gets an array of length Zero.
(Correct A)

