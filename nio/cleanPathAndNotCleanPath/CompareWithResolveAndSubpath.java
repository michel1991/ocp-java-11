package nio.cleanPathAndNotCleanPath;
import java.nio.file.*;

public class CompareWithResolveAndSubpath {
  
    /**
     * What is the output of the following code snippet?
        A. Same!
        B. Different!
        C. The code does not compile.
        D. The class compiles but throws an exception at runtime.
        E. None of the above.

        The program compiles and runs without issue, making options C and D incorrect.
        The first variable, halleysComet, is created with subpath(1,5) and normalize()
        being applied right away, leading to halleysComet being assigned a value of m1.meteor.
        The second variable, lexellsComet is assigned a value on line 14,
        but lines 15–16 do not include an assignment operation.
        Since Path instances are immutable, the changes are lost.
        For this reason, the two objects are not equivalent on lines 18–19, and option B is correct.
        If lexellsComet was assigned the value created on line 15–16, though,
        then the path value of lexellsComet would be m1.meteor and option A would be correct.

     */
    static void printDifferent(){
        var halleysComet = Path.of("stars/./rocks/../m1.meteor") //  11: 
          .subpath(1, 5).normalize(); //  12: 
        // 13:
        var lexellsComet = Paths.get("./stars/../solar/"); //   14:
        lexellsComet.subpath(1, 3) //  15:
           .resolve("m1.meteor").normalize(); // 16: 
       // 17:
        System.out.print(halleysComet.equals(lexellsComet) ?  //  18:
       "Same!" : "Different!"); // 19:  
    }
    
    public static void main(String... args){
        printDifferent();
    }
}