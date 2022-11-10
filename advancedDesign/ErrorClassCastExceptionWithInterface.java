package advancedDesign;

 interface Apple {

 }

interface Orange {

 }

class Gala implements Apple {

 }

class Tangerine implements Orange {

 }

final class Citrus extends Tangerine {

 }

/**
* Line 11 does not compile because a Tangerine and Gala are unrelated types, which the compiler can enforce for classes, making option A correct.
* Line 12 is valid since Citrus extends Tangerine and would print true at runtime if the rest of the class compiled.
* Likewise, Gala implements Apple, so line 13 would also print true at runtime if the rest of the code compiled.Line 14 does compile,
* even though Apple and Tangerine are unrelated types. While the compiler can enforce unrelated type rules for classes,
* it has limited ability to do so for interfaces, since there may be a subclass of Tangerine that implements the Apple interface.
* Therefore, this line would print false if the rest of the code compiled.Line 15 does not compile. Since Citrus is marked final,
* the compiler knows that there cannot be a subclass of Citrus that implements Apple, so it can enforce the unrelated type rule.
* For this reason, option E is correct.
 */
public class ErrorClassCastExceptionWithInterface {

     public static void main(String... farm) {
         Gala g = new Gala();
         Tangerine t = new Tangerine();
         Citrus c = new Citrus(); // line 10
         System.out.print(t instanceof Gala); // line 11
         System.out.print(c instanceof Tangerine); // line 12
         System.out.print(g instanceof Apple); // line 13
         System.out.print(t instanceof Apple); // line 14
         System.out.print(c instanceof Apple); // line 15
     }
}