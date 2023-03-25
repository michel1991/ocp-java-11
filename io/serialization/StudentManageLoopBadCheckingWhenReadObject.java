package io.serialization;
import java.io.*;


/*$
    Assuming the file referenced in the StudentManager class exists and contains data,
    which statement about the following class is correct? (Choose two.)

    A. The code does not compile.
    B. The code compiles but prints an exception at runtime.
    C. The program runs and prints all students in the file.
    D. The program runs but may only print some students in the files.
    E. For any instance of Student that is correctly deserialized, the value of score will be -1.
    F. For any instance of Student that is correctly deserialized, the value of score will not be -1.

      The code compiles and runs without issue, so options A and B are incorrect.
      The problem with the implementation is that checking if ios.readObject() is null
      is not the recommended way of iterating over an entire file.
      For example, the file could have been written with writeObject(null) in between two non-null records.
      In this case, the reading of the file would stop on this null value,
      before the end of the file has been reached. For this reason, option D is the correct answer.
      Note that the valid way to iterate over all elements of a file using ObjectInputStream
      is to continue to call readObject() until an EOFException is thrown. Finally, score is marked transient,
      which means the default int value of 0 will be set when the class is deserialized, making option F correct.
 */
class Student implements Serializable {
    transient int score = -1;
    String name;
    public String toString() { return name + ":" + score; }
}
class StudentManager {
    public static void main(String[] grades) {
        try(var ios = new ObjectInputStream(
                new FileInputStream(new File("s.data")))) {
            Student record;
            while((record = (Student)ios.readObject()) != null)
                System.out.print(record);
        } catch (EOFException e) {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class StudentManageLoopBadCheckingWhenReadObject{

}