package advancedDesign;
/**
 *  what will the following program print when run without any command line argument?
    A. has params
    B.  has params
       no params
    C. no params
    D. It will not compile.
    
    Remember that the args array is never null. If the program is run without any arguments,
    args points to a String array of length 0. Therefore, hasParams will be true and it will print "has params".
    Since there is no else, the subsequent code block will also be executed and it will print "no params".
    Note that it is not syntactically wrong to have section of code wrapped in { }.
    Correct(B)
 */
public class BlocScopeTestClass { // correct ist TestClass
    public static void main(String[] args)  {

        var hasParams = (args == null ? false : true);
        if(hasParams){
            System.out.println("has params");
        }{
            System.out.println("no params");
        }
    }
}