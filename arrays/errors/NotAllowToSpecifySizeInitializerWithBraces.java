package arrays.errors;
public class NotAllowToSpecifySizeInitializerWithBraces {
    /**
     * How many of the following are legal declarations?
        A. None
        B. One
        C. Two
        D. Three
        E. Four
        
        The array brackets, [], are not allowed to appear before the type,
         making the lions declaration incorrect.
         When using an array initializer with braces, {},
         you are not allowed to specify the size separately.
         The size is inferred from the number of elements listed.
          Therefore, tigers and ohMy are incorrect.
          When you’re not using an array initializer,
          the size is required. An empty array initializer is allowed.
          Option B is correct because only bears is legal.
     */
  public static void main(String... args){
      []String lions = new String[];
      String[] tigers = new String[1] {"tiger"};
      String bears[] = new String[] {};
      String ohMy [] = new String[0] {};
      
  }
}