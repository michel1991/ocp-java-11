package operations.switchs;

public class SwitchOperations {
    /**
    * What is the output of the following code snippet?
        A. -1
        B. 0
        C. 1
        D. 2
        E. 3
        F. The code does not compile
        
        The code does compile without issue, so option F is incorrect.
        The viola variable created on line 8 is never used and can be ignored.
        If it had been used as the case value on line 15, it would have caused a compilation error since it is not marked final.
        Since "violin" and "VIOLIN" are not an exact match, the default branch of the switch statement is executed at runtime.
        This execution path increments p a total of three times, bringing the final value of p to 2 and making option D the correct answer.
     */
   static void printTwo(){
       String instrument = "violin"; // 6:
       final String CELLO = "cello"; // 7:
       String viola = "viola"; //  8:
       int p = -1; //   9:
       switch(instrument) { //  10:
           case "bass" : break; //  11:
           case CELLO : p++; //  12:
           default: p++; //   13:
           case "VIOLIN": p++; //  14:
           case "viola" : ++p; break; //   15:
       } //    16:
       System.out.print(p); // 17:
   }

    public static void main(String... args){
        printTwo();
    }
}