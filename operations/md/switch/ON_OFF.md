#### Assuming the following enum declaration and a variable s of type Switch, identify valid code fragments.
public enum Switch{ ON, OFF }

* A.
 ```
    if( s == Switch.OFF) { System.out.println("It is off!"); }
 ```
------
Enums can be compared using ==.

* B.
 ```
    if( s.equals(Switch.OFF)) { System.out.println("It is off!"); }
 ```

* C.
 ```
     switch(s)
    {
     case Switch.OFF : System.out.println("It is off!"); break;
    }
 ```

---------------------------
An enum switch case label must be the unqualified name of an enumeration constant. So it should be:
case OFF instead of case Switch.OFF.

* D.
 ```
      switch(s)
    {
        case OFF : System.out.println("It is off!"); break;
    }
 ```

* E.
  ```
  while(s)
    {
        System.out.println("It is off!");
    }

  ```

-----------
   while condition expects a boolean and s is not a boolean.

* F.
  ```
  switch(s)
    {
        case Switch.OFF.valueOf() : System.out.println("It is off!"); break;
    }
  ```

* G.
  ```
  switch(s)
    {
        case OFF.toString() : System.out.println("It is off!"); break;
    }
  ```

------
1. The type of the case value must match with the type of the switch expression. Here, type of the switch expression is Switch enum,
while the type of OFF.toString is String.
2. The case value should be a compile time constant. You cannot have method calls as case labels.

Correct(A, B, D)
