package arrays.tricky;

public class DAAA {
    /**
      Given:

        double daaa[][][] = new double[3][][];
        var d = 100.0;
        double[][] daa = new double[1][1];
        
        Which of the following statements can be added to the above code, independent of each other,
        without causing compilation or runtime errors?
        
        A.
          daaa[0] = d;
          -----
            daaa[0] should be a 2 dimensional array because daaa is a 3 dimensional array.

        B.
          daaa[0] = daa;

        C.
           daaa[0] = daa[0];
           ---------
                daaa[0] should be a 2 dimensional array while daa[0] is a one dimensional array.
                
        D.
            daa[1][1] = d;
            --------
                daa[1][1] will cause an ArrayIndexOutOfBoundsException because daa's length is only
                1 and the indexing starts from 0. To access the first element, you should use daa[0][0].
                
        E. daa = daaa[0];
        
        F. double[] newd = daa[0].clone();
          -----
           Since daa points to a two dimensional array of doubles, daa[0] will point
           to a one dimentional array of doubles. Therefore, the result of daa[0].clone()
           can be assigned to newd, which is also a one dimentional array of doubles.

       --------------------------------------------
       Actually, the clone method is defined in Object class but it has protected access.
       All array classes override this method and make it public. The clone method returns a shallow clone of an array. For example, if you have,
        Student[] sa1 = new Student[]{
            new Student(), new Student()}; //assuming that a Student class exists,
        you can do:
        Student[] sa2 = sa1.clone();
        sa2 will now point to a new array of Student objects. But the elements
        of this new array will point to the same Student objects that were there in the original array.
        In other words, when you clone an array, the array is cloned but the elements of the array are not cloned.
        
        Thus, sa1 == sa2 will be false, but sa1[0] == sa2[0] will be true.
        Correct(B,E, F)
        
     */
    public static void main(String[] args) {
        double daaa[][][] = new double[3][][];
        var d = 100.0;
        double[][] daa = new double[1][1];
        daaa[0] = daa; // response B
        daa = daaa[0]; // response E
        double[] newd = daa[0].clone(); // response F


    }
}