### Which can fill in the blank to create a properly encapsulated class? (Choose all that apply.)

```java
public class Rabbits {
    _____ int numRabbits = 0;
    _____ void multiply() {
        numRabbits *= 6;
    }
    ______ int getNumberOfRabbits() {
        return numRabbits;
    }
}
```


* A. private, public, and public
* B. private, protected, and private
* C. private, private, and protected
* D. public, public, and public
* E. None of the above since multiply() does not begin with set
* F. None of the above for a reason other than the multiply() method

Instance variables must the private access modifier,
making option D incorrect. While it is common for methods to be public, this is not required.
Options A, B, and C are all correct, although some are more useful than others.
Since the class can be written to be encapsulated, options E and F are incorrect.