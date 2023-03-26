package stream.groups;

import java.util.*;
import java.util.stream.*;

/**
   What is a possible output of the following application?

        A. {1975=[Escort], 1967=[ Mustang, Thunderbird]}
        B. {Escort=[1975], Thunderbird=[1967], Mustang=[1967]}
        C. The code does not compile.
        D. The code hangs indefinitely at runtime.
        E. The application throws an exception at runtime because the stream is not parallel.
        F. None of the above.

       The code compiles and runs without issue.
       The JVM will fall back to a single-threaded process
       if all of the conditions for performing the parallel reduction are not met.
       The stream used in the main() method is not parallel, but the groupingByConcurrent()
       method can still be applied without throwing an exception at runtime.
       Although performance will suffer from not using a parallel stream,
        the application will still process the results correctly.
         Since the process groups the data by year, option A is the correct answer.
 */
class Car {
    private String model;
    private int year;
    @Override public String toString() {return model;}
    // Constructor/Getters/Setters Omitted
    Car(String model , int year){
      this.model = model;
      this.year = year;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return this.year;
    }

    public static void main(String... make) {
        var cars = new ArrayList<Car>();
        cars.add(new Car("Mustang",1967));
        cars.add(new Car("Thunderbird",1967));
        cars.add(new Car("Escort",1975));
        var map = cars
         .stream()
         .collect(
                 Collectors.groupingByConcurrent(Car::getYear));
        System.out.print(map);
    }
}

public class CarGroupingByConcurrent {

}