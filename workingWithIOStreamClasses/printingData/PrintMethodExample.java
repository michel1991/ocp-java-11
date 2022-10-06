package workingWithIOStreamClasses.printingData;
import java.io.*;
import workingWithIOStreamClasses.serializingData.Chimpanzee;

class PrintMethodExample{
  static void saveToFile() throws IOException{
	 String fullPath = System.getProperty("user.dir") + "/workingWithIOStreamClasses/printingData"+ "/print-method-example.txt";  
        try( PrintWriter out = new PrintWriter(fullPath)  ) {
             out.write( String.valueOf(5) ); // Writer method
             out.print(5); // PrintWriter method
             var a = new Chimpanzee();
             out.write(a == null? "null" : a.toString() ); //Writer method
             out.print(a); // PrintWriter method
                
         }
   }

  public static void main(String...args) throws IOException{
      saveToFile();
  }

}

