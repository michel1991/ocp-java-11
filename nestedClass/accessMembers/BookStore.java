package nestedClass.accessMembers;

/**
   Consider the following code in which searchBook() method has an inner class.
    A. taxId
    B. name
    C. criteria
        Even though this variable is local to the method,
        it is accessible in the inner class defined inside the method because it is declared as final.
    D. count
        Although count is a local variable but its value does not change anywhere in the code.
        Hence, it is effectively final and is therefore accessible from the inner class.
    E. k
    F. sum
        sum is a local variable and its value changes in the code (due to sum++).
        Hence, it is NOT effectively final and is therefore NOT accessible from the inner class.
        
  ------------------------------------------------------
      If the inner class is non static, all the static and non-static members of the outer class are accessible
      (otherwise only static are accessible) So option 1, 2 are valid.
    Prior to java 8, only final local variables were accessible to the inner class but in Java 8,
    even effectively final local variables of the method are accessible to the inner defined in that method as well. So option 4 is correct.
    
    Correct(A, B, C, D, E)

 */
public class BookStore {
    private static final int taxId = 300000;
    private String name;
    public String searchBook( final String criteria )
    {
        int count = 0;
        int sum = 0;
        sum++;
        class Enumerator
            {
                String iterate( int k)
                {
                    //line 1
                    System.out.println("taxid= "+ taxId +" name="+ name + "criteria="+ criteria);
                    return "";
                }
                // lots of code.....
            }
        // lots of code.....
        return "";
    }
}