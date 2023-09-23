package stream.complex;
import java.util.stream.*;

/**
* The code compiles and runs without issue, so options C, D, E, and F are incorrect.
* The collect() operation groups the animals into those that do and do not start with the letter p.
* Note that there are four animals that do not start with the letter p and three animals that do.
* The logical complement operator (!) before the startsWith() method means that results are reversed,
* so the output is 3 4 and option A is correct, making option B incorrect.
 */
public class StreamWithStream {
  public static void grouping(){
      var cats = Stream.of("leopard", "lynx", "ocelot", "puma").parallel();
      var bears = Stream.of("panda","grizzly","polar").parallel();
      var data = Stream.of(cats,bears)
                       .flatMap(s -> {
                           return s;
                       })
                       .collect(
                               Collectors.groupingByConcurrent(s -> !s.startsWith("p"))
                        )
      ;
      System.out.println(data.get(false).size()+ " " + data.get(true).size());
  }

    public static void main(String... args){
      System.out.println(StreamWithStream.class);
      grouping();
    }
}