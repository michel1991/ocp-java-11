# Which of the answer choices make sense to implement with a lambda? (Choose all that apply.)
    A. Comparable interface
    B. Comparator interface
    C. remove method on a Collection
    D. removeAll method on a Collection
    E. removeIf method on a Collection
    You Answered Correctly!
    
Both Comparator and Comparable are functional interfaces.
However, Comparable is intended to be used on the object being compared, making option B correct.
The removeIf() method allows specifying the lambda to check when removing elements, making option E correct.
Option C is incorrect because the remove() method takes an instance of an object to look for in the Collection to remove.
Option D is incorrect because removeAll() takes a Collection of objects to look for in the Collection to remove.

# Which statements about decision structures are true? (Choose all that apply.)
A. A for-each loop can be executed on any Collections Framework object.
B. The body of a while loop is guaranteed to be executed at least once.
C. The conditional expression of a for loop is evaluated before the first execution of the loop body.
D. A switch statement with no matching case statement requires a default statement.
E. The body of a do/while loop is guaranteed to be executed at least once.
F. An if statement can have multiple corresponding else statements.

A for-each loop can be executed on any Collections object that implements java.lang.Iterable, such as List or Set, but not all Collections classes, such as Map, so option A is incorrect.
The body of a do/while loop is executed one or more times, while the body of a while loop is executed zero or more times, making option E correct and option B incorrect.
The conditional expression of for loops is evaluated at the start of the loop execution, meaning the for loop may execute zero or more times, making option C correct.
Option D is incorrect, as a default statement is not required in a switch statement.
In the case that no case statements match and there is no default statement, the application will exit the switch statement without executing any branches.
Finally, each if statement has at most one matching else statement, making option F incorrect.
You can chain multiple if and else statements together, but each else statement requires a new if statement.