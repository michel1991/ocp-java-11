public class InstanceOfHowManyObjectCreated{
  public static void main(String[] args){
    Integer zooTime = Integer.valueOf(9);
    Number num = zooTime;
    Object obj = zooTime;
   System.out.println("we only have one object created with three references point to it");
  }

}
