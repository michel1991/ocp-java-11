package generics;
import java.io.*;

/**
 *  Which of the following can fill in the blank to make the code compile?
    A. ? only
    B. N only
    C. ? and N
    D. News, and Object
    E. N, News, and Object
    F. None of the above

    When declaring a class that uses generics, you must specify a name for the formal type parameter.
    Java uses the standard rules for naming a variable or class.
    A question mark is not allowed in a variable name, making options A and C incorrect.
    While it is common practice to use a single uppercase letter for the type parameter,
    this is not required.
    It certainly isn’t a good idea to use existing class names
    like the News class being declared here or the Object class built into Java.
    However, both are allowed, making option E the answer.

 */
class News<News> {} // ____
public class NewsChoiceFormalType {

}