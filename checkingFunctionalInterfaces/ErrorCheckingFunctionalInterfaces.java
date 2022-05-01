package checkingFunctionalInterfaces;
import java.util.*;
import java.util.function.*;


class ErrorCheckingFunctionalInterfaces{
  public static void main(String[] args){
    Function<List<String>> ex1 = x-> x.get(0);

    UnaryOperator<Long> ex2 = (Long l) -> 3.14;

    Predicate  ex4 = String::empty;
  }
}
