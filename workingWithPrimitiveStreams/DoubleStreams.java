package workingWithPrimitiveStreams;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

/**
 * All methods below are also available for other primitives
 */
public class DoubleStreams {
   static void emptyDouble(){
       System.out.println("Begin empty stream ");
       DoubleStream  stream = DoubleStream.empty();
       stream
             .findFirst()
             .ifPresent(System.out::println);
       System.out.println("End empty stream ");
   }

    static void withValueDouble(){
       System.out.println("Begin with value");
       DoubleStream  oneValue= DoubleStream.of(3.14);
       oneValue.forEach(System.out::println);
       DoubleStream  varargs= DoubleStream.of(1.0, 1.1, 1.2);
       varargs.forEach(System.out::println);
       System.out.println("End with value");
   }

    static void infiniteToFinite(){
       System.out.println("Begin with value infinite to finite ");
       var random = DoubleStream.generate(Math::random);
       var fractions = DoubleStream.iterate(.5, (d) -> d / 2);
       random.limit(3).forEach(System.out::println);
       fractions.limit(3).forEach(System.out::println);
       System.out.println("End with value infinite to finite ");
   }

    public static void main(String... args){
       emptyDouble();
       System.out.println();
       withValueDouble();
       System.out.println();
       infiniteToFinite();
   }
}