package mappingStreams;
import java.util.stream.*;

class TemplateCreateStreamFromPrimitiveStream{
  private static Stream<Integer> mapping(IntStream stream){
      return stream.mapToObj( x -> x);
   }


   private static Stream<Integer> boxing(IntStream stream){ 
      return stream.boxed();
   }
  
}
