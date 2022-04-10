package creatingSimpleEnums;

class ExampleUsingEnum{
  public static void main(String[] args){
    Season s  = Season.SUMMER;
    System.out.println(Season.SUMMER); // SUMMER
    System.out.println(s == Season.SUMMER); // true
    System.out.println();

    exampleValues();
  }


  public static void exampleValues(){
     for(Season season : Season.values()){
        System.out.println(season.name() + " " + season.ordinal());
     }
  }

}
