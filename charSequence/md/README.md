#### Which of these statements concerning the charAt() method of the String class are true?

* A. The charAt( ) method can take a char value as an argument.
    Yes, it can because it takes an int and char will be implicitly promoted to int.
* B. The charAt( ) method returns a Character object.
    It returns char.
* C. The expression char ch = "12345".charAt(3) will assign 3 to ch.
    It will assign 4 as indexing starts from 0.
* D. The expression char ch = str.charAt(str.length()) where str is "12345", will assign 3 to ch.
    It will throw IndexOutOfBoundsException as str.length() is 5 and there is no str.charAt(5);
* E. The index of the first character is 0.
* F. It throws StringIndexOutOfBoundsException if passed a value higher than or equal to the length of the string (or less than 0).
* G. It throws ArrayIndexOutOfBoundsException if passed a value higher than or equal to the length of the string (or less than 0).

(correct A, E)

Since indexing starts with 0, the maximum value that you can pass to charAt is length-1.
As per the API documentation for charAt, it throws IndexOutOfBoundsException if you pass an invalid value.
Both - ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException, extend IndexOutOfBoundsException
and although in practice, the charAt method throws StringIndexOutOfBoundsException,
it is not a valid option because the implementation is free to throw some other exception
as long as it is an IndexOutOfBoundsException. There are questions in the exam on this aspect.
