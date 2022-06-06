package interactingWithPaths;
import java.nio.file.*;

class CheckingPathTypeWith{
 
  static void currentWorking(){
    System.out.println("current working directory " + System.getProperty("user.dir"));
  }
 
  static void checkingOnWindows(){
    var path1 = Paths.get("C:\\birds\\egret.txt");
    System.out.println("Path1 is Absolute? " + path1.isAbsolute()); 
    System.out.println("Absolute Path1  " + path1.toAbsolutePath());
 }

 static void checkingOnLinux(){
    var path2 = Paths.get("birds/condor.txt");
    System.out.println("Path2 is Absolute? " + path2.isAbsolute());
    System.out.println("Absolute Path2  " + path2.toAbsolutePath());
 }

  public static void main(String... args){
    currentWorking();
    checkingOnLinux();
  }

  

}
