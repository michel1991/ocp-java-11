package generics.tricky.errors;

/**
 *  Identify correct statements about the following code:
   A.  Compilation failure due to //1.
   B.  Compilation failure due to //2.
   C.  Compilation failure due to //3.
   D.  Compilation failure due to //4.
   E. It will compile without any error.
   
   --------------------------------------------
   The cause of confusion in the given code is the presence of <T> in the class declaration as well as in the method declaration.
   You need to know that the two generic type variables are independent of each other.
   This means that the <T> in public class Counter<T> has no relation to the <T> in public  <T> int count(T[] ta, T t).

    Since the two types are different, you cannot do this.t = t; inside the method.
    
    Ideally, one should use different names for different types to avoid confusion. For example:
    
    class Counter<T>{
        T t;
        public  <P extends T> int count(P[] ta, P t){
            this.t = t; //this is valid because P extends T, so a P is-a T
            int count = 0;
            for(P x : ta){
                count =  x == t ? count+1: count;
            }
            return count;
        }
    }
    
    
    If you want to use the same type that is used for the class, then you should not redeclare it for the method. For example:
    
    class Counter<T>{ //<--- <T> is declared here
        T t;
        public int count(T[] ta, T t){  //<--- there is no <T> declaration on this line
            this.t = t; //this is valid now because t and this.t are of same type
            int count = 0;
            for(T x : ta){
                count =  x == t ? count+1: count;
            }
            return count;
        }
    }

   Correct(C)

 */
public class Counter<T>{  //1
    T t;
    public  <T> int count(T[] ta, T t){  //2
        this.t = t;  //3
        int count = 0;
        for(T x : ta){
            count =  x == t ? count+1: count;//4
        }
        return count;
    }
}