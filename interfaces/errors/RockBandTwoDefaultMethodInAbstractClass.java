package interfaces.errors;

/**
 * What is the output of the following application?
    A. X
    B. Y
    C. The application completes without printing anything.
    D. ElectricBass is the first class to not compile.
    E. RockBand is the first class to not compile.
    F. None of the above.

  The application does not compile, so options A, B, and C are incorrect.
  The ElectricBass class does not compile,
  since it inherits two default methods with the same signature.
  Even though the class is marked abstract, it still must override this default method.
  Since ElectricBass fails to do so, option D is correct.
  If the ElectricBass class did correctly override the getVolume() method,
  then the rest of the code would compile without issue.
  In this case, there would be nothing printed at runtime.
  The main() method just declares a local inner class but does not actually use it.

 */
interface DoubleBass {
    void strum();
    default int getVolume() {return 5;}
}
interface BassGuitar {
    void strum();
    default int getVolume() {return 10;}
}
abstract class ElectricBass implements DoubleBass, BassGuitar {
    @Override public void strum() {System.out.print("X");}
}

class RockBand {
    public static void main(String[] strings) {
        final class MyElectricBass extends ElectricBass {
            public int getVolume() {return 30;}
            public void strum() {System.out.print("Y");}
        }
    } }

public class RockBandTwoDefaultMethodInAbstractClass {

}