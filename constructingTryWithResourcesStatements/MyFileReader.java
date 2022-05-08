package constructingTryWithResourcesStatements;

class MyFileReader implements AutoCloseable{
    private String tag;
  public MyFileReader(String tag){
      this.tag = tag;
   }
  

   @Override
   public void close(){
     System.out.println("Closed: " + tag);
   }
  
}
