#### Given the following three class declarations, which sets of access modifiers can be inserted,
#### in order, into the following blank lines that would allow
#### all of the classes to compile? (Choose three.)

```java
    // Alarm.java
    package wake;
    public class Alarm {
        ________ static int clock;
        ________ long getTime() {return clock;}
    }
    
    // Coffee.java
    package wake;
    public class Coffee {
        private boolean bringCoffee() {
            return new Alarm().clock < 10;
        }
    }

    // Snooze.java
    package sleep;
    public class Snooze extends wake.Alarm {
        private boolean checkTime() { return getTime() > 10;}
    }
```


* A. package-private (blank) and package-private (blank)
* B. package-private (blank) and protected
* C. protected and package-private (blank)
* D. protected and protected
* E. private and public
* F. public and public

The clock variable is accessed by a class in the same package; therefore,
it requires package-private or less restrictive access (protected and public).
The getTime() method is accessed by a subclass in a different package; therefore,
it requires protected or less restrictive access (public).
Options B, D, and F conform to these rules, making them the correct answer.
Options A and C cause the Snooze class to fail to compile because the getTime() method
is not accessible outside the package, even though Snooze is a subclass of Alarm.
Option E causes the Coffee class to fail to compile because the clock variable
is only visible within the Alarm class.