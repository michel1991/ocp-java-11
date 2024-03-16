
package annotations.safeVarargs;
// import java.lang.annotation.*;

/**
 *  Which method declarations can @SafeVarargs be correctly applied to? (Choose two.)
  A. protected void hum(double... tune)
  B. final int whistle(int length, float... measure)
  C. static void sing()
  D. rivate void listen(String... mp3)
  E. void dance(List˂Integer˃... beat)
  F. private static int play(int[] notes)

 The @SafeVarargs annotation requires the method
 to which it is applied contain a varargs parameter and be unable to be overridden,
 aka marked static, final, or private. Options B and D fulfill this requirement.
 Options A and E are missing a modifier that prevents them from being overridden.
 Options C and F are missing a vararg parameter.
 While a primitive arrayint[] can be passed to a method containing a varargs parameter,
 to apply the @SafeVarargs annotation, the method must be declared with a varargs annotation.
 */
public class MethodHoldSafeVarargs {
    //Answer B
     @SafeVarargs
    final int whistle(int length, float... measure){
        return  Integer.valueOf(2);
    }
    //Answer D
     @SafeVarargs
    private void listen(String... mp3){
        
    }

}