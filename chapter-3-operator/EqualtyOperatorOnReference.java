import java.io.*;
public class EqualtyOperatorOnReference{
  public static void main(String[] args){
    File monday = new File("schedule.txt");
    File tuesday =  new File("schedule.txt");
    File wednesday = tuesday;
   System.out.println(monday == tuesday);
   System.out.println(tuesday == wednesday);
  }
}
