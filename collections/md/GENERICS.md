#### Which of the following use generics and compile without warnings? (Choose two.)
* A. List<String> a = new ArrayList();
* B. List<> b = new ArrayList();
* C. List<String> c = new ArrayList<>();
* D. List<> d = new ArrayList<>();
* E. List<String> e = new ArrayList<String>();
* F. List<> f = new ArrayList<String>();

The diamond operator, <>, is only allowed to be used when instantiating rather than declaring.
In other words, it can’t go on the left side of the equals (=) sign.
Therefore, options B, D, and F are incorrect. The remaining three options compile.
However, option A produces a warning because generics are not used on the right side of the assignment operator.
Therefore, options C and E are correct.
Option C is preferred over option E, since it uses the diamond operator rather than specifying a redundant type.

#### Which statement is true about the following figure while ensuring the code continues to compile? (Choose two.)
[image](images/generics_P_R_Q_S.png)
* A. <> can be inserted at positions P and R without making any other changes.
* B. <> can be inserted at positions Q and S without making any other changes.
* C. <> can be inserted at all four positions.
* D. Both variables point to an ArrayList<String>.
* E. Only one variable points to an ArrayList<String>.
* F. Neither variable points to an ArrayList<String>.

The <> is known as the diamond operator. Here,
it works as a shortcut to avoid repeating the generic type twice for the same declaration.
On the right side of the expression, this is a handy shortcut.
Java still needs the type on the left side, so there is something to infer.
Positions Q and S are on the right side, making option B correct.
In this question, the generic type is never specified, so it is Object. Since it is not String, option F is correct.