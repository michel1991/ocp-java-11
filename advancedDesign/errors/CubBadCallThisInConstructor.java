package advancedDesign.errors;

/**
   What is the result of this code?
    A. 0
    B. 0 null
    C. 44
    D. 44 null
    E. 44.0
    F. 44.0 null
    G. The code does not compile.

    The this() call must be the first line of a constructor if present.
    If the order of the statements in the one parameter constructor were reversed,
    the answer would be option E.

 */
class Cub {
    private String name;
    private double weight;
    public Cub(double weight) {
        this.weight = weight;
        this("", weight);
    }
    public Cub(String name, double weight) {
        weight = weight;
        this.name = name;
    }
    public static void main() {
        Cub cub = new Cub(44);
        System.out.println(cub.weight + "" + cub.name);
    }
}
public class CubBadCallThisInConstructor {
    public static void main(String[] args) {

    }
}