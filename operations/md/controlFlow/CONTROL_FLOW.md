#### Which of these statements are valid when occurring by themselves in a method?

* A. while ( ) break ;
 The condition expression in a while header is required.
* B. do { break ; } while (true) ;
* C. if (true) { break ; } (When not inside a switch block or a loop)
You cannot have break or continue in an 'if' or 'else' block without being inside a loop.
Note that the problem statement mentions, "...occuring by themselves".
This implies that the given statement is not wrapped within any other block.
Note: break with a label is possible in an if/else statement without a loop:
``` java
    label: if(true){
        System.out.println("break label");
        break label; //this is valid
    }
    
``` 

* D. switch (1) { default : break; }
You can use a constant for a switch statement's expression.
* E. for ( ; true ; ) break ;

It is not possible to break out of an if statement.
But if the if statement is placed within a switch statement or a loop construct,
the usage of break in option 3 would be valid.
You may want to check out the free video by Dr.
Sean Kennedy explaining this question: https://youtu.be/YsM-ApNLWm4
(Correct B, D, E)
