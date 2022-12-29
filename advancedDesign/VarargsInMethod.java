package advancedDesign;
public class VarargsInMethod {

    /**
     * Which of the following methods compile? (Choose all that apply.)

        A. public void moreA(int... nums) {}
        B. public void moreB(String values, int... nums) {}
        C. public void moreC(int... nums, String values) {}
        D. public void moreD(String... values, int... nums) {}
        E. public void moreE(String[] values, ...int nums) {}
        F. public void moreG(String[] values, int[] nums) {}

        Options A and B are correct because the single varargs parameter is the last parameter declared.
        Option F is correct because it doesn’t use any varargs parameters.
        Option C is incorrect because the varargs parameter is not last.
        Option D is incorrect because two varargs parameters are not allowed in the same method.
        Option E is incorrect because the ... for a varargs must be after the type, not before it.

     */
    public void moreA(int... nums) {

    }

    public void moreB(String values, int... nums) {

    }

    public void moreG(String[] values, int[] nums) {

    }

}