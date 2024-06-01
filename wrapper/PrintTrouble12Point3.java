package wrapper;
/**
    What will the following code snippet print:
    
    A. 12
    B. 13
    C. trouble : null
    D. trouble : 12.3
    E. trouble : 0.0
    
    -------------------------------
    f = Float.valueOf("12.3"); executes without any problem.
    int i = Integer.parseInt(s); throws a NumberFormatException because 12.3 is not an integer.
    Thus, the catch block prints trouble : 12.3
     
     Correct(D)

 */
public class PrintTrouble12Point3 {
    public static void main(String... args){
        Float f = null;
        try{
            f = Float.valueOf("12.3");
            String s = f.toString();
            int i = Integer.parseInt(s);
            System.out.println(""+i);
        }
        catch(Exception e){
            System.out.println("trouble : "+f);
        }
    }
}