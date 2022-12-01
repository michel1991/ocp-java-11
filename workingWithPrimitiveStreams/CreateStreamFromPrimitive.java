package workingWithPrimitiveStreams;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class CreateStreamFromPrimitive {
   static Stream<Integer> mapping(IntStream stream) {
       IntFunction<Integer> mapping = Integer::valueOf;
       return stream.mapToObj(mapping);
   }

    static Stream<Integer> boxing(IntStream stream) {
       IntFunction<Integer> mapping = Integer::valueOf;
       return stream.boxed();
   }

    public static void main(String... args){
       System.out.println("below using mapObj function ");
       IntStream streamForMapping = IntStream.of(1, 5, 8, 9);
        mapping(streamForMapping)
           .forEach(System.out::println);

        System.out.println();
        System.out.println("below boxing ");
        IntStream streamForBoxing= IntStream.of(6, 8, 16);
        boxing(streamForBoxing)
        .forEach(System.out::println);
   }
}