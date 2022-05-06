package mappingStreams;
import java.util.stream.*;

class BasicExampleMappingStreams{
  static void basicExample(){
     Stream<String> objStream = Stream.of("penguin", "fish");
     IntStream intStream = objStream.mapToInt( s -> s.length() );
     intStream.forEach(System.out::println);
  }

  public static void main(String[] args){
    System.out.println("length of string ");
    basicExample();
    System.out.println();
  }

}
