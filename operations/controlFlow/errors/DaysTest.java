package operations.controlFlow.errors;

/**
   What will the following code print when compiled and run?
    A.  mon
    B. thu
    C. fri
    D. It will not compile.
    E. It will throw an exception at run time.
    
    ------------------------------
    Notice the statement :
        if(index == 3){
                    break;
                }else {
                    continue;
                }
        In no situation can the control go beyond this statement in the for loop.
         Therefore,  rest of the statements in the for loop are unreachable and so the code will not compile.

     correct(D)

 */
public class DaysTest{

    static String[] days = {"monday", "tuesday", "wednesday", "thursday",
                                        "friday", "saturday", "sunday" };
    
    public static void main(String[] args) {
        
        var index = 0;
        for(var day : days){
            
            if(index == 3){
                break;
            }else {
                continue;
            }
            index++;
            if(days[index].length()>3){
                days[index] = day.substring(0,3);
            }
        }
        System.out.println(days[index]);
    }
}