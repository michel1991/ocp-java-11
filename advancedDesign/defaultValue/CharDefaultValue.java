package advancedDesign.defaultValue;
/**
   What will be the output when the following program is run?
   
   A. Compile time error.
        c is an instance variable of numeric type so it will be given a default value of 0, which prints as empty space.
   B. ,m
         Without the cast to int, c would be printed as empty space and cA[1] is 'm'
   C.  0,m
        Because of the explicit cast to int in the println() call, c will be printed as 0.
        
   D. b,b
   E. b,m
   
   ------
   Note that Arrays are Objects (i.e. cA instanceof Object is true) so are effectively passed by reference.
   So in m1() the change in cA[1] done by m2() is reflected everywhere the array is used.
    c is a primitive type and is passed by value.
    In method m2() the passed parameter c is different from the instance variable 'c' because local variables (and method parameters)
    shadow instance variables with same name. So instance member 'c' keeps its default (i.e. 0) value.
    
   Correct(C)

 */
class TestClass{ // public 
    char c;
    public void m1(){
        char[ ] cA = { 'a' , 'b'};
        m2(c, cA);
        System.out.println( ( (int)c)  + "," + cA[1] );
    }
    public void m2(char c, char[ ] cA){
        c = 'b';
        cA[1] = cA[0] = 'm';
    }
    public static void main(String args[]){
        new TestClass().m1();
    }
}

public class CharDefaultValue {
    public static void main(String args[]){
        TestClass.main(args);
    }
}