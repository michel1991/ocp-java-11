public class EqualityReferenceCheckBothType {
    /**
    *  What is the result of the following code?
        A. 0
        B. 1
        C. 2
        D. 3
        E. 4
        F. An exception is thrown.
        G. The code does not compile.

      The question is trying to distract you into paying attention to logical equality versus object reference equality.
      The exam creators are hoping you will miss the fact that line 18 does not compile.
      Java does not allow you to compare String and StringBuilder using ==.

     */
   static void makeEquality(){
       int count = 0; //  12:
       String s1 = "java"; // 13:
       String s2 = "java"; //  14:
       StringBuilder s3 = new StringBuilder("java"); //   15:
       if (s1 == s2) count++; //   16:
       if (s1.equals(s2)) count++; //  17:
       if (s1 == s3) count++; //  18:
       if (s1.equals(s3)) count++; //   19:
       System.out.println(count); //   20:
   }

    public static void main(String... args){

   }
}