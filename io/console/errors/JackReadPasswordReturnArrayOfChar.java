package io.console.errors;
import java.io.*;

public class JackReadPasswordReturnArrayOfChar {
    /**
      Consider the following code :

          String id = c.readLine("%s", "Enter UserId:"); //1
        System.out.println("userid is " + id); //2
        String pwd = c.readPassword("%s", "Enter Password :"); //3
        System.out.println("password is " + pwd); //4
        
        Assuming that c is a valid reference to java.io.Console
        and that a user types jack as userid and jj123 as password, what will be the output on the console?
        
       A.
            Enter UserId:jack
            userid is jack
            Enter Password :
            password is jj123
            
       B.
            Enter UserId:jack
            userid is jack
            Enter Password :*****
            password is jj123
            
       C.
            Enter UserId:jack
            userid is jack
            Enter Password :
            password is ****
            
       D.
            Enter UserId:jack
            userid is jack
            Enter Password : password is jj123

       E. t will not compile.
                Note that the return type of readPassword is char[] and not a String. So it will not compile.
     
     -------------------------------
     If you replace String pwd to char[] pwd, you will get the following output:

            Enter UserId:jack
            userid is jack
            Enter Password :
            password is [C@1fb8ee3
            
            Observe that password is not echoed while the user is typing and char[] is an object, which is printed out as [C@1fb8ee3.
      Correct(E)
     */
    public static void main(String... args){
        Console c = System.console();
        String id = c.readLine("%s", "Enter UserId:"); //1
        System.out.println("userid is " + id); //2
        String pwd = c.readPassword("%s", "Enter Password :"); //3
        System.out.println("password is " + pwd); //4
    }
}