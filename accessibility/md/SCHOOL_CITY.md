### Given the following my.school.Classroom and my.city.School class definitions,
### which line numbers in main() generate a compiler error? (Choose all that apply.)
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
* A. None, the code compiles fine.
* B. Line 5
* C. Line 6
* D. Line 7
* E. Line 8
* F. Line 9

The two classes are in different packages,
which means private access and default (package-private) access will not compile.
This causes compile errors in lines 5, 6, and 7,
making options B, C, and D correct answers.
Additionally, protected access will
not compile since School does not inherit from Classroom.
This causes the compiler error on line 9,
making option F a correct answer as well.