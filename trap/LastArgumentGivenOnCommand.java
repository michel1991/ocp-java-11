package trap;
/**
   Which code fragments will print the last argument given on the command line to the standard output,
   and exit without any output or exception stack trace if no arguments are given?
    1.
        public static void main(String args[ ]){
                                if (args.length != 0)   System.out.println(args[args.length-1]);
        }
        
    2.
       public static void main(String args[ ]){
               try {      System.out.println(args[args.length-1]);        }
            catch (ArrayIndexOutOfBoundsException e) {    }
        }
        
    3.
        public static void main(String args[ ]){
             int i = args.length;
            if (i != 0) System.out.println(args[i-1]);
        }
        
    4.
      public static void main(String args[ ]){
            int i = args.length-1;
        if (i > 0) System.out.println(args[i]);
        }
    5.
       public static void main(String args[ ]){
               try { System.out.println(args[args.length-1]); }
            catch (NullPointerException e) {}
        }
        
       A. 1
       B.  2
       C.  3
       D.  4
         if there is only one argument, i will be 1-1 = 0. And the if condition will fail.
       E.  5

    ------------------------
      If no argument is given, a String array of length Zero is received in the main method.
       So, there is no NullPointerException on accessing args even if no argument is given.
        Indexing in java starts from zero. So the last element will be at args.length-1.
    Correct(A, B, C)
 */
public class LastArgumentGivenOnCommand {
    public static void main(String args[ ]){
        if (args.length != 0)   System.out.println(args[args.length-1]);
    }
}