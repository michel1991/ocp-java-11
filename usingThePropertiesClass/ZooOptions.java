package usingThePropertiesClass;
import java.util.Properties; 

class ZooOptions{
    static void basicExample(){
       var props = new Properties();
       props.setProperty("name", "Our zoo");
       props.setProperty("open", "10am");
      
       System.out.println(props.getProperty("camel"));
       System.out.println(props.getProperty("camel", "Bob"));
       System.out.println(props.get("open"));
    }

   public static void main(String[] args){
      basicExample();
   }
}
