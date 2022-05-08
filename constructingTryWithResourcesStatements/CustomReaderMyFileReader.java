package constructingTryWithResourcesStatements;

class CustomReaderMyFileReader{

  static void oneResourceDeclaration(){
       try( var bookReader = new MyFileReader("monkey") ) {
          System.out.println("Try Block ");
      }finally{
        System.out.println("Finally Block");
     }
  }

    static void manyResourceDeclaration(){ 
       try( var bookReader = new MyFileReader("1");
            var movieReader = new MyFileReader("2");
            var tvReader = new MyFileReader("3");
         ) {
          System.out.println("Try Block ");
      }finally{
        System.out.println("Finally Block");
     }
  }

  public static void main(String[] args){
     System.out.println("One Resource Declaration ");
     oneResourceDeclaration();
     System.out.println(); 
     System.out.println("Many Resource Declaration ==> close resource in inverse order of the declaration ");
      manyResourceDeclaration();
  }

}
