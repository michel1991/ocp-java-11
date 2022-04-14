package definingAnAnonymousClass;

public class ZooGiftShopWithInterface{
  interface SaleTodayOnly{
     int dollarsOff();
  }

    public int admission(int basePrice){
       SaleTodayOnly sale = new SaleTodayOnly(){
             public int dollarsOff(){
                 return 3;
             } 
       }; // don't forget the semicolon!
 
       return basePrice - sale.dollarsOff(); 
    }

}
