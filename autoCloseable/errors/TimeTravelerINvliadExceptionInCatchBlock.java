package autoCloseable.errors;

/**
  What is the output of the following application?
    A. 1235
    B. 3215
    C. 5123
    D. 5321
    E. The code does not compile.
    F. None of the above.
    
    The close() method in each of the resources throws an Exception,
    which must be handled or declared in the main() method.
    The catch block supports TimeException, but it is too narrow to catch Exception.
    Since there are no other catch blocks present
    and the main() method does not declare Exception,
    the try-with-resources statement does not compile,
    and option E is the correct answer.
    If the catch block were modified to handle Exception instead of TimeException,
    the code would compile without issue and print 3215 at runtime,
    closing the resources in the reverse order in which they were declared.
 */
class TimeException extends Exception {}
class TimeMachine implements AutoCloseable {
    int v;
    public TimeMachine(int v) {this.v = v;}
    public void close() throws Exception {
        System.out.print(v);
    } }
 class TimeTraveler {
    public static void main(String[] twelve) {
        try (var timeSled = new TimeMachine(1);
           var delorean = new TimeMachine(2);
           var tardis = new TimeMachine(3)) {
        } catch (TimeException e) {
            System.out.print(4);
        } finally {
            System.out.print(5);
        }
    } }


public class TimeTravelerINvliadExceptionInCatchBlock {
  
}