package garbage.complex;
/**
 Given:

    class Buddy {
        public Buddy(){ }
    }
    public class GCTest
        public static void initBuddies(Buddy[] ba){
            ba[0] = new Buddy();  //1
            ba[1] = new Buddy(); //2
            ba[0] = ba[1]; //3
            ba[1] = ba[2]; //4
        }        
    
        public static void main(String[] args) {
            Buddy[] ba = new Buddy[3]; //5
            initBuddies(ba); //6
    
            //7
    
        }
    }
    
    How many Buddy objects will be eligible for garbage collection at line marked //7?
    
    A. 1
    B. 2
    C. 3
    Only two Buddy objects are being created in the given code. Therefore, the answer cannot be more than 2 and you can eliminate such options.
    D. 4
    E. 5
    F. 0
    
    -----------
    1. new Buddy[3] creates an empty array of length 3. No Buddy object is created here and each element of the array points to null.
    2. One Buddy object is created at each of the lines //1 and //2.
    3. At //3, ba[0] is made to point to the same object as the one pointed to by ba[1].
Therefore, no one is now pointing to the original Buddy object pointed to by ba[0]. It is therefore eligible for GC now.
However, there are two references to the second Buddy object (i.e. ba[0] as well as ba[1] are now pointing to the same Buddy object).
    4. At //4, ba[1] is set to ba[2] but ba[2] is null. Therefore, ba[1] is also null after this line.
    
    Therefore, at the end of the initBuddies method, only one Buddy object is eligible for GC.
    correct(A)
    
 */

class Buddy {
    public Buddy(){ }
}

public class GCTest {
    public static void initBuddies(Buddy[] ba){
            ba[0] = new Buddy();  //1
            ba[1] = new Buddy(); //2
            ba[0] = ba[1]; //3
            ba[1] = ba[2]; //4
    }        
    
    public static void main(String[] args) {
        Buddy[] ba = new Buddy[3]; //5
        initBuddies(ba); //6

        //7

    }
}