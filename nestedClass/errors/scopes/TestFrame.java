package nestedClass.errors.scopes;

import java.awt.*;
import java.awt.event.*;

/**
  Consider the following class...
   What will happen when you attempt to compile and run the program?
   
    NOTE: Although this question uses classes from the AWT package, it is not about those class.
    You may see exam questions referring to classes that are not on the exam objectives.
    If you see such classes, you can safely assume that the question is not about them.
    
    A. It will not compile because the variable s is not accessible from the inner class.
    B. It will compile but not show anything when run.
    C. It will compile and show a very small Frame.
    D. It will compile and show a frame big enough to display the button.
    E. It will not compile because of incorrect usage of var.
        Both t and b are local variables. They can be declared using var.
        
   -------------------
     It will not compile because member variable 's' is not accessible from the inner class.
     This is because the inner class is created in a static method, and so, it does not have any reference to TestFrame object.
     Precise message is:
     
    TestFrame.java:30: non-static variable s cannot be referenced from a static context
    System.out.println("Message is " +s);
    ^
    1 error
     Correct (A)

    
 */
class TestFrame extends Frame
{
    String s="Message";
    public static void main(String args[])
    {
        var t = new TestFrame();
        var b = new Button("press me");
        b.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                System.out.println("Message is " +s);
                            }
                        }
                            );
        t.add(b);
    }
}
