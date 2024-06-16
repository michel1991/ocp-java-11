package operations.nestedStatement;
/**
   Consider the following method...
   
   Which of the following statements are correct ?
   
    A. If run with an argument of 'false', it will print 'False False'
    B. If run with an argument of 'false', it will print 'True True'
    C. If run with an argument of 'true', it will print 'True False'
    D. It will never print 'True True'
    E. It will not compile.
    
    ------
    Look at it like this:
      if (flag)      //1
       {
           if (flag)       // 2
           {
                if (flag)        //3
                {
                      System.out.println("False True");
                }
                else            //4
                {
                      System.out.println("True False");
                }
           }
           else           //5
           {
                 System.out.println("True True");
           }
       }
      else           //6
      {
            System.out.println("False False");
       }
    Note that if and else do not cascade. They are like opening an closing braces.
    So, else at //4 is associated with if at //3 and else at //5 is associated with if at //2
     Correct(A, D)

 */
public class IfTest {
    public static void ifTest(boolean flag){
        if (flag)   //1
        if (flag)   //2
        if (flag)   //3
        System.out.println("False True");
        else        //4
        System.out.println("True False");
        else        //5
        System.out.println("True True");
        else        //6
        System.out.println("False False");
     }
     
}