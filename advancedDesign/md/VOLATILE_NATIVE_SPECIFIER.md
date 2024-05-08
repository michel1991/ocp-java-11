#### which of these are NOT legal declarations within a class?

* A. static int sa ;

* B. final Object[ ] objArr = { null } ;
Declares and defines an array of Objects of length 1.

* C. abstract int t ;
Variables can't be declared as abstract or native.

* D. abstract void format( ) ;
* E. final static private double PI = 3.14159265358979323846 ;


static and final are valid modifiers for both member field and method declarations within a class.
transient and volatile modifiers are only valid for member field declarations.
abstract and native are only valid for member methods.

Note: a class declaration can have only final, abstract and public as modifiers, unless it is a nested class,
in which case, it can be declared private or  protected as well.
Within a method, a local variable may be declared as final.

Correct(C)