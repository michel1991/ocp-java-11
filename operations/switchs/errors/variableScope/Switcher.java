package operations.switchs.errors.variableScope;
/**
  Given:
  
  What will the above  program print if compiled and run using the following command line:
    java Switcher 1 2 3
    
    A. It will print 1
    B. It will print 2
    C. It will print 3
    D. It will not print anything.
    
    E. It will not compile because of //1.
       ---
        There is no problem here because Integer.parseInt() returns an int.
        
    F. It will not compile because of //2.
        ----
        var declarations can be used inside a method.
        
    G. It will not compile because of //3.
        ----
         There is no problem here. b is in scope for the rest of the switch block.
      
    H. It will not compile because of //4.
        ---
       It will not compile because of if(b) because b is declared in the switch block and it is out of scope after the switch block ends.
       Pay close attention to question text. It may seem to test you on one concept but actually it could be testing something entirely different.

    Correct(H)
 */
public class Switcher {
    public static void main(String[] args){
        switch(Integer.parseInt(args[1]))  //1
        {
           case 0 :
            var b = false; //2
              break;
      
           case 1 :
              b = true; // 3
              break;
        }
        
        if(b) System.out.println(args[2]); //4
    }
}