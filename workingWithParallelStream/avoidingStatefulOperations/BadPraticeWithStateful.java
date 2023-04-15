package workingWithParallelStream.avoidingStatefulOperations;
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;


public class BadPraticeWithStateful {
    public static  List<Integer> addValues(IntStream source){
        var data = Collections.synchronizedList(new ArrayList<Integer>());
        source.filter( s -> s % 2 == 0)
              .forEach(i -> { data.add(i);  }); // stateful: don't do this

        return data;
    }
    
    /**
     *  Avec un flux ordoné, l'ordre de la sortie est respecté.
     */
    static void executeWithSerialStream(){
        var list  = addValues(IntStream.range(1, 11));
        System.out.println(list);
    }
    
    /**
     * Avec un flux parallèle, l'ordre de la sortie devient aléatoire.
     */
    static void executeWithParallelStream(){
        var list  = addValues(
                IntStream.range(1, 11).parallel()
        );
        System.out.println(list);
    }
    public static void main(String[] args){
        System.out.println("execute with serial stream");
        executeWithSerialStream();
        System.out.println();

        System.out.println("execute with parallel stream");
        executeWithParallelStream();
        System.out.println();
    }
}