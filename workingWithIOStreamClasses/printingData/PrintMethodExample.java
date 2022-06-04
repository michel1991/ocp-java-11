package workingWithIOStreamClasses.printingData;
import java.io.*;
import workingWithIOStreamClasses.serializingData.Chimpanzee;

class PrintMethodExample{
  void sample() throws IOException{
        try( PrintWriter out = new PrintWriter("zoo.log") ) {
             out.write( String.valueOf(5) ); // Writer method
             out.print(5); // PrintWriter method
             var a = new Chimpanzee();
             out.write(a == null? "null" : a.toString() ); //Writer method
             out.print(a); // PrintWriter method
                
         }
   }

}

