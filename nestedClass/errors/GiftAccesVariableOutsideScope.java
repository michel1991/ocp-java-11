package nestedClass.errors;
/**
 * What is the output of the following application?
    A. GiantRobot GiantRobot
    B. GiantRobot DinosaurRobot
    C. DinosaurRobot DinosaurRobot
    D. The code does not compile because of line y1.
    E. The code does not compile because of line y2.
    F. None of the above.

    The declarations of the local classes Robot and Transformer compile without issue.
    The only compilation problem in this program is the last line of the main() method.
    The variable name is defined inside the local class and not accessible outside class
    declaration without a reference to the local class.
    Due to scope, this last line of the main() method does not compile,
    making option F the correct answer.
    Note that the first part of the print() statement in the main() method,
    if the code compiled, would print GiantRobot.
 */
interface Toy { String play(); }
class Gift {
    public static void main(String[] matrix) {
        abstract class Robot {}
        class Transformer extends Robot implements Toy {
            public String name = "GiantRobot";
            public String play() {return "DinosaurRobot";}  // y1
        }
        Transformer prime = new Transformer () {
            public String play() {return name;}             // y2
        };
        System.out.print(prime.play()+" "+name);
    }
}


public class GiftAccesVariableOutsideScope {

}