### dentify the correct statements regarding DateFormat and NumberFormat classes.

* A. They allow you to format a date or a number into a string but not vice-versa.
 They have parse(String) method that allows you to covert a string into a Date or a Number.

* B. You can set the Locale after constructing a DateFormat or a NumberFormat object and before using it to do country specific formatting.
Locale is specified only while creating these objects. Once created, you cannot change/set their Locale.

* C. The following line of code will work on a machine in any locale :
``` txt
  double x = 12345.123; String str = NumberFormat.getInstance().format(x);

    If you don't pass a Locale in getInstance() methods of NumberFormat and DateFormat, they are set to default Locale of the machine.
    If you run this code on a French machine, it will format the number in French format ( 12 345,123 )
    and if you run it on a US machine, it is format the number in US format ( 12,345.123 ).
```


* D.
NumberFormat should not be used for negative values.
It can be used for any value
* E. None of these.

Correct(C)
