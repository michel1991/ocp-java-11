package io.console.errors;
import java.io.*;
import java.util.*;

/**
 * What is the result of compiling and executing the following program?
    A. The code does not compile.
    B. The code compiles and prints a NullPointerException at runtime.
    C. The code compiles but does not print anything at runtime.
    D. The code compiles and prints the value the user enters at runtime.
    E. The behavior cannot be determined until runtime.
    F. None of the above.

    The constructor for Console is private.
    Therefore, attempting to call new Console() outside the class results in a compilation error,
    making option A the correct answer.
    The correct way to obtain a Console instance is to call System.console().
    Even if the correct way of obtaining a Console had been used,
    and the Console was available at runtime, stuff is null in the printItinerary() method.
    Referencing stuff.activities results in a NullPointerException.
 */
public class Itinerary {
    private List<String> activities = new ArrayList<>();
    private static Itinerary getItinerary(String name) {
        return null;
    }
    public static void printItinerary() throws Exception {
        Console c = new Console();
        final String name = c.readLine("What is your name?");
        final var stuff = getItinerary(name);
        stuff.activities.forEach(s -> c.printf(s));
    }
    public static void main(String[] h) throws Exception {
        printItinerary();
    }
}
public class ItineraryConsolePrivateConstructor {

}