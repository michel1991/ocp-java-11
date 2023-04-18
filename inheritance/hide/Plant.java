package inheritance.hide;

/**
 * What is the output of the Plant program?
    A. plant,bush,plant
    B. plant,bush,bush
    C. bush,plant,bush
    D. bush,bush,bush
    E. The code does not compile.
    F. None of the above.
    
    While both objects are instances of Bush, we are not calling methods in this example.
    Virtual method invocation works only for methods, not instance variables.
    For instance variables, Java looks at the type of the
    reference and calls the appropriate variable based on the reference.
    Based on the reference types of the three variables (Plant, Bush, Plant),
    option A is correct.
 */
class Bush extends Plant {
    String type = "bush";
}
public class Plant {
    String type = "plant";
    public static void main(String[] args) {
        Plant w1 = new Bush();
        Bush w2 = new Bush();
        Plant w3 = w2;
        System.out.print(w1.type+","+w2.type+","+w3.type);
    }
}