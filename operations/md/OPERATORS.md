#### Which of the following are valid operators in Java?
* A. !
    operates only on booleans
* B. ~
    bitwise negation. Operates only on integral types.
* C. &
    bitwise AND
* D. %=
    similar to += or /=
* E. $
    It is not an operator!
(Correct A, B, C, D)

### Which operators will always evaluate all the operands?
* A. &&
* B. |
* C. ||
* D. ? :
    If the condition before ? returns true, only the first operand will be evaluated,
    otherwise only the second operand is evaluated.
* E. %
 All mathematical operators evaluate all the operands

 || and && are also known as short circuit operators since they do not evaluate
 the rest of the expression if the value of the expression
 can be determined by just evaluating part of the expression
 for example ( true || (bool = false)) will not assign false to bool
 because the value of the expression can be told just
 by seeing the first part i.e. true. But ( true | (bool = false)) will assign false to bool.

(Correct B, E)
