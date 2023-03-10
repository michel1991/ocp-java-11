package inheritance.hide;

/**
 * Given the following classes, what is the output of the Watch program?
   A. smart watch,smart watch
    B. smart watch,watch
    C. watch,smart watch
    D. watch,watch
    E. The code does not compile.
    F. None of the above.

    Line 15 calls the method on line 9 since it is a Watch object, printing watch.
    Line 16 is a SmartWatch object.
    However, the getName() method is not overridden in SmartWatch,
    since the method signature is different.
    Therefore, the method on line 9 gets called again.
    That method calls getType().
    Since this is a private method, it is not overridden,
    and watch is printed again, making option D the correct answer.
 */
class SmartWatch extends Watch { // 1:
    private String getType() { return "smart watch"; } //  2:
    public String getName() { // 3:
        return getType() + ","; //  4:
    } //  5:
} //  6:
 public class Watch { // 7:
    private String getType() { return "watch"; } //  8:
    public String getName(String suffix) { // 9:
        return getType() + suffix; //   10:
    } //  11:
    public static void main(String[] args) { //    12:
        Watch watch = new Watch(); //  13:
        Watch smartWatch = new SmartWatch(); //   14:
        System.out.print(watch.getName(",")); //  15:
        System.out.print(smartWatch.getName("")); //  16:
    } //  17:
} //  18:
