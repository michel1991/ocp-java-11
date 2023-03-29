package interfaces.function;
import java.util.function.*;

public class ToDoubleBiFunctionChoicesAnswers {
    /**
       Assuming the proper generic types are used, which lambda expression
        can be assigned to a ToDoubleBiFunction functional interface reference? (Choose three.)

        A. (Integer a, Double b) -> {int c; return b;}
        B. (h,i) -> (long)h
        C. (String u, Object v) -> u.length()+v.length()
        D. (x,y) -> {int z=2; return y/z;}
        E. z -> z
        F. (double y, double z) -> y + z

        To begin with, ToDoubleBiFunction˂T,U˃ takes two generic inputs and returns a double value.
        Option A is correct because it takes an Integer and Double
        and returns a Double value that can be implicitly unboxed to double.
        Option B is correct because long can be implicitly cast to double.
        While we don’t know the data types for the input arguments,
        we know that some values, such as using Integer for both, will work.
        Option C cannot be assigned and does not compile
        because the variable v is of type Object and Object does not have a length() method.
        Option D is correct.
        The variable y could be declared Double in the generic argument to the functional interface,
        making y/z a double return value.
        Option E is not correct because the lambda only has one parameter.
        Finally, option F is incorrect because the interface uses the class Double rather than primitive double.
     */
  static void choiceLambda(){
        ToDoubleBiFunction answerOne = (h,i) -> (long)h;
        ToDoubleBiFunction<Double, Integer> answerTwo = (x, y) -> {int z=2; return y/z;};
        ToDoubleBiFunction<Double, Double> answerThree = (Double y, Double z) -> y + z;
  }

    public static void main(String... args){
        choiceLambda();
    }
}