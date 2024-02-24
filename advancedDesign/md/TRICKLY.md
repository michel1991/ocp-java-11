### Fill in the blanks: Because of ___________, it is possible to ___________ a method, which allows Java to support ___________.
* A. abstract methods, override, inheritance
* B. virtual methods, override, polymorphism
* C. concrete methods, overload, inheritance
* D. virtual methods, overload, interfaces
* E. inheritance, abstract, polymorphism
* F. abstract methods, inherit, multiple inheritance

For this question, it helps to try all answers out.
Most of them do not make any sense. For example,
overloading a method is not a facet of inheritance.
Likewise, concrete and abstract methods can both be overridden, not just one.
The only answer that is valid is option B.
Without virtual methods, overriding a method would not be possible,
and Java would not truly support polymorphism.

### Which of the following are valid code snippets appearing in a method:
* A. var a = b = c = 100;
    There are two issues here -
    1. You cannot declare multiple variables in the same statement using var.
    2. Chaining to use a value of a variable at the time of declaration is not allowed.
        Had b and c been already declared, it would have been valid. For example, the following is valid:
      var b = 0;
      var c = 0;
      var a = b = c = 100;

* B. var a = 100, b = 10;
    var a = b;
 'var' is not allowed in a compound declaration. Therefore, var a = 100, b = 10; will not compile.

* C. int a, b, c=100;
* D. int a=100, b, c;
* E. int a = 100 = b = c;

* F. int a = b = c = 100;
Chaining to use a value of a variable at the time of declaration is not allowed.
Had b and c been already declared, it would have been valid. For example, the following is valid:
  int  b = 0, c = 0;
  int a = b = c = 100;
Even the following is valid:
  int  b , c;  //Not initializing b and c here.
  int a = b = c = 100; //declaring a and initializing c, b, and a at the same time.
Notice the order of initialization of the variables - c is initialized first,
 b is initialized next by assigning to it the value of c. Finally, a is initialized.

* G. int a, b, c; a = b = c = 100


Correct(C, D, G)