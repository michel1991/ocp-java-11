public class TooManyConversions{
  public static void play(Long l){
     
  }

  public static void play(Long... l){

  }

  public static void main(String[] args){
    play(4); // does not compile
    play(4L);
  }
}
