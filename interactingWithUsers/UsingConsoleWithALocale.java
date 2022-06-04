package interactingWithUsers;
import java.io.*;
import java.util.*;

class UsingConsoleWithALocale{
  public static void main(String[] args){
      Console console = System.console();
      console.writer().format( new Locale("fr", "CA"), "Hello world");
  }
}
