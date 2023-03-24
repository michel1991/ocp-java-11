package generics.errors;


import java.util.*; // 2:
 import java.util.function.*; //: 3:

/**
 Given the following class, how many lines contain compilation errors?
    A. None. The code compiles as is.
    B. One.
    C. Two.
    D. Three.
    E. Four.
    F. Five.

    To start with, line 5 does not compile because Function takes two generic arguments,
    not one. Second, the assignment statement on line 7 does not end with a semicolon (;),
    so it also does not compile. Finally, the forEach() method on line 10 requires a Consumer,
    not a Function, so this line does not compile. For these three reasons, option D is the correct answer.
 */
class FindMovie { // 4:
     private Function<String> printer; //   5:
    protected FindMovie() { //  6:
        printer = s -> {System.out.println(s); return s;} // 7:
    } //  8:
    void printMovies(List<String> movies) { //  9:
        movies.forEach(printer); //    10:
    } // 11:
    public static void main(String[] screen) { //    12:
        List<String> movies = new ArrayList<>(); // 13:
        movies.add("Stream 3"); //  14:
        movies.add("Lord of the Recursion"); //    15:
        movies.add("Silence of the Lambdas"); //  16:
        new FindMovie().printMovies(movies); //      17:
    } //    18:
 } //   19:


public class FindMovieFindErrors {

}