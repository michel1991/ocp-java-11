package constructingTryWithResourcesStatements;

class CustomReaderMyFileReader{
  public static void main(String[] args){
     try( var bookReader = new MyFileReader("monkey") ) {
          System.out.println("Try Block ");
     }finally{
        System.out.println("Finally Block");
     } 
  }
}
