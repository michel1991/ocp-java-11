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

# Which of the following can fill in the blank in this code to make it compile? (Choose all that apply.)
```java
public class Ant {
    _____ void method() {}
    }
```
A. default
B. final
C. private
D. Public
E. String
F. zzz:

The keyword void is a return type.
Only the access modifier or optional specifiers are allowed before the return type.
Option C is correct, creating a method with private access.
Option B is also correct, creating a method with default access and the optional specifier final.
Since default access does not require a modifier, we get to jump right to final.
Option A is incorrect because default access omits the access modifier rather than specifying default.
Option D is incorrect because Java is case sensitive.
It would have been correct if public were the choice.
Option E is incorrect because the method already has a void return type.
Option F is incorrect because labels are not allowed for methods.

# Which is true of the following code? (Choose all that apply.)
```java
    package abc; // 1:
    import java.math.*; // 2:
    public class W { // 3:
        public void method() { } //  4:
        int a; //  5:
     } // 6:
```
A. The code will not compile if line 1 is removed.
B. The code will not compile if line 2 is removed.
C. The code will not compile if line 3 is removed.
D. The code will not compile if line 4 is removed.
E. The code will not compile if line 5 is removed.
F. The code does not compile as currently written.

The code compiles as is, making option F incorrect. The package statement is optional in a class, making option A incorrect.
Since the import is unused, option B is also incorrect.
A class will compile without any fields or methods, making options D and E incorrect.
The only thing required is the actual class declaration on line 3. Therefore, option C is the answer.
