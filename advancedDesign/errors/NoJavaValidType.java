package advancedDesign.errors;

public class NoJavaValidType {
    /**
     * How many of the following lines compile?
        A. None
        B. One
        C. Two
        D. Three
        E. Four
        F. Five
        
        First, bool and Bool are not valid Java types.
        They should be boolean and Boolean, respectively.
        Next, objects are allowed to have a null reference while primitives cannot.
        Since Integer and String are objects, those lines compile.
        Finally, the line with int is a primitive,
        so assigning null to it does not compile. Therefore, option C is correct.
     */
  static firstExample(){
      bool b = null;
      Bool bl = null;
      int i = null;
      Integer in = null;
      String s = null;
      
  }
}