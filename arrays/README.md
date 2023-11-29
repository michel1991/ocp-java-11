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

#### Identify correct statements about a two dimensional array.

* A. It is like a rectangular matrix where number of rows and number of columns may be different but each row or each column have the same number of elements.
* B. It is like a square matrix where number of rows and number of columns are same and each row or each column have the same number of elements.
* C. The number of rows and columns must be specified at the time it is declared.
    Size of the dimensions is required to be specified only at the time of instantiation and not at the time of declaration. For example,
    int[][] ia; //this is a valid declaration.
    int[][] ia = new int[2][3];//This is a valid declaration and a valid instantiation

    Further, only the size of the first dimension is required to be specified at
    the time of instantiation for an array of more than one dimension.
    Sizes of the other dimensions may be left out.
    int[][] iaa=new int[3][];
    int[][][] iaaa = new int[3][][]; //Both are valid.
    This is allowed because a multi dimensional array in Java is just an array of arrays.
    They do not have to be symmetric, that is, each sub array is an independent array and so
    they do not have to be of the same size. So, in the above example, iaa[0] can be initialized to new int[5],
    and ia[1] to new int[10], while ia[2] can be left null.

* D. It is basically an array of arrays.

Unlike some other languages, multi dimensional arrays in Java are not like matrices.
They are just arrays of arrays. For example, if you have a two dimensional
array then each element of this array is a one dimensional array. Each such array element
is independent and therefore can be of different lengths (but not of different type).

(Correct D )


