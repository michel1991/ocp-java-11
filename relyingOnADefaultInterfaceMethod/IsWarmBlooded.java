package relyingOnADefaultInterfaceMethod;

public interface IsWarmBlooded{
 
  boolean haScales();
 
  default double getTemeprature(){
     return 10.0;
  }

}
