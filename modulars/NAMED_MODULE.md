### A(n) ________________ module can reference classes in a(n) _______________ module. Assume the package is exported as needed. (Choose all that apply.)
* A. automatic, named
* B. automatic, unnamed
* C. named, automatic
* D. named, unnamed
* E. unnamed, automatic
* F. unnamed, named
* G. None of the above

Named modules can read only from the module path, making option C correct and option D incorrect.
Unnamed modules can read only from the classpath, making options E and F incorrect.
Automatic modules can read from either the classpath or the module path, making options A and B correct.