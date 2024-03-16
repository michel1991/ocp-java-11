package operations.switchs;

/**
 * What can be the return type of method getSwitch so that this program compiles and runs without any problems?
    A. int
    B.  float
    C. long
    D. double
    E. char
    F. byte
    G. short
    
   If you just consider the method getSwitch, any of int long float or double will do.
   But the return value is used in the switch statement later on.
   A switch condition cannot accept float, long, double, or boolean. So only int is valid.

  The return type cannot be byte, short, or char because the expression x - 20/x + x*x; returns an int.

   You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/V3aUD0KpYKQ
   (Correct A)

 */
 class TestClass{ // correct public
    public static int getSwitch(int x){ // correct XXX
        return x - 20/x + x*x;
    }
    public static void main(String args[]){
        switch( getSwitch(10) ){
            case 1 :
                case 2 :
                    case 3 :
                        default : break;
        }
    }
}

public class SwitchCallMethod {
    
}