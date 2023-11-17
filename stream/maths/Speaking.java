
package stream.maths;

import static java.util.stream.Collectors.*;
import java.util.stream.Stream;

/**
 * What is the result of the following?
     A. 2
    B. 18
    C. 19
    D. 110
    E. The code does not compile.

    This code compiles. It creates a stream of Ballot objects.
    Then it creates a map with the contestant’s name
    as the key and the sum of the scores as the value.
    For Mario, this is 10 + 9, or 19, so option C is correct.
 */
class Ballot {
    private String name;
    private int judgeNumber;
    private int score;

    public Ballot(String name, int judgeNumber, int score) {
        this.name = name;
        this.judgeNumber = judgeNumber;
        this.score = score;
    }
    // all getters and setters

    public String getName(){
        return name;
    }

    public int getJudgeNumber(){
        return  judgeNumber;
    }

    public int getScore(){
        return  score;
    }
}

public class Speaking {
    public static void main(String[] args) {
        Stream<Ballot> ballots = Stream.of(
                new Ballot("Mario", 1, 10),
                new Ballot("Christina", 1, 8),
                new Ballot("Mario", 2, 9),
                new Ballot("Christina", 2, 8)
        );

        var scores = ballots.collect(
                groupingBy(Ballot::getName,
                           summingInt(Ballot::getScore)));
        System.out.println(scores.get("Mario"));
    }
   
}