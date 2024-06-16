package accessibility;

/**
  Consider the following code appearing in the same file:
  
  
    class Data {
        int x = 0, y = 0;
        public Data(int x, int y){
            this.x = x; this.y = y;
        }
    }
    public class TestClass {
        public static void main(String[] args) throws Exception {
            Data d = new Data(1, 1);
            //add code here
        }
    }
  Which of the following options when applied individually will change the Data object currently
  referred to by the variable d to contain 2, 2 as values for its data fields?
  
  A.
    Add the following two statements:
    d.x = 2;
    d.y = 2;

  B.
    Add the following statement:
    d = new Data(2, 2);
    ---
    This will create a new Data object and will not change the original Data object referred to be d.

  C.
     Add the following two statements:
    d.x += 1;
    d.y += 1;

  D.
     Add the following statement:
        d = d + 1;
  
  ------
    Correct(A, C)
 */
class Data {
    int x = 0, y = 0;
    public Data(int x, int y){
        this.x = x; this.y = y;
    }
    
    public String toString(){
        return "x = "+x + " y=" + y;
    }
}
public class SetMemberPropertiesXYOfDataTestClass {
    public static void main(String[] args) throws Exception {
        Data d = new Data(1, 1);
        //add code here
        d.x += 1;
        d.y += 1;
        System.out.println(d);
    }
}