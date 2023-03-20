package annotations;
import java.lang.annotation.*;

/**
   Fill in the blank with the correct annotation usage that allows the code to compile without any warnings.
    A. value=ignoreAll
    B. value="deprecation","unchecked"
    C. "unchecked","deprecation"
    D. {"deprecation","unchecked"}
    E. "deprecation"
    F. None of the above

    The SystemPlanner class compiles although it contains two warnings.
    First, the ProjectPlanner class is used, which is deprecated.
    Second, the create() method uses an unchecked/unsafe operation
    taking a String for the generic type. For this reason, both unchecked
    and deprecation options are required for the code to compile without any warnings.
    Option D uses the correct format for passing an array to an annotation.
    Note that ignoreAll is not a known parameter that the JVM accepts.
 */
@Deprecated(since="5.0")
class ProjectPlanner<T> {
    ProjectPlanner create(T t) { return this; }
}

@SuppressWarnings({"deprecation","unchecked"}) // here ___________________
class SystemPlanner {
    ProjectPlanner planner = new ProjectPlanner().create("TPS");
}

public class SystemPlannerChoiceCorrectAnnotions {

}