package security;
import java.util.*;

/**
  You’ve been hired by Charlie Sweets to perform a security audit of their login system.
   After reviewing the following code, what recommendations
   would best improve the security of their system? (Choose three.)
    A. Mark the check() method final on line 2.
    B. Remove the null check on line 7.
    C. Rewrite to not use var on lines 6, 8, and 9, as it is inherently unsafe.
    D. Rewrite to use readPassword() on line 8.
    E. Rewrite to use readPassword() on line 9.
    F. Change or remove line 10.

    A malicious attacker could extend this class and override the security check() method,
    so marking it final is a good idea, making option A correct.
    Next, theConsoleclass offers a readPassword()
    method that does not echo what the user types and uses char[] instead
    of String to avoid a password entering the String pool. For these reasons,
    option E is correct. Finally, line 10 prints the user’s password to the System.out log file,
    which is a terrible security idea. It should be changed or removed, making option F correct.
    The rest of the options are incorrect and do not improve the security of this class.

 */
 class CandyFactory { // 1:
    boolean check(String username, String password) { //  2: 
        // IMPLEMENTATION OMITTED //    3:
        return true; // default implementation
    } //  4: 
    public void login() { //  5: 
        var c = System.console(); //  6:  
        if(c != null) { //  7:
            var username = c.readLine("Username: "); //    8:  
            var password = c.readLine("Password: "); //   9:  
            System.out.println("["+username+","+password+"]"); // 10: 
            System.out.println(check(username,password) //  11: 
                                                       ? "Here is your candy" // 12:  
           : "No candy for you"); // 13:  
        } } } //    14: 


public class CandyFactoryImproveSecurity {
  
}