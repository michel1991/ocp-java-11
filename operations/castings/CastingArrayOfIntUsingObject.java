package operations.castings;

public class CastingArrayOfIntUsingObject {
    /**
       Which exception will the following throw?
        A. ArrayIndexOutOfBoundsException
        B. ClassCastException
        C. IllegalArgumentException
        D. NumberFormatException
        E. None of the above

        The cast is fine because both types are the same. The last line refers to an invalid index of the array.
        Remember that array indexes begin with zero.
     */
    static void castingArrayOfIntUsingObject(){
        int[] nums = new int[] { 1, 4, 6};
        Object p = nums;
        int[] two = (int[]) p;
        System.out.println(two[two.length]);
    }
    
    public static void main(String... args){
        castingArrayOfIntUsingObject();
    }
}