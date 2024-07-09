package security.clone;
import java.util.*;

public class Print4false6false {
    
    /**
       NOTE: Although Class.isArray() and Object.clone()  methods are not officially on the exam,
       you may still see a question or two in the exam that requires you to know about these methods.

        Given the following declaration:
        
          int[][] twoD = { { 1, 2, 3} , { 4, 5, 6, 7}, { 8, 9, 10 } };
        
        What will the following lines of code print?
        
        A. 4true6true
        B. 3true3false
        C. 3false3true
        D. 4false6true
        E. 4true6false
        F. 4false6false
        
        In Java, array numbering starts from 0. So in this case, twoD is an array containing 3 other arrays.
        twoD[0] is { 1, 2, 3} , twoD[1] is { 4, 5, 6, 7}, and twoD[2] is  { 8, 9, 10 }.
        
        Thus, twoD[1].length is 4 and twoD[1][2] is the third element in { 4, 5, 6, 7}, which is 6.
        
        In Java, arrays are just like regular Objects and arrays of different types have different class names.
        For example, the class name of an int[] is [I and the class name for int[][] is [[I.
        
        1. In class Class, there is an instance method named isArray, which returns true if that class represents an array.
        So, for array classes, the isArray() method returns true. For example, twoD.getClass().isArray() will return true.
        
        
        2. The clone method is defined in Object class but it has protected access.
        All array classes override this method and make it public. The clone method returns a shallow clone of an array. For example, if you have,
        Student[] sa1 = new Student[]{
            new Student(), new Student()}; //that assuming a Student class exists,
        you can do:
        Student[] sa2 = sa1.clone();
        sa2 will now point to a new array of Student objects.
        But the elements of this new array will point to the same Student objects that were there in the original array.
        In other words, when you clone an array, the array is cloned but the elements of the array are not cloned.
        
        Thus, sa1 == sa2 will be false, but sa1[0] == sa2[0] will be true.

        Correct(A)

     */
    public static void main(String... args){
        int[][] twoD = { { 1, 2, 3} , { 4, 5, 6, 7}, { 8, 9, 10 } };
        System.out.print(twoD[1].length);
        System.out.print(twoD[2].getClass().isArray());
        System.out.print(twoD[1][2]);
        System.out.print(twoD[0] == twoD.clone()[0]);
        
    }
}