package advancedDesign;


/**
  Which of the following is the code an example of? (Choose all that apply.)
    A. Immutability
    B. Input validation
    C. Limiting accessibility
    D. Restricting extensibility
    E. None of the above

  Since the class is final, it restricts extensibility, making option D correct.
  The private variable limits accessibility, making option C correct.
  This class does not do any validation, making option B incorrect.
  Option A is incorrect because there are setters, and the length field is not marked final.
 */
final class Worm {
    private int length;

    // Assume getters/setters/constructors provided

    public Worm(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int setLength(int length) {
        return this.length = length;
    }
}

public class WormChoiceConceptNotImmutability {

}