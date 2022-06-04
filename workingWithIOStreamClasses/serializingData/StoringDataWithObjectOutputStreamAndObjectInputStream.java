package workingWithIOStreamClasses.serializingData;
import java.io.*;
import java.util.*;

class StoringDataWithObjectOutputStreamAndObjectInputStream{
  void saveToFile(List<Gorilla> gorillas, File dataFile) throws IOException{
       try (
              var out = new ObjectOutputStream(
                 new BufferedOutputStream(
                      new FileOutputStream(dataFile)
                 )
             )
        ){
             for(Gorilla gorilla : gorillas)
                out.writeObject(gorilla);
       } // try-resource
  }
}
