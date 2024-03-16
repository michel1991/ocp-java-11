package operations.loops.whiles.infinite;

/**
 * What will the following code print?
    A. It will not compile.
    B. It will throw an exception at runtime.
    C. It will print 0.
    D. It will print 5.
    E. None of these.
     This program will compile and run but will never terminate.
     
    Note that looper() declares an automatic variable x, which shadows the instance variable x. So, when x = m; is executed,
    it is the local variable x that is changed not the instance field x. Therefore, getX() never returns 0.
    If you remove var x = 0; from looper(), it will print 0 and end.

    You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/4MdnpU-Bztw
    (Correct E)
 */
class TestClass{ // correct public 
    int x = 5;
    int getX(){ return x; }

    public static void main(String args[]) throws Exception{
        TestClass tc = new TestClass();
        tc.looper();
        System.out.println(tc.x);
    }

    public void looper(){
        var x = 0;
        while( (x = getX()) != 0 ){
            for(int m = 10; m>=0; m--){
                x = m;
            }
        }

    }     
}

public class Looper {
    
}