package creatingPrimitiveStreams;
import java.util.stream.*;

class CreatingPrimitiveStreamsExample{
  static void emptyDoubleStream(){
     DoubleStream empty = DoubleStream.empty();
  }

  static void doubleStreamWithValue(){
      DoubleStream  oneValue = DoubleStream.of(3.14);
      oneValue.forEach(System.out::println);
  }

   static void doubleStreamWithVarargs(){ 
      DoubleStream  varargs = DoubleStream.of(1.0, 1.1, 1.2);
      varargs.forEach(System.out::println);
  }


 public static void main(String[] args){
     System.out.println("Empty DoubleStream ");
     emptyDoubleStream();
     System.out.println();
    
     System.out.println("DoubleStream  with one value ");
     doubleStreamWithValue();
     System.out.println();

     System.out.println("DoubleStream  with one varargs ");
     doubleStreamWithVarargs();
  }
}
