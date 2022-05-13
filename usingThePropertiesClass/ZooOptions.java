package usingThePropertiesClass;
import java.util.Properties; 

class ZooOptions{
    static void basicExample(){
       var props = new Properties();
       props.setProperty("name", "Our zoo");
       props.setProperty("open", "10am");

    }

   public static void main(String[] args){
      basicExample();
   }
}
