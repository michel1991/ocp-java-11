# Given the following two classes, which of the following statements will compile when inserted independently on line 2? (Choose all that apply.)

```java
package lilypad; // 1:
public class Frog {  } // 2:

  package lilypad; // 1:
 // INSERT CODE HERE  2:
  public class Tadpole { // 3:
    private Frog parent;  // 4
  }  // 5:

```
A. import Frog;
B. import lilypad.Frog;
C. import lilypad.Tadpole;
D. import static lilypad.Tadpole;
E. static import lilypad.Tadpole;
F. The code compiles without any code additions.

Since both Frog and Tadpole are in the same package, no import is needed, making option F correct.
Option B is also correct because importing redundant classes is allowed.
Option A is not correct because imports must include the full package name.
Option C is correct because it is a valid import statement—albeit one that is ignored since we are already in the Tadpole class.
Options D and E are incorrect because static imports must import members and not the class name.

# Given the following classes, which of the following snippets can independently be inserted in place of INSERT IMPORTS HERE and have the code compile? (Choose all that apply.)

```java
    package aquarium;
    public class Water {
        boolean salty = false;
        }

    package aquarium.jellies;
    public class Water {
        boolean salty = true;
    }

    package employee;
    //INSERT IMPORTS HERE
    public class WaterFiller {
        Water water;
    }
```
Option A is correct because it imports all the classes in the aquarium package including aquarium.Water.
Options B and C are correct because they import Water by class name.
Since importing by class name takes precedence over wildcards, these compile.
Option D is incorrect because Java doesn't know which of the two wildcard Water classes to use.
Option E is incorrect because you cannot specify the same class name in two imports.

# Given the following my.school.Classroom and my.city.School class definitions, which line numbers in main() generate a compiler error? (Choose all that apply.)
```java
     package my.school; // 1:
     public class Classroom { // 2:
         private int roomNumber; //   3:
        protected static String teacherName; // 4:
        static int globalKey = 54321; //  5:
        public static int floor = 3; //  6:
        Classroom(int r, String t) { //   7:
            roomNumber = r; //  8:
            teacherName = t; } } //  9:

     package my.city; // 1:
     import my.school.*; //  2:
      public class School { //   3:
        public static void main(String[] args) { //  4:
            System.out.println(Classroom.globalKey); //  5:
            Classroom room = new Classroom(101, "Mrs. Anderson"); //  6:
            System.out.println(room.roomNumber); // 7:
            System.out.println(Classroom.floor);  //  8:
            System.out.println(Classroom.teacherName); } } // 9:

```
A. None, the code compiles fine.
B. Line 5
C. Line 6
D. Line 7
E. Line 8
F. Line 9

The two classes are in different packages, which means private access and default (package-private) access will not compile.
This causes compile errors in lines 5, 6, and 7, making options B, C, and D correct answers.
Additionally, protected access will not compile since School does not inherit from Classroom.
This causes the compiler error on line 9, making option F a correct answer as well.
