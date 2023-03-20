package classInitialization.errors;

/**
 *  How many lines of the following class contain a compiler error?
    A. None
    B. One
    C. Two
    D. Three
    E. More than three

    The gold variable is marked final, which means it must be set either
    when it is declared or in a static initializer, as shown on line 17.
    It cannot be modified by a method, though, so line 15 does not compile.
    Since this is the only line that does not compile, option B is correct.
    Line 8 compiles because the static method is modifying the local variable scaly,
    not the instance variable of the same name. Line 12 also compiles.
    While accessing a static variable via an instance is not recommended, it is allowed.
 */
 class Dragon { // 1:
     boolean scaly; //  2:
    static final int gold; //  3:
    Dragon protectTreasure(int value, boolean scaly) { //   4:
        scaly = true; //  5:
        return this; //  6:
    } // 7:
    static void fly(boolean scaly) { //    8:
        scaly = true; //  9:
    } // 10:
    int saveTheTreasure(boolean scaly) { //   11:
        return this.gold; //  12:
    } //   13:
    static void saveTheDay(boolean scaly) { //  14:
        this.gold = 0; //  15:
    } //  16:
    static { gold = 100; } //  17:
 } // 18:


public class DragonFinalVariable {

}