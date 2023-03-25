package advancedDesign;

/**
   The following code appears in a file named Plant.java. What is the result of compiling this source file?
    A. The code compiles successfully, and two bytecode files are generated: Plant.class and Leaf.class.
    B. The code compiles successfully, and one bytecode file is generated: Plant.class.
    C. A compiler error occurs on line 1.
    D. A compiler error occurs on line 3.
    E. A compiler error occurs on line 5.
    F. A compiler error occurs on another line.

    The code does not contain any compiler errors.
    It is valid to define multiple top-level classes in a single file
    as long as only one of them is public and the others have the default access.
    Each class becomes a separate .class file, making option A is correct.
 */
class Plant { // 1:
    public boolean flowering; //   2:
    public Leaf [] leaves; //    3:
} // 4:
class Leaf { // 5:
    public String color; //   6:
    public int length; } //   7:


public class PlantTopLevelClass {
   public static void main(String ... args){

   }
}