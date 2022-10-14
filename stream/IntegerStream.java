package stream;
import java.util.stream.*;

class IntegerStream{
    public static void mapToObject(){
       var x = IntStream.rangeClosed(1,  5)
                        .mapToObj( i -> i)
			.collect(Collectors.toList())
	       ;
       System.out.println( x );

    }


    public static void main(String... args){
       mapToObject();
    }
}
