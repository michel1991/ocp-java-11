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


### You want to find out whether two strings are equal or not,
#### in terms of the actual characters within the strings. What is the best way to do this?

* A. use String's equals method.
    For example:
    String x1 = "a";
    String x2 = new String("a");

    x1.equals(x2) will return true. Because even though x1 and x2 are pointing
    to different objects, the content of the objects are same,
    which is what String's equals method checks.
    
    x1 == x2 will return false, because == only checks if the two references are pointing to the same object or not.
    In this case, they are not.
    
* B. use String's equalsIgnoreCase method.
    If you use this method, "a" will be considered equal to "A",
    which is not what the question is asking for.
    
* C. Use == operator.
    == checks for the equality of the references and not for the equality of the objects themselves.
    Therefore, this will return true only if two string references are pointing to the same String object,
    which is not what the question is asking for.

* D. Use String's match method.
    There is no method named match in String class.
    There is a matches method, which checks whether the String matches
    a regular expression but that is beyond the scope of this exam.
    
    public boolean matches(String regex)
    Tells whether or not this string matches the given regular expression.
    An invocation of this method of the form str.matches(regex)
    yields exactly the same result as the expression Pattern.matches(regex, str)
    
(Correct is A)

### Which of the following operators can be used in conjunction with a String object?
* A. +
* B. ++
* C. +=
* D. .
* E. *

Only + is overloaded for String. a+=x is actually converted to a = a + x.
so it is valid for Strings. dot (.) operator accesses members of the String object.
There is only one member variable though:
CASE_INSENSITIVE_ORDER. It is of type Comparator (which is an interface).
(Correct A, C, D)

