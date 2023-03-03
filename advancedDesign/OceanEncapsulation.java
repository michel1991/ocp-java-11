package advancedDesign;

import java.util.*;

/**
   Which statement best describes this class?
    A. It can be serialized.
    B. It is well encapsulated.
    C. It is immutable.
    D. It is both well encapsulated and immutable.
    E. None of the above as the code does not compile.

    This class does not implement Serializable, so option A is incorrect.
    This code is well encapsulated because the instance variablesareprivate.
    The algae and wave variables are immutable because they are marked final,
    and there are no methods that can change them.
    The getAlgae()method creates a defensive copy, preventing direct access to the algae object.
    Finally, the sun variable is initialized to 0 and is not able to be changed afterits creation.
    The setSun() method is missing a this reference, so the assignment sun = sun assigns the method parametersun to itself.
    For these reasons, the class is immutable, and option D is correct.

 */
public final class OceanEncapsulation {
    private final List<String> algae;
    private final double wave;
    private int sun;

    public OceanEncapsulation(double wave) {
        this.wave = wave;
        this.algae = new ArrayList<>();
    }

    public int getSun() {
        return sun;
    }
    public void setSun(int sun) {
        sun = sun;
    }
    public double getWave() {
        return wave;
    }
    public List<String> getAlgae() {
        return new ArrayList<String>(algae);
    }
}