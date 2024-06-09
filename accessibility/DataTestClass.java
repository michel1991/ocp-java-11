package accessibility;
/**
   What will the following code print when compiled and run:
   
    A. d2 val =
    B. d2 val = default
    C. d2 val = D1
    D. Exception at run time.
    
    -----
    This is quite straight forward question.
    You are creating only one Data object. You are setting its strVal field to "D1".
    Next, you declare another Data variable d2 and assign to it the same Data object.

    Thus, when you access strVal using d2, you will get D1.
    
    The "throws Exception" part is not required and is there just to confuse you.
    
    Correct(C)

 */
class Data {

    int intVal = 0;
    String strVal = "default";
    public Data(int k){
        this.intVal = k; 
    }

}

 class TestClass { // public
    public static void main(String[] args) throws Exception {
        Data d1 = new Data(10);
        d1.strVal = "D1";
        Data d2 = d1;
        d2.intVal = 20;
        System.out.println("d2 val = "+d2.strVal);
    }
}

class DataTestClass{
    public static void main(String[] args) throws Exception {
        TestClass.main(args);
    }
}