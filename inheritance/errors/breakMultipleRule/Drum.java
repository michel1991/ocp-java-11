package inheritance.errors.breakMultipleRule;

/**
 * How many lines of the following application contain compilation errors?
    A. The code compiles and runs without issue.
    B. One.
    C. Two.
    D. Three.
    E. Four.
    F. None of the above.
    
    The code definitely does not compile. The first problem with
    this code is that the Drum class is missing a constructor causing
    the class declaration on line 8 to fail to compile.
    The default no-argument constructor cannot be inserted if the superclass,
    Instrument, defines only constructors that take arguments.
    The second problem with the code is that line 11 does not compile,
    since it calls super.play(5), but the version of play() in
    the parent class does not take any arguments. Finally, line 15 does not compile.
    While mn may be a reference variable that points to a Drum() object, the concert()
    method cannot be called unless it is explicitly cast back to a Drum reference.
     For these three reasons, the code does not compile, and option D is the correct answer.

 */

//1:  package percussion;
//2: 
interface MakesNoise {} // 3: 
 abstract class Instrument implements MakesNoise { // 4: 
    public Instrument(int beats) {} //    5:  
    public void play() {} //  6: 
} //   7:
 public class Drum extends Instrument { // 8: 
    public void play(int count) {} //   9:  
    public void concert() { //   10: 
        super.play(5); //   11: 
    } //   12: 
    public static void main(String[] beats) { //   13: 
        MakesNoise mn = new Drum(); //      14:   
        mn.concert(); //  15: 
    } //  16:
} //     17: 
