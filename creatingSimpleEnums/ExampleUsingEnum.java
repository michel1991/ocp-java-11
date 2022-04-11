package creatingSimpleEnums;

class ExampleUsingEnum{
  public static void main(String[] args){
    Season s  = Season.SUMMER;
    System.out.println(Season.SUMMER); // SUMMER
    System.out.println(s == Season.SUMMER); // true
    System.out.println();

    exampleValues();
    
    System.out.println();
    retrieveEnumFromString();

    System.out.println();
    System.out.println("call method of enum");
    callEnumMethod();
  }


  public static void exampleValues(){
     for(Season season : Season.values()){
        System.out.println(season.name() + " " + season.ordinal());
     }
  }

  
  public static void retrieveEnumFromString(){
     Season s = Season.valueOf("SUMMER");
     System.out.println("retrieve enum value from  string " + s.name());
  }

  public static void callEnumMethod(){
    Season.SUMMER.printExpectedVisitors();
  }

}
