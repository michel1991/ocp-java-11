package operations.switchs;

/**
 Consider the following program:

    public class TestClass{
        public static void main(String[] args)  {     calculate(2);    }
        public static void calculate(int x){
            String val;
            switch(x){
                case 2:
                default:
                val = "def";
            }
            System.out.println(val);
        }
    }
    
    What will happen if you try to compile and run the program?
    * 
    A. It will not compile saying that variable val may not have been initialized..
    B. It will compile and print def
    C. As such it will not compile but it will compile if calculate(2); is replaced by calculate(3);
    D. It will compile for any int values in calculate(...);
    
    -------------------
    When you try to access a local variable, the compiler makes sure that it is initialized in all the cases.
    If it finds that there is a case in which it may not be initialized then it flags an error. For example:

        int i;
        if( somecondition) i = 20;
        int k = i;
        
        Here, if some condition returns false, then i remains uninitialized hence the compiler flags an error.
        In the given question:
        As there is no break after case 2, val will always be initialized in the switch block. So it will compile and run fine.
        Note that it will not compile if break is placed after case 2 because the compiler
        will figure out that in certain cases val may be left uninitialized.
        
    Correct(B, D)

 */

class TestClass{ // public 
    public static void main(String[] args)  {     calculate(2);    }
    public static void calculate(int x){
        String val;
        switch(x){
            case 2:
            default:
            val = "def";
        }
        System.out.println(val);
    }
}

public class PrintDef {
    public static void main(String... args){
        TestClass.main(args);
    }
}