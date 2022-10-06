package workingWithIOStreamClasses.printingData;
import java.io.*;

class SamplePrinterProgram{
  void sample() throws IOException{
	  String fullPath = System.getProperty("user.dir") + "/workingWithIOStreamClasses/printingData"+ "/zoo-sample-printwriter-program.txt";   
        File source = new File(fullPath);
        try( 
            var out = new PrintWriter(
               new BufferedWriter (
                   new FileWriter(source)
               )
            )
        ){
             out.print("Today's weather is: ");
             out.print("Sunny");
             out.print("Today's temperature at the zoo is:");
             out.print(1 / 3.0);
             out.println('C');
             out.format("It has rained %5.2f inches this year %d", 10.2, 2021);
             out.println();
            out.printf("It may rain %s more inches this year", 1.2);
         }
   
    }


  public static void main(String... args) throws IOException{
     SamplePrinterProgram writer = new SamplePrinterProgram();
     writer.sample();
  }
}
