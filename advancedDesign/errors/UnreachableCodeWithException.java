package advancedDesign.errors;
import java.io.*;

public class UnreachableCodeWithException {
    public void ohNo(IOException ie)  throws Exception {
          throw new FileNotFoundException();
          System.out.println(ie);
      }

    public static void main(String... args){

    }
}