package operations.unary;
public class PrintFiveAndFour {
    /**
        *  What are the outputs of the following code snippet?
            A. 5 4
            B. 14 5
            C. 4 5
            D. 16 5
            E. 14 4
            F. The code does not compile.
    
            The code compiles, so option F is incorrect.
            We start with webby having a value of 2. On line 4, we increment webby to 4 and store the same value in georgette.
            On line 5, we multiple webby by 3, resulting in a value of 12 for webby.
            Line 7 is where things get interesting, though.
            Although this might look like an equality (==) test, the assignment operator (=) is used, resulting in both variables now having the same value as georgette, which is 4.
            The return value of this assignment also has a value of 4, and since 4>3, webby is then incremented by 1.
            The final result is webby has a value of 5, and georgette has a value of 4, making option A the correct answer.
    
        */
        static void printFiveAndFour(){
            System.out.println("begin print 5 4");
            long webby = 2; // 4:
            int georgette = (int)(webby += 2); // 5:
            webby *= 3; //  6:
            if((webby = georgette)>3) ++webby; //  7:
            System.out.println(webby + " " + georgette); //  8:
            System.out.println("End print 5 4");
        }
    
    public static void main(String... args){
        printFiveAndFour();
    }
}