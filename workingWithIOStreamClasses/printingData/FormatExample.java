package workingWithIOStreamClasses.printingData;
class FormatExample{
  public static void main(String ...args){
      String name = "Lindsey";
     int orderId = 5;
     // Both print: Hello Lindsey, order 5 is ready
     System.out.format("Hello "+name+", order "+orderId+" is ready");
     System.out.println();
     System.out.format("Hello %s, order %d is ready", name, orderId);
   }
}
