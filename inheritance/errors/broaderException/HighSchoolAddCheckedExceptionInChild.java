package inheritance.errors.broaderException;

/**
 * What is the output of the HighSchool application?
    A. 10
    B. 20
    C. 4.0
    D. One line of the program does not compile.
    E. Two lines of the program do not compile.
    F. None of the above.

    When overriding a method, a new or broader checked exception cannot be declared.
    The getNumStudents() method in HighSchool is an invalid override
    since it declares FileNotFoundException,
    which is not declared in the parent method.
    Since this is the only line that does not compile, option D is correct.
    Note that an abstract method can be overridden with a final method, as shown with getNumTeachers().

 */
import java.io.FileNotFoundException;
abstract class School {
    abstract Float getNumTeachers();
    public int getNumStudents() {
        return 10;
    }
}
class HighSchool extends School {
    final Float getNumTeachers() { return 4f; }
    public int getNumStudents() throws FileNotFoundException {
        return 20;
    }
    public static void main(String[] s) throws Exception {
        var school = new HighSchool();
        System.out.print(school.getNumStudents());
    }
}


public class HighSchoolAddCheckedExceptionInChild {

}