package generics.upperAndLowerBound;
import java.io.*;
import java.util.*;
/**
     Given:
        class Booby{
        }
        class Dooby extends Booby{
        }
        class Tooby extends Dooby{
        }
    
        public class TestClass {
            Booby b = new Booby();
            Tooby t = new Tooby();
            public void do1(List<? super Dooby> dataList){
                //1 INSERT CODE HERE
            }
            public void do2(List<? extends Dooby> dataList){
                //2 INSERT CODE HERE
            }    
        }
        and the following four statements:
    
        1.   b = dataList.get(0);
        2.   t = dataList.get(0);
        3.   dataList.add(b);
        4.   dataList.add(t);
    
    What can be inserted in the above code?
    
    A. Statements 1 and 3 can inserted at //1 and Statements 2 and 4 can be inserted at //2.
    B. Statement 4 can inserted at //1 and Statement 1 can be inserted at //2.
    C. Statements 3 and 4 can inserted at //1 and Statements 1 and 2 can be inserted at //2.
    D. Statements 1 and 2 can inserted at //1 and Statements 3 and 4 can be inserted at //2.
    E. Statement 1 can inserted at //1 and Statement 4 can be inserted at //2.
    
    --------------------------
    1. addData1(List<? super Dooby> dataList) :
    This means that dataList is a List whose elements are of a class that is either Dooby or a super class of Dooby.
    We don't know which super class of Dooby. Thus, if you try to add any object to dataList, it has to be a assignable to Dooby.
    Thus, dataList.add(b); will be invalid because b is not assignable to Dooby.
    Further, if you try to take some object out of dataList, that object will be of a class that is either Dooby or a Superclass of Dooby.
    Only way you can declare a variable that can be assigned the object retrieved from dataList is Object obj.
    Thus, t = dataList.get(0); and b = dataList.get(0); are both invalid.
    
    
    2. addData2(List<? extends Dooby> dataList)
    This means that dataList is a List whose elements are of a class that is either Dooby or a subclass of Dooby.
    Since we don't know which subclass of Dooby is the list composed of, there is no way you can add any object to this list.
    
    If you try to take some object out of dataList, that object will be of a class that is either Dooby or a subclass
    of Dooby and thus it can be assigned to a variable of class Dooby or its superclass.. Thus, t = dataList.get(0) ; is invalid.
     correct (B)

 */

    class Booby{
     }
    class Dooby extends Booby{
    }
    class Tooby extends Dooby{
    }
    
     class TestClass { // public
        Booby b = new Booby();
        Tooby t = new Tooby();
        public void do1(List<? super Dooby> dataList){
            //1 INSERT CODE HERE
            dataList.add(t);
        }
        public void do2(List<? extends Dooby> dataList){
            //2 INSERT CODE HERE
            b = dataList.get(0);
        }    
    }

public class InsertToobyInLowerBound {
    public static void main(String... args){
        List<? super Dooby> dataList = new ArrayList<Dooby>();
    }
}