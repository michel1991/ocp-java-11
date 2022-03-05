public class SampleCallGarbageCollection {
  public static void main(String[] args){
    System.out.println("before call garbage collection not guaranted to do anything"); 
    System.gc();
    System.out.println("after call garbage collection");
  }
}
