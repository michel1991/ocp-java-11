package workingWithPrimitiveStreams;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class InstreamWrapper {
    static void range(){
        System.out.println("begin range");
        IntStream stream = IntStream.range(1, 6);
        IntConsumer display = System.out::println;
        stream.forEach(display);
        System.out.println("end range");
    }

    static void rangeClosed(){
        System.out.println("begin range closed");
        IntStream streamClosed = IntStream.rangeClosed(1, 5);
        IntConsumer display = System.out::println;
        streamClosed.forEach(display);
        System.out.println("end range closed");
    }

    public static void main(String... args){
        range();
        System.out.println();
        rangeClosed();
    }
}