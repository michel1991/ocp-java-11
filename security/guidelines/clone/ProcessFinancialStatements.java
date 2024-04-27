
package security.guidelines.clone;
import java.util.*;

/**
  Your finance library contains the following two public classes:
   Which safety guideline does the above code violate?
   
    A. validation of bsd must be done after cloning.
        It is possible an object to change after input validation. Thus, it should be cloned first and then validation should be performed.
        
        Guideline 5-1 / INPUT-1: Validate inputs
        Input from untrusted sources must be validated before use. Maliciously crafted inputs may cause problems,
        whether coming through method arguments or external streams.
        Examples include overflow of integer values and directory traversal attacks by including "../" sequences in filenames.
        Ease-of-use features should be separated from programmatic interfaces.
        Note that input validation must occur after any defensive copying of that input (see Guideline 6-2).
    
    B. validate method should be public.
       Whether a method should be public or not depends on the business requirement of the class. There is no fixed rule about it.
    
    C. BalanceSheetData class should not implement Cloneable.
        Since the BalanceSheetData class is final, it is ok for this class to implement Cloneable.
        
    D. This code does not violate any safety guideline.
    
    Correct(A)
 */
 final class BalanceSheetData implements Cloneable{ // public
    private String xmlDoc;
    public String getDoc(){
        return xmlDoc;
    }
    
    //other methods not shown    
}

 class ProcessFinancialStatements{ // public
    private boolean validate(BalanceSheetData bsd){
        //check validity and return true false accordingly
    }
    //doSomething add by me
    void doSomething(Object bsd){
        
    }
    public void process(BalanceSheetData bsd){
        if(validate(bsd)) {
            doSomething(bsd.clone());
        }
    }
}

public class ProcessFinancialStatements {
    
}