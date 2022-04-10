package creatingSimpleEnums;

class ExampleUsingEnum{
  public static void main(String[] args){
    Season s  = Season.SUMMER;
    System.out.println(Season.SUMMER); // SUMMER
    System.out.println(s == Season.SUMMER); // true
  }
}
