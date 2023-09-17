package exceptions.handled;
/**
* What is the output of the following program?
    A. 124
    B. 234
    C. 34
    D. 3 and a stack trace for Exception
    E. 34 and a stack trace for Exception
    F. The code does not compile.

  The showImage() method is invoked on line 12 on an Image object with a negative width.
  This causes an Exception to be thrown on line 5 and caught on line 14, with 3 being printed on line 15.
  Next, 4 is printed on line 17. No stack trace is dumped because the exception was handled.
  Since the final output is 34, option C is the correct answer.

 */
public class Image{ // 1:
    public int width, height; // 2
    public void showImage() throws Exception{ //3
      if( width < 0 || height < 0 ) //4
	      throw new Exception("Invalid image size"); //5
      else System.out.println("1"); //6
    } //7
    public static void main(String[] args){ //8
       var image = new Image(); //9
       image.width = -10; // 10
       try{ //11
           image.showImage(); //12
           System.out.print("2"); //13
       }catch(Exception e){ //14
           System.out.print("3"); //15
       } //16
       System.out.print("4"); //17
    } //18
}

