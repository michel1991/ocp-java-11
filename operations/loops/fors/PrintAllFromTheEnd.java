package operations.loops.fors;
public class PrintAllFromTheEnd {
    /**
        Assuming weather is a well-formed nonempty array, which code snippet, when inserted independently into the blank in the following code,
        prints all of the elements of weather? (Choose all that apply.)

        A. int i=weather.length; i>0; i--
        B. int i=0; i<=weather.length-1; ++i
        C. var w : weather
        D. int i=weather.length-1; i>=0; i--
        E. int i=0, int j=3; i<weather.length; ++i
        F. int i=0; ++i<10 && i<weather.length;
        G. None of the above

       Option A is incorrect because on the first iteration it attempts to access weather[weather.length] of the nonempty array,
       which causes an ArrayIndexOutOfBoundsException to be thrown.
       Option B is correct and will print the elements in order.
       It is only a slight modification of a common for loop, with i<weather.length replaced with an equivalent i<=weather.length-1.
       Option C is incorrect because the snippet creates a compilation problem in the body of the for loop, as i is undefined in weather[i].
       For this to work, the body of the for-each loop would have to be updated as well.
       Option D is also correct and is a common way to print the elements of an array in reverse order.
       Option E does not compile and is therefore incorrect. You can declare multiple elements in a for loop,
        but the data type must be listed only once, such as in for(int i=0, j=3; ...).
        Finally, option F is incorrect because the first element of the array is skipped.
        The loop update operation is optional, so that part compiles, but the increment is applied as part of the conditional check for the loop.
      Since the conditional expression is checked before the loop is executed the first time, the first value of i used inside the body of the loop will be 1.
     */
    private static void printAllElementNotConsideringOrder(int[] weather) {
        System.out.println(" Begin  printAllElementNotConsideringOrder ");
        for(int i=weather.length-1; i>=0; i-- ) { // __________________
            System.out.println(weather[i]);
        }
        System.out.println(" End  printAllElementNotConsideringOrder ");
    }
    
    public static void main(String... args){
        
    }
}