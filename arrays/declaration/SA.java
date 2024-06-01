package arrays.declaration;
public class SA {
    /**
      Which of the following statements will correctly create and initialize an array of Strings to non null elements?
      A.
        String[] sA = new String[1] { "aaa"};
            Array size cannot be given here as the array is being initialized in the declaration
            
      B. String[] sA = new String[] { "aaa"};

      C. var[] sA = new String[1] ; sA[0] = "aaa";
            You can never apply square brackets to var.
            var[] implies that the type of the element of the array is var, which is not allowed.
            
      D. String[] sA = {new String( "aaa")};

      E. String[] sA = { "aaa"};

      F. String[] sA = new String[1] ; sA[0] = "aaa";

      Correct(B, D, E, F)
      
     */
    public static void main(String... args){
        String[] sA = new String[] { "aaa"};
        String[] sAResponseD = {new String( "aaa")};
        String[] sAResponseE = { "aaa"};
        String[] sAResponseF = new String[1] ; sA[0] = "aaa";


    }
}