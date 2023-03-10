package generics.errors;

/**
 *  What is the first line with a compiler error?
    A. Line R
    B. Line S
    C. Line T
    D. Line U
    E. None of the above

    The generic declaration on line R is valid.
    It sets a constraint on the generic type used when declaring a Fur object.
    Lines S and T compile as they meet this constraint.
    However, line U has a problem since Sat does not extend Mammal.
    Since this line does not compile, option D is the answer.

 */

class Mammal {}
class Bat extends Mammal {}
class Cat extends Mammal {}
class Sat {}


class Fur<T extends Mammal> {    // line R

    void clean() {
        var bat = new Fur<Bat>();  // line S
      var cat = new Fur<Cat>();  // line T
      var sat = new Fur<Sat>();  // line U
    }
}

public class FurFindErrors {

}