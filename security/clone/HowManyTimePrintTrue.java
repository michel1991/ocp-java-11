package security.clone;
import java.util.*;


/**
 Given:
    int[][] orig = { { 1, 2, 3} , { 4, 5, 6, 7}};
    int[][] dup = orig.clone();
    int[] copy = dup[0].clone();
    
    System.out.println(orig == dup);
    System.out.println(orig.equals(dup));
    System.out.println(orig[0] == dup[0]);
    System.out.println(dup[0] == copy);
    System.out.println(dup[0].equals(copy));
    
    How many times will true be printed?
    
    A. 0
    B. 1
        1. orig == dup will be false because dup is a clone of orig and therefore, they will point to two different array objects.
        Their elements, however, will point to the same objects.
        
        2. orig.equals(dup) will be false because equals method of all array classes simply check
        whether the two references point to the same object or not.
        In other words, equals method of array classes returns the same result as ==.
        
        3.orig[0] == dup[0] will be true because, as explained above, a clone creates a shallow copy, which means,
        elements of orig and dup point to the same objects.
        
        4. dup[0] == copy and dup[0].equals(copy) will be false because of the same reason as described above.
        
    C. 2
    D. 3
    E. 4
    F. 5
    
   ---------------
     The clone method is defined in Object class but it has protected access. All array classes override this method and make it public.
    
    The clone method returns a shallow clone of an array. For example, if you have,
    Student[] sa1 = new Student[]{
        new Student(), new Student() }; //assuming tht a Student class exists,
    you can do:
    Student[] sa2 = sa1.clone();
    sa2 will now point to a new array of Student objects. B
    ut the elements of this new array will point to the same Student objects that were there in the original array.
    In other words, when you clone an array, the array is cloned but the elements of the array are not cloned.
    
    Thus, sa1 == sa2 will be false, but sa1[0] == sa2[0] will be true.
    Correct(B)
 */
public class HowManyTimePrintTrue {
     public static void main(String... args){
         int[][] orig = { { 1, 2, 3} , { 4, 5, 6, 7}};
        int[][] dup = orig.clone();
        int[] copy = dup[0].clone();
        
        System.out.println(orig == dup);
        System.out.println(orig.equals(dup));
        System.out.println(orig[0] == dup[0]);
        System.out.println(dup[0] == copy);
        System.out.println(dup[0].equals(copy));
     }
}