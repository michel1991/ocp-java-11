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