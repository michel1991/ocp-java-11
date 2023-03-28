package advancedDesign.errors;

/**
   What does the following print? What is the output of the following program?
    A. Sleepy
    B. Bashful
    C. Doc
    D. The code does not compile.
    E. An exception is thrown at runtime.

    A final instance variable must be assigned a value when it is declared,
    in an instance initializer, or by a constructor.
    The Dwarf(String) constructor does not assign a value since
    it contains a local variable called name already.
    For this reason, this constructor does not compile, and option D is correct.
    If the assignment in the constructor was changed to this.name,
    then the program would compile and print Sleepy.

 */
class Dwarf {
    private final String name;

    public Dwarf() {
        this("Bashful");
    }

    public Dwarf(String name) {
        name = "Sleepy"; // it is local variable of method that is set
    }

    public static void main(String[] sound) {
        var d = new Dwarf("Doc");
        System.out.println(d.name);
    }
}

public class DwarfFinalVariableNotAssignedValue {

}