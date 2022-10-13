public class Image{
    public int width, height;
    public void showImage() throws Exception{
      if( width < 0 || height < 0 )
	      throw new Exception("Invalid image size");
      else
	      System.out.println("1");
    }


    public static void main(String[] args){
       var image = new Image();
       image.width = -10;
       try{ 
        image.showImage();
	System.out.print("2");
       }catch(Exception e){
         System.out.print("3");
       }
       System.out.print("4");
    }
}

