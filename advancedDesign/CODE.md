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
