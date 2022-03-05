import java.util.Date;
public class SampleJavaTypeCalledReference{
  public static void main(String[] args){
    String greeting = "toto";
    String anotherGreeting = greeting;
    Date today = new Date();
    System.out.println("today is " + today);
    System.out.println("assign value to reference using another reference first=" + greeting + " second="+ anotherGreeting);
  }
}
