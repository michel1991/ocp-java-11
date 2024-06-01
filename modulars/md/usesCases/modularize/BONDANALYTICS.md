#### You are the maintainer of a library packaged as bondanalytics.jar,
#### which is used by several groups in your company. It has the following two packages that are used by other applications:

``` java 
  com.abc.bonds
  com.abc.bonds.analytics
``` 


You want to modularize this jar but some groups have not yet modularized their applications.
How will such groups use the modularized jar?

* A. They cannot. Two versions of the jar will need to be maintained - one modularized and one old.
* B. They can remove module-info.class from your modular jar and use the jar just as before.

* C. They can use the new modular jar just like they use the old jar earlier without any changes.
    A modular jar has the same structure as the regular jar. So, any group that is running non-modular
    application can simply add the modular jar on the classpath like any other non-modular jar.

* D. They would have to use the --module-path option to use the new modular jar.

Correct(C)
