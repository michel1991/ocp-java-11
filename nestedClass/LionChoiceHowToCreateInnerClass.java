package nestedClass;

/**
   Which of the following can be inserted in the rest() method? (Choose all that apply.)

    A. Cub a = Lion.new Cub()
    B. Lion.Cub b = new Lion().Cub()
    C. Lion.Cub c = new Lion().new Cub()
    D. var d = new Den()
    E. var e = Lion.new Cub()
    F. Lion.Den f = Lion.new Den()
    G. Lion.Den g = new Lion.Den()
    H. var h = new Cub()

    Option C is the correct way to create an instance of an inner class Cub using an instance
    of the outer class Lion. The syntax looks weird, but it creates an object of the outer class
    and then an object of the inner class from it.
    Options A, B, and E use incorrect syntax for creating an instance of the Cub class.
    Options D and G are the correct way to create an instance of the static nested Den class,
    as it does not require an instance of Lion, while option F uses invalid syntax.
    Finally, option H is incorrect since it lacks an instance of Lion.
    If rest() were an instance method instead of a static method, then option H would be correct.
 */
class Lion {
    class Cub {}
    static class Den {}
    static void rest() {
        Lion.Cub c = new Lion().new Cub(); //________________;
    } }

public class LionChoiceHowToCreateInnerClass {

}