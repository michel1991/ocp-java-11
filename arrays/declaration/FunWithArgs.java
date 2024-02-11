package arrays.declaration;

/**
 * Given:
  The above program is compiled with the command line:
    javac FunWithArgs.java
    and then run with:
    java FunWithArgs a b c
    
    What will be the output?
    
    A. It will not compile.
    B. It will throw ArrayIndexOutOfBoundsException at run time.
    C. It will print b
    D. It will print null
    
    Correct(C)
    
    There is no problem with the code. The main method is just overloaded.
  When it is run, the main method with String[] will be called.
  This method then calls the main with String[][] with an argument { {"a", "b", "c"} }
   Thus, args[0][1] refers to "b", which is what is printed.

 */
public class FunWithArgs {
    public static void main(String[][] args) {
        System.out.println(args[0][1]);
    }
    public static void main(String[] args) {
        var fwa = new FunWithArgs();
        String[][] newargs = {args};
        fwa.main(newargs);
    }
}