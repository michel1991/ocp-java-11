public class ErrorCallingParentConstructorManyTime{
    public ErrorCallingParentConstructorManyTime(){
       super();
       System.out.println("Call many time, Zoo created ");
       super(); // does not compile
    }
}
